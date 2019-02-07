package configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Configtestold {
	
	@Test
	public void testconfig() throws Exception
	
	{
		
		File src = new File("./Configuration/Config.property");
		FileInputStream fis = new FileInputStream(src);	
		Properties prop=new Properties();
		prop.load(fis);
	
		String chromepath=prop.getProperty("ChromeDriver");
		System.out.println("Chrome path is:" +chromepath);
		
		
		
	}

}
