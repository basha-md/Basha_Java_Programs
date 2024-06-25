package SeleniumProgram;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Ex 
{
   @DataProvider(name ="data1")
    public Object[][] method1()
    {
	   return new Object[][] {{"ram"}, {"sita"},{"laxman"},{"suraj"}};
    }
	@DataProvider(name="data2")
	public Object[][] method2()
	{
		return new Object[][] { {10},{20},{30},{40}};
	}
	
		
	
   
 
  /* @Test(dataProvider = "data1")
   public void testcase1(String name)
   {
	   System.out.println(name.concat(" john"));
   }*/
	
	@Test(dataProvider ="data2")
	public void testcase1(int no)
	{
		System.out.println(no+100);
	}
	
}
