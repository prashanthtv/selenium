package capturescreenshot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import library.Utility;

public class screenshot {
@Test
	public void takescreenshot() throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.14.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://test.apexfunds247.com");
		//driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		String mytitle=driver.getTitle();
		System.out.println("Title of the page is:" + mytitle);
	Utility.capturescreenshot(driver, "Home page");
	
	driver.findElement(By.xpath("//input[@id='username-email']")).sendKeys("Demotestmanager");
	
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Demotestmanager");
     driver.findElement(By.xpath("//input[@id='agreement']")).click();
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Utility.capturescreenshot(driver, "after login");
	
	
		//TakesScreenshot ts =(TakesScreenshot)driver;
		//File source=ts.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(source, new File("./screenshots/screencapture.png"));
//System.out.println("Screenshot taken");
}
}
