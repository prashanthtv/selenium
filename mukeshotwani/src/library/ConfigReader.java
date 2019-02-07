package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	Properties prop;
	public ConfigReader()
	
	{
		
		try {
			File src = new File("./Configuration/Config.property");
			FileInputStream fis = new FileInputStream(src);	
			 prop=new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			
			System.out.println("Exception is: " +e.getMessage());
		}
	}


public String getChromepath()

{
	
String path=prop.getProperty("ChromeDriver");
return path;

	
}

public String geturl()

{
	String URL=prop.getProperty("URL");
	return URL;
	
}


}


