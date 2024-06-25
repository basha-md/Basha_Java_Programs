package Amazon_Ten_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC6 extends Launch
{
	@Test
	@Parameters("browser")
	public void selectRedmi() {
		
		WebElement search = driver.findElement(By.xpath("(//a[@tabindex='0'])[12]"));
				
		search.click();
		
		WebElement select_realme = driver.findElement(By.xpath("(//a[@class='a-link-normal'])[6]"));
		select_realme.click();
	}
}
