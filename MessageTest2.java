import org.junit.Test;

import junit.framework.Assert;

public class MessageTest2 {
	@Test
	public void testMessage()
	{
		Message m=new Message();
		String expected="Hello";
		Assert.assertEquals(expected, m.printWithPrefix());
	}
}
