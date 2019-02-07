package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {

	
	@Test
	public void dropdowntest()
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.14.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.odeon.co.uk/sign-up/");
		WebElement DayDropdown=driver.findElement(By.xpath("//select[@id='birthday']"));
		
		Select Birthdaydd=new Select(DayDropdown);
		Birthdaydd.selectByValue("4");
		Birthdaydd.selectByValue("2");
		Birthdaydd.selectByValue("3");
		Birthdaydd.selectByValue("6");
		
		
	}
	
	
}
