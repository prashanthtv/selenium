package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown2 {

	@Test
	public void Selectdropdown() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.14.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='country']"));
		
		Select Countrydd=new Select(dropdown);
		Countrydd.selectByValue("2");
		Countrydd.selectByValue("3");
		Countrydd.selectByValue("4");
		Countrydd.selectByValue("5");
		Countrydd.selectByValue("6");
		Countrydd.selectByValue("7");
		Countrydd.selectByValue("8");
		
		
		//driver.close();
		
	}

}	
