package prashanth;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class dropdown {

	public void validatingdropdowns()
	
	{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.14.0\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=002bbefdf9073a8d243f0a367d7cfc7f");
	 WebElement dd_country =driver.findElement(By.xpath("//select[@name='country']"));
	 
	 Select obj1=new Select(dd_country);
	 obj1.selectByValue("4");
	 driver.quit();
	 
 
	}
	
}
