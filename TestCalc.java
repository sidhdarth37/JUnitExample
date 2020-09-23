

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class TestCalc {
	
	@Test
	public void testCalcSum()
	{
		System.out.println("Testing Sum");
		Calc c=new Calc();
		int exp=15;
		int act=c.calcSum(8, 7);
		Assert.assertEquals(exp, act);
	}
	
	@Test
	public void testCalcDiff()
	{
		System.out.println("Testing Diff");
		Calc c=new Calc();
		int exp=3;
		int act=c.calcDiff(10, 7);
		Assert.assertEquals(exp, act);
	}
	
	@Test
	public void testCalcDivValid()
	{
		System.out.println("Testing Div");
		Calc c=new Calc();
		int exp=12;
		int act=c.calcDiv(120, 10);
		Assert.assertEquals(exp, act);
	}
	
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
		int act=c.calcMult(1000000007, 100000009);
	}
	
	@Test(expected= ArithmeticException.class)
	public void testCalcDivException()
	{
		System.out.println("Expecting Exception");
		Calc c=new Calc();
		c.calcDiv(12, 0);
	}
	
	@Before
	public void beforeMethod() {
		System.out.println("Before the test");
	}
	
	@After
	public void afterMethod() {
		System.out.println("After the test");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
}
