	package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HiddenElement {
		@Test	
		public void hiddenelement()
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.14.0\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
			List <WebElement> radio=driver.findElements(By.id("male"));
			
			int count=radio.size();
			System.out.println("The No. of Elements is: "+count);
			
			for(int i=0;i<count;i++)
			{
				
				WebElement  ele=radio.get(i);
				System.out.println("Element is :" +ele);
				int x=ele.getLocation().getX();
				if (x!=0)
				
				{
					ele.click();
					System.out.println("The clicked element is: " +ele);
					break;
				}
				
			}

		}
	}

