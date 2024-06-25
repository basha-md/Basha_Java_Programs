package Amazon_Ten_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC4 extends Launch
{
	@Test
	@Parameters("browser")
	public void selectMobilecover() 
	{
		
		WebElement searchItem = driver.findElement(By.id("twotabsearchtextbox"));
		searchItem.sendKeys("mobile cover");
		searchItem.sendKeys(Keys.ENTER);
		
		
		//WebElement outCB = driver.findElement(By.xpath("//(i[@class='a-icon a-icon-checkbox'])[121]"));
		WebElement outCB = driver.findElement(By.xpath("//span[.='Include Out of Stock']"));
	//	WebElement outCB = driver.findElement(By.xpath("//(span[@class='a-size-base a-color-base'])[141]"));
		outCB.click();		
		/*WebElement selectOutOfStock = driver.findElement(By.xpath("(//span[@class = 'a-size-base a-color-base'])[141]"));
		selectOutOfStock.click();
		
		WebElement selectMouseCover = driver.findElement(By.partialLinkText("iTronix Waterproof Mobile Pouch Cover"));
		selectMouseCover.click();
		System.out.println("TC4 END");*/
		
	}
}
