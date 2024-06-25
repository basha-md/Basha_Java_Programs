package Amazon_Ten_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC2 extends Launch
{
	@Test
	public void selectmobile()
	{
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobiles");
		search.sendKeys(Keys.ENTER);
	
	WebElement mobile = driver.findElement(By.xpath("//div[@class='aok-relative']"));
	  mobile.click();
	
	}
}
