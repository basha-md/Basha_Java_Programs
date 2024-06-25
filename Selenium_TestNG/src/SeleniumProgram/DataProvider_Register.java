package SeleniumProgram;

import java.io.FileInputStream;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Register 
{
   @DataProvider(name = "data1")
   public Object[][] method1()
   {
	   Object d1[][] = new Object[5][3];
	   d1[0][0] = "srini";
	   d1[0][1] = "54848";
	   d1[0][2]  = "fgrwg";
	   
	  d1[1][0] = "bala";
	   d1[1][1] = "54849";
	   d1[1][2]  = "rgrg";
	   
	   d1[2][0] = "vasu";
	   d1[2][1] = "5484";
	   d1[2][2]  = "frhth";
	   
	   d1[3][0] = "rash";
	   d1[3][1] = "54845";
	   d1[3][2]  = "njyr";
	   
	   d1[4][0] = "magan";
	   d1[4][1] = "54843";
	   d1[4][2]  = "fbfh";
	return d1;
	   
	   
   }
	
	@Test(dataProvider = "data1")
	public void testcase1(String name ,String mobile,String pwd)
	{
	   ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		
	       
	     WebElement first =   driver.findElement(By.name("customerName"));
	     first.sendKeys(name);
	     WebElement mobile_no =  driver.findElement(By.id("ap_phone_number"));
	     mobile_no.sendKeys(mobile);
	     WebElement pswrd = driver.findElement(By.id("ap_password"));
	     pswrd.sendKeys(pwd);
	     WebElement Continue = driver.findElement(By.id("continue"));
	     Continue.click();
	}
	
	
	
	
}
