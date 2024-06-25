package AmazonScenarios;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 extends LaunchQuit
{
	
    @Test
	public  void Addtocart() throws InterruptedException 
	{
    
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		search.sendKeys(Keys.ENTER);
		
		
	
		WebElement shoe = driver.findElement(By.xpath("(//span[@class='a-link-normal s-no-outline'])[1]"));
		//WebElement shoe = driver.findElement(By.xpath("(//a[@tabindex='-1'])[19]"));
		shoe.sendKeys(Keys.ENTER);
		
		 Set<String> s1 =     driver.getWindowHandles();
		 //System.out.println(s1);
		
		 Iterator<String> pcid =   s1.iterator();
		 String parentid       = pcid.next();
		 String childid       = pcid.next();
		 System.out.println(parentid);
		// System.out.println(childid);
		 
		 
		 driver.switchTo().window(childid);
	
	
	}
}
