package prashanth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DD {

	@Test
	public void ddtest()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.14.0\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://odeon.snapdda.co.uk/clients/odeon/Odeon_ProxyUpdate.html");
		driver.manage().window().maximize();
		WebElement drop=driver.findElement(By.xpath("//form[1]//fieldset[1]//p[1]//select[1]"));
		
		Select obj1=new Select(drop);
		obj1.selectByValue("https://bastion.UAT.cloud.odeon.co.uk/services/");
		driver.quit();
		
		
	}
}
