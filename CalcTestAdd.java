import org.junit.Test;

import junit.framework.Assert;

public class CalcTestAdd {
	@Test
	public void testCalcSum()
	{
		System.out.println("Testing Sum");
		Calc c=new Calc();
		int exp=15;
		int act=c.calcSum(8, 7);
		Assert.assertEquals(exp, act);
	}
}
