package Amazon_Ten_Scenarios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launch 
{
	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void launchAmazon(String browserName) {
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15000));
		driver.manage().window().maximize();

	}

	@AfterMethod

	@Parameters("browser")
	public void closeAmazon(String browserName) {

		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.quit();
	}
}
