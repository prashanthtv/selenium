package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utility {
	
	
	
	public static void capturescreenshot(WebDriver driver,String screenshotname){
		
		try {
			TakesScreenshot ts =(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./screenshots/"+screenshotname+".png"));
System.out.println("Screenshot taken");
		} catch (Exception e) {
			{
		
				
				System.out.println("Exception while taking screenshot");
		}
	
	}
	

}
}
