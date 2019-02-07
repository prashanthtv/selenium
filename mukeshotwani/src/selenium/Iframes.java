package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iframes {

	@Test
	public void testframes(){
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.14.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/HTML/html_iframe.asp");
		driver.manage().window().maximize();
		WebElement i_frame=driver.findElement(By.xpath("//iframe[@src='default.asp']"));
		driver.switchTo().frame(i_frame);
		//driver.findElement(By.xpath("//a[@title='JavaScript Tutorial'"));
		driver.findElement(By.xpath("//a[@title='Search W3Schools']")).click();
		//driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/a[2]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@title='Bootstrap Tutorial']")).click();
		
	}
	
}
