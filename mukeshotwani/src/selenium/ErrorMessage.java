package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorMessage {
	
	@Test
	public void ErrorMessageValidations() throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.14.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://test.apexfunds247.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		String actual_result=driver.findElement(By.xpath("//li[contains(text(),'You must specify a username.')]")).getText();
		String expeccted_result="You must specify a username.";
		Assert.assertEquals(actual_result, expeccted_result);
		System.out.println("End of Test Case");
		driver.quit();
	
	}

}
