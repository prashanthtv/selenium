package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {

	@Test
	public void Selectdropdownvalues() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.14.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://test.apexfunds247.com");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='username-email']")).sendKeys("Demotestmanager");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Demotestmanager");
        driver.findElement(By.xpath("//input[@id='agreement']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        WebElement FundNameDropdown =driver.findElement(By.xpath("//select[@id='FundId']"));
        
        Select FundName_dd=new Select(FundNameDropdown);
        FundName_dd.selectByValue("10022");
        
        driver.findElement(By.xpath("//input[@value='Show']")).click();
        driver.close();

	}

}	
