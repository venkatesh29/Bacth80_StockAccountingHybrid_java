package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import javax.imageio.stream.FileCacheImageOutputStream;

public class PropertyFileUtil {
	
	public static String getValueForKey(String Key) throws Exception{
		
		FileInputStream fis=new FileInputStream("./PropertiesFile/Environment.properties");
		
		Properties configProperties=new Properties();
		
		configProperties.load(fis);
		
		return configProperties.getProperty(Key);	
	}

}
