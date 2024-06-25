package Amazon_Ten_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC10 extends Launch
{
  @Test
  @Parameters("browser")
  public void shoe()
  {
	  WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	  search.sendKeys("shoe");
	  search.sendKeys(Keys.ENTER);
	  
	  driver.navigate().back();
  }
	
	
	
	
}
