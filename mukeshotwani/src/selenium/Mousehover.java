package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mousehover {

	@Test
	public void mousehover()
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.14.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
		Actions act = new Actions(driver);
		WebElement hover=driver.findElement(By.xpath("//button[@class='dropbtn']"));
		act.moveToElement(hover).perform();
		
		driver.findElement(By.xpath("//div[@class='dropdown-content']//a[contains(text(),'Selenium')]")).click();
		driver.switchTo().defaultContent();
		
		
	}
}
