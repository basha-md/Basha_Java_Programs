package Amazon_Ten_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC8 extends Launch
{
  
	@Test
	@Parameters("broswer")
	public void select_book()
	{
		WebElement dd = driver.findElement(By.name("url"));
		
			
			Select books = new Select(dd);
			books.selectByValue("search-alias=audible");
		    
			WebElement search = driver.findElement(By.name("field-keywords"));
			search.sendKeys("power of mind");
			search.sendKeys(Keys.ENTER);
			
			WebElement power = driver.findElement(By.xpath("(//a[@tabindex='-1'])[2]"));
			power.click();
		
		
	}
	
	
	
}
