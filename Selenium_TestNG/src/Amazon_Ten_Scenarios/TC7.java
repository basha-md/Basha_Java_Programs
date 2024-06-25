package Amazon_Ten_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC7 extends Launch
{

	@Test
	@Parameters("browser")
	public void selectMango() 
	{
	  WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
	   
	  Select fresh = new Select(dropdown);
	   fresh.selectByVisibleText("Amazon Fresh");
	   
	   WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
	   searchbox.sendKeys("mango");
	   searchbox.sendKeys(Keys.ENTER);
		
	}
}
