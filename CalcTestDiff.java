import org.junit.Test;

import junit.framework.Assert;

public class CalcTestDiff {
	@Test
	public void testCalcDiff()
	{
		System.out.println("Testing Diff");
		Calc c=new Calc();
		int exp=3;
		int act=c.calcDiff(10, 7);
		Assert.assertEquals(exp, act);
	}
}
