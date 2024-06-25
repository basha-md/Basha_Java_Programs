package SeleniumProgram;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Par_Test 
{
    WebDriver driver;
	 @Test
	 @Parameters("browser")
		public void testcase1(String nameofbrowser)
		{
		 if(nameofbrowser.equals("chrome"))
		 {
		 driver = new ChromeDriver();
		 }
		 if(nameofbrowser.equals("firefox"))
		 {
		 driver = new FirefoxDriver();
		 }
		 if(nameofbrowser.equals("Edge"))
		 {
		 driver = new EdgeDriver();
		 }
		 
		
		 //driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	
		
		//WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		//w1.until(ExpectedConditions.titleContains("Goo"));
		
		
		driver.findElement(By.xpath("//textarea[1]")).sendKeys("India");
		driver.findElement(By.xpath("//textarea[1]")).sendKeys(Keys.ENTER);
		
		
		}
	
}
