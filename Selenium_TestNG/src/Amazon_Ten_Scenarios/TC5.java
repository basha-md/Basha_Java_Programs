package Amazon_Ten_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC5 extends Launch
{
	@Test
	@Parameters("browser")
	public void selectCamera() 
	{
		
		WebElement searchItem = driver.findElement(By.id("twotabsearchtextbox"));
		searchItem.sendKeys("camera");
		searchItem.sendKeys(Keys.ENTER);
		
		WebElement secondpage = driver.findElement(By.cssSelector("[aria-label='Go to page 2']"));
		   secondpage.click();
		   
		   //WebElement camera =  driver.findElement(By.xpath("(//div[@class='aok-relative'])[13]"));
		  // WebElement camera =  driver.findElement(By.xpath("(//span[@class='rush-component'])[23]"));
		   WebElement camera =  driver.findElement(By.partialLinkText("BLACKPOOL 4K Action Camera with Accessories Kit | WiFi | 16 MP | 170 Degree Wide"));
		   camera.click();
		
	
	}
}
