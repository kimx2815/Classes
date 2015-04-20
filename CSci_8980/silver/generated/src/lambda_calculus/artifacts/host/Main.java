
package lambda_calculus.artifacts.host;

public class Main {
	public static void main(String[] args) {
		lambda_calculus.artifacts.host.Init.initAllStatics();
		lambda_calculus.artifacts.host.Init.init();
		lambda_calculus.artifacts.host.Init.postInit();
		try {
			common.Node rv = (common.Node) lambda_calculus.artifacts.host.Pmain.invoke(cvargs(args), null);
			common.DecoratedNode drv = rv.decorate(common.TopNode.singleton, (common.Lazy[])null);
			drv.synthesized(core.Init.core_io__ON__core_IOVal); // demand the io token
			System.exit( (Integer)drv.synthesized(core.Init.core_iovalue__ON__core_IOVal) );
		} catch(Throwable t) {
			Throwable rt = common.exceptions.SilverException.getRootCause(t);
			if(rt instanceof common.exceptions.SilverExit)
				System.exit(((common.exceptions.SilverExit)rt).getExitCode());
			common.Util.printStackCauses(t);
		}
	}
	public static common.ConsCell cvargs(String[] args) {
		common.ConsCell result = common.ConsCell.nil;
		for(int i = args.length - 1; i >= 0; i--) {
			result = new common.ConsCell(new common.StringCatter(args[i]), result);
		}
		return result;
	}
}