package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class errormessages {

	
	@Test
	public void login() 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.14.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://test.apexfunds247.com");
		//driver.findElement(By.xpath("//input[@id='username-email']")).sendKeys("test"); 
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Demotestmanager");
	    // driver.findElement(By.xpath("//input[@id='agreement']")).click();
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	    // Thread.sleep(4000);
	     
	   String Actual_Error=driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful. Please correct the errors and try again.')]")).getText();	
	   String Expected_Error="Login was unsuccessful. Please correct the errors and try again.";
	   Assert.assertEquals(Actual_Error, Expected_Error);
	   driver.quit();
	     
	}
}
       
		
	