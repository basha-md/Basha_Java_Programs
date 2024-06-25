package AmazonScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LaunchQuit 
{
	WebDriver driver;
	 @BeforeMethod
	 @Parameters("browser")
		public void launch(String nameofbrowser)
		{
		 if(nameofbrowser.equals("chrome"))
		 {
		 driver = new ChromeDriver();
		 }
		 if(nameofbrowser.equals("firefox"))
		 {
		 driver = new FirefoxDriver();
		 }
		 if(nameofbrowser.equals("edge"))
		 {
		 driver = new EdgeDriver();
		 }
		 
	
	
	
	   //ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	   driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			WebElement un =     driver.findElement(By.id("ap_email"));
			un.sendKeys("+919618746121");
			
			WebElement un_continue =     driver.findElement(By.id("continue"));
			un_continue.click();
			WebElement password =     driver.findElement(By.name("password"));
			password.sendKeys("mohd@1989");
			WebElement signin =     driver.findElement(By.id("signInSubmit"));
			signin.click();		
		}		
	

	@AfterMethod
	 @Parameters("browser")
	public void logout(String nameofbrowser)
	{
	 if(nameofbrowser.equals("chrome"))
	 {
	 driver = new ChromeDriver();
	 }
	 if(nameofbrowser.equals("firefox"))
	 {
	 driver = new FirefoxDriver();
	 }
	 if(nameofbrowser.equals("edge"))
	 {
	 driver = new EdgeDriver();
	 }
	  driver.quit();
	}
	 
	}	
	
	

