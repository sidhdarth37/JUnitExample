import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class CalcAppTester {
	@Mock
	CalcService cs;
	
	@InjectMocks
	CalcApp ca=new CalcApp();
	
	@Test
	public void test()
	{
		Mockito.when(cs.add(12,14)).thenReturn(26);
		int act=ca.add(12,14);
		int exp=26;
		Assert.assertEquals(exp, act);
	}
}
