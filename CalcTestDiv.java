import org.junit.Test;

import junit.framework.Assert;

public class CalcTestDiv {
	@Test
	public void testCalcDivValid()
	{
		System.out.println("Testing Div");
		Calc c=new Calc();
		int exp=12;
		int act=c.calcDiv(120, 10);
		Assert.assertEquals(exp, act);
	}
	@Test(expected= ArithmeticException.class)
	public void testCalcDivException()
	{
		System.out.println("Expecting Exception");
		Calc c=new Calc();
		c.calcDiv(12, 0);
	}
}
