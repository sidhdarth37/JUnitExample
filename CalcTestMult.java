import org.junit.Test;

import junit.framework.Assert;

public class CalcTestMult {
	@Test
	public void testCalcMult()
	{
		System.out.println("Testing Mult");
		Calc c=new Calc();
		int exp=120;
		int act=c.calcMult(12, 10);
		Assert.assertEquals(exp, act);
	}
	
	@Test
	public void testCalcMultByZero()
	{
		System.out.println("Testing Mult by 0");
		Calc c=new Calc();
		int exp=0;
		int act=c.calcMult(12, 0);
		Assert.assertEquals(exp, act);
	}
	
	@Test(expected= ArithmeticException.class)
	public void testCalcMultLarge()
	{
		System.out.println("Testing Mult for large values");
		Calc c=new Calc();
		c.calcMult(100000, 100000009);
	}
}
