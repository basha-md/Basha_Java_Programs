package Basics_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Grotech 
{

	public static void main(String[] args) 
	{
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.id("Choice1")); //1st 
		Select s1 = new Select(e1);
		s1.selectByVisibleText("Demo2");
		
		
		WebElement sql = driver.findElement(By.id("Choice9")); //2nd
		Select s2 = new Select(sql);
		s2.selectByVisibleText("SQL15");
		
		WebElement e2 = driver.findElement(By.id("Choice6")); // 3rd
		Select s3 = new Select(e2);
		s3.selectByVisibleText("Night10");
		
		WebElement e3 = driver.findElement(By.id("Choice4")); //4th
		Select s4 = new Select(e3);
		s4.selectByVisibleText("Energy15");
		
		WebElement e4 = driver.findElement(By.id("Choice8")); //4th
		Select s5 = new Select(e4);
		s5.selectByVisibleText("QTP10");
		
		WebElement e5 = driver.findElement(By.id("Choice2")); //4th
		Select s6 = new Select(e5);
		s6.selectByVisibleText("practice3");

	}

}
