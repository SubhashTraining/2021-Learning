package FrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Settings {
	
	private static Properties properties = loadFromPropertiesFile();
	private static Properties mobileProperties = loadFromPropertiesFileMobileProperties();
	
	private Settings()
	{
		
		
	}
	
	
	public static Properties getProperties()
	{
		return properties;
	}
	
	
	public static Properties getMobileProperties()
	{
		return mobileProperties;
	}
	
	 
	private static Properties loadFromPropertiesFile()
	{
		
		String RelativePath =new File(System.getProperty("user.dir")).getAbsolutePath();
		String path = RelativePath+ File.separator+"src"+File.separator+"test"+File.separator+"Resources"+Util.getFileSeperator();
		Properties properties = new Properties();
		File configFile = new File(path+"globalProperties.properties");
		
		try {
			properties.load(new FileInputStream(configFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new FrameWorkException("File Not Found while loading globalProperties.properties file");
			
		} catch (IOException e) {
			e.printStackTrace();
			throw new FrameWorkException("IOException while loading globalProperties.properties file");
		}
		  
		return properties;
		
	}
	
	private static Properties loadFromPropertiesFileMobileProperties()
	{
		return null;
	}
	
	
}
