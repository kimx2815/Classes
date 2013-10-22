package edu.umn.cs.recsys.uu;

import org.grouplens.lenskit.basic.AbstractItemScorer;
import org.grouplens.lenskit.data.dao.ItemEventDAO;
import org.grouplens.lenskit.data.dao.UserEventDAO;
import org.grouplens.lenskit.data.event.Rating;
import org.grouplens.lenskit.data.history.History;
import org.grouplens.lenskit.data.history.RatingVectorUserHistorySummarizer;
import org.grouplens.lenskit.data.history.UserHistory;
import org.grouplens.lenskit.vectors.MutableSparseVector;
import org.grouplens.lenskit.vectors.SparseVector;
import org.grouplens.lenskit.vectors.VectorEntry;

import javax.annotation.Nonnull;
import javax.inject.Inject;

/**
 * User-user item scorer.
 * @author <a href="http://www.grouplens.org">GroupLens Research</a>
 */
public class SimpleUserUserItemScorer extends AbstractItemScorer {
    private final UserEventDAO userDao;
    private final ItemEventDAO itemDao;
    
    private static final int NEIGHBOR = 30 ;
    
    @Inject
    public SimpleUserUserItemScorer(UserEventDAO udao, ItemEventDAO idao) {
        userDao = udao;
        itemDao = idao;
    }

    @Override
    public void score(long user, @Nonnull MutableSparseVector scores) {
        SparseVector userVector = getUserRatingVector(user);
        double meanUser = userVector.mean();
        double score ;

        // This is the loop structure to iterate over items to score
        for (VectorEntry e: scores.fast(VectorEntry.State.EITHER)) {
            long itemNo = e.getKey();
            List<Neighbor> neighbors = findNearNeighbor(itemNo, user, userVector, NEIGHBOR);
            score = score(meanUser, itemNo, neighbors);
            
            scores.set(e,score);

            
        }
    }

    /**
     * Get a user's rating vector.
     * @param user The user ID.
     * @return The rating vector.
     */
    private SparseVector getUserRatingVector(long user) {
        UserHistory<Rating> history = userDao.getEventsForUser(user, Rating.class);
        if (history == null) {
            history = History.forUser(user);
        }
        return RatingVectorUserHistorySummarizer.makeRatingVector(history);
    }
    
    private class Neighbor {
        public final long userNo;
        public final SparseVector userRate;
        public final double simscore; //similarity value
    }
    
    /**
     * Get User similarity mentioned in lecture 
     * @param user1 userNo 1
     * @param user2 userNo 2
     * @return cosine similarity
     */
     private double computeUserSimilarity(long user1, long user2) {
         CosineVectorSimilarity cosineVector = new CosineVectorSimilarity();
         SparseVector sv1 = getUserRatingVector(user1);
         SparseVector sv2 = getUserRatingVector(user2);
         
         MutableSparseVector msv1 = sv1.mutableCopy();
         MutableSparseVector msv2 = sv2.mutableCopy();
         msv1.add(-1*sv1.mean());
         msv2.add(-1*sv2.mean());

         return cosineVector.similarity(sv1, sv2);
     }
     
     //pu,i=μu+∑v∈N(u;i)s(u,v)(rv,i−μv)∑v∈N(u;i)|s(u,v)|
     
    /**
     * ∑v∈N(u;i)s(u,v)(rv,i−μv)
     * @param neighbors
     * @param itemNo
     * @return result   
     */
    private double getNumerator(List<Neighbor> neighbors, long itemNo )
    {
            double result = 0;
            for(Neighbor n : neighbors) {
                    double rating = n.userRating.get(itemNo, 0);
                    result = result + n.similarity * (rating - n.getMean());
            }
            return result;
    }
    
    
     
}
