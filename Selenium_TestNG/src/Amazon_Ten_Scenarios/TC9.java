package Amazon_Ten_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC9 extends Launch
{
  @Test
  @Parameters("browser")
  public void deals()
  {
	  
	  WebElement todaydeals = driver.findElement(By.xpath("(//a[@tabindex='0'])[9]"));
	       todaydeals.click();
	  
	  WebElement dealofday = driver.findElement(By.xpath("(//li[@class='a-carousel-card'])[1]"));
	  dealofday.click();
	  
	  WebElement redmi_mobile = driver.findElement(By.xpath("(//div[@class='ProductCard-module__card_uyr_Jh7WpSkPx4iEpn4w'])[1]"));
	  redmi_mobile.click();
	  
	  
	  
	  
	  
  }
	
	
	
	
}
