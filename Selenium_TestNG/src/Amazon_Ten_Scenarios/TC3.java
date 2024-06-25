package Amazon_Ten_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC3 extends Launch
{
	@Test
	@Parameters("browser")
	public void selectMouse() 
	{
		
		WebElement searchItem = driver.findElement(By.id("twotabsearchtextbox"));
		searchItem.sendKeys("mouse");
		searchItem.sendKeys(Keys.ENTER);
	
		WebElement twodaysCB = driver.findElement(By.id("p_90/20912642031"));
		twodaysCB.click();
		
		//WebElement mouse = driver.findElement(By.xpath("(//span[@class='rush-component'])[4]"));
		WebElement mouse = driver.findElement(By.partialLinkText("ZEBRONICS-Transformer-M with a High-Performance Gold-Plated USB Mouse: 6 Buttons"));
		mouse.click();
		
	
	}	
}
