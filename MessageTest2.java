import org.junit.Test;

import junit.framework.Assert;

public class MessageTest2 {
	@Test(timeout=3000)
	public void testMessage() throws InterruptedException
	{
		Message m=new Message();
		String expected="Hello";
		Assert.assertEquals(expected, m.printWithPrefix());
	}
}
