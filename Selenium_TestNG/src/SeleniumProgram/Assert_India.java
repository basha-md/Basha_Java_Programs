package SeleniumProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_India
{
	@Test
   public void test1() throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	
	driver.findElement(By.xpath("//textarea[1]")).sendKeys("India");
	driver.findElement(By.xpath("//textarea[1]")).sendKeys(Keys.ENTER);
	Thread.sleep(1000);

	Assert.assertEquals(driver.getTitle(), "india - Google Search", "sorry");
	
}
	
}
