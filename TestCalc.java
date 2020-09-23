package emp;

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
