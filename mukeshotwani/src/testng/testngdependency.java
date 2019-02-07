package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testngdependency {
	
WebDriver driver;
	
@BeforeClass
public void startbrowser()
{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.14.0\\chromedriver.exe");
	driver=new ChromeDriver();
	System.out.println("Browser Opening...");
}


@Test
	public void start()
	{
		
		//System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.14.0\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://test.apexfunds247.com");
		
		System.out.println("Application Loaded");
       
		
	}
	
@Test(dependsOnMethods="start")
	public void login()
	{
	driver.findElement(By.xpath("//input[@id='username-email']")).sendKeys("test"); 
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Demotestmanager");
     driver.findElement(By.xpath("//input[@id='agreement']")).click();
     driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    boolean status =driver.findElement(By.xpath("//input[@value='Show']")).isDisplayed();
    Assert.assertTrue(status);
    System.out.println("Login Successful");
	}


	@Test(dependsOnMethods="login")
	public void logout()
	{
	driver.findElement(By.xpath("//a[@id='logoff']")).click();	
	System.out.println("Loggin out of Application");
	Alert alert = driver.switchTo().alert();
	alert.accept();
	System.out.println("Logout successful");
	Assert.assertTrue(driver.findElement(By.xpath("//input[@id='username-email']")).isDisplayed());
	
	}
	@AfterClass
	public void closeapp()
	
	{
		driver.quit();
		System.out.println("Browser is closing");
	
	
	}

	
}
