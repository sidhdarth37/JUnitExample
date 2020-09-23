import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class VoidMethodTest {
	
	VoidMethodClass p=new VoidMethodClass();
	
	@Test
	public void testAddMethod()
	{
		p.addPerson("D");
		int expected=4;
		Assert.assertEquals(expected,p.size());
	}
	
	@Test
	public void testRemoveWorking() {
		p.removePerson("A");
		int expected = 2;
		Assert.assertEquals(expected,p.size());
	}
	
	@Test(expected = NoSuchElementException.class)
	public void testRemoveException()
	{
		p.removePerson("E");
	}
	
	@Before
	public void init()
	{
		p.addPerson("A");
		p.addPerson("B");
		p.addPerson("C");
	}
	
	@After
	public void destroy() {
		p.removeAll();
	}
}
