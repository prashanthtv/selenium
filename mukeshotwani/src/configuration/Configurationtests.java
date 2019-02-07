package configuration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import library.ConfigReader;

public class Configurationtests {
	
	
	
	@Test
	public void configurationsdemo() throws Exception
	
	{
		
		ConfigReader config=new ConfigReader();
		
		System.setProperty("webdriver.chrome.driver", config.getChromepath());
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(config.geturl());
		driver.quit();

}
}

