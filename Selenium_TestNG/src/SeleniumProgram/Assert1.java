package SeleniumProgram;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert1 
{

	@Test
	public void testcase1()
	{
		//Assert.assertTrue(false);
		//Assert.assertFalse(true);
		Assert.assertEquals(true, false);
		Assert.assertEquals(true, false, "sorry");
	}
	
	
}
