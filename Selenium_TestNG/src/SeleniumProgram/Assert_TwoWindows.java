package SeleniumProgram;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_TwoWindows
{
	@Test
	public void selectShoe() {
		

		   ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	    
	    WebElement shoe = driver.findElement(By.xpath("(//div[@class = 's-image-padding'])[1]"));
		//WebElement shoe = driver.findElement(By.xpath("(//a[@tabindex='-1'])[19]"));
		shoe.sendKeys(Keys.ENTER);
		
		 Set<String> s1 =     driver.getWindowHandles();
		 System.out.println(s1);
		
		 Iterator<String> pcid =   s1.iterator();
		 String parentid       = pcid.next();
		 String childid       = pcid.next();
		 System.out.println(parentid);
		System.out.println(childid);
		 
		 driver.switchTo().window(childid);
		 
		 Assert.assertEquals(s1.size(), ">1", childid);
	}
}
