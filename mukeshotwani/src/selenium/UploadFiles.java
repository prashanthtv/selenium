package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 

public class UploadFiles {

	
	@Test
	public void upload() throws IOException, InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.14.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","C:\\selenium-java-3.14.0\\\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='upfile']")).click();
		Runtime.getRuntime().exec("C:\\Users\\prashanth.tv\\Desktop\\autoit\\Fileupload.exe");
		
	}
	
}