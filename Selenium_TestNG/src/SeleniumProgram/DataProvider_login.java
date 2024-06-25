package SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvider_login 
{
   @DataProvider(name ="login_details")
   public Object[][] method1()
   {
	   Object d1[][] = new Object [5][2];
	   
	   d1[0][0]  = "basha@gmail.com";
	   	d1[0][1] = "brsggn1e44";
	   	
	   	d1[1][0]  = "hari@gmail.com";
	   	d1[1][1] = "fbdz1244";
	   	
	   	d1[2][0]  = "venu@gmail.com";
	   	d1[2][1] = "fbfbd243";
	   	
	   	d1[3][0]  = "sane@gmail.com";
	   	d1[3][1] = "ujyrj245";
	   	
	   	d1[4][0]  = "thorn@gmail.com";
	   	d1[4][1] = "byrjr244";
	   	
	   	return d1;
	   			
   }
	
	@Test(dataProvider ="login_details")
	
		public void launch(String un,String pwd)
		{
		
		 
	   ChromeDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
	   driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			WebElement un1 =     driver.findElement(By.id("ap_email"));
			un1.sendKeys(un);
			
			WebElement un_continue =     driver.findElement(By.id("continue"));
			un_continue.click();
			WebElement password =     driver.findElement(By.name("password"));
			password.sendKeys(pwd);
			WebElement signin =     driver.findElement(By.id("signInSubmit"));
			signin.click();		
	
	
	
	
	
	
		}
	
}
