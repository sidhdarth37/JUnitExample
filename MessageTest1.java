import org.junit.Test;

import junit.framework.Assert;

public class MessageTest1 {
	@Test
	public void testMessage()
	{
		Message m=new Message();
		String expected="Hi Hello";
		Assert.assertEquals(expected, m.print());
	}
}
