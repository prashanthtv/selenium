package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolltest {

	
	@Test
	public void scrolldemo()
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.14.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.odeon.co.uk/sign-up/");
		JavascriptExecutor je =  (JavascriptExecutor) driver;
		
		WebElement ele=driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@class='container']/div[@class='row content']/div[@class='span12 container-shadow sign-up']/div[@class='span12 white border-blue no-padding']/div[@class='row no-margin']/div[@class='span8 table-cell']/form[@id='signup']/div[@id='partnermails']/div[1]/label[1]"));
		je.executeScript("arguments[0].scrollIntoView(true);",ele);
		
		String text=ele.getText();
		
		System.out.println("The captured text is: "+text);
		
	
		
	}
}
