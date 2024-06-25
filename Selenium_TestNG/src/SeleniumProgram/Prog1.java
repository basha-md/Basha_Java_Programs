package SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Prog1 {
	
	@Test
	public static void login_Amazon()
	{
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement un =     driver.findElement(By.id("ap_email"));
		un.sendKeys("+919618746121");
		WebElement un_continue =     driver.findElement(By.id("continue"));
		un_continue.click();
		WebElement password =     driver.findElement(By.name("password"));
		password.sendKeys("mohd@1989");
		WebElement signin =     driver.findElement(By.id("signInSubmit"));
		signin.click();	
	}
}