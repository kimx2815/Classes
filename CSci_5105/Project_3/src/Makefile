all: peer tsvc latency_mat_gen
peer: peer.cpp
	g++ -lpthread -o peer peer.cpp
tsvc: tsvc.cpp
	g++ -w tsvc.cpp -pthread -o tsvc
latency_mat_gen: latency.cpp
	g++ -o latency_mat_gen latency.cpp
