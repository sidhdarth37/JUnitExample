import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class CalcSuiteRunner {
	public static void main(String[] args) {
		Result res=JUnitCore.runClasses(CalcTestSuite.class);
		System.out.println();
		System.out.println("Failures:");
		
		for( Failure fail : res.getFailures())
		{
			System.out.println(fail.toString());
		}
		System.out.println("Success  :  "+res.wasSuccessful());
	}
}
