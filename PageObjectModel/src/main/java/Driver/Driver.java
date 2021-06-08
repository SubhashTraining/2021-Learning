package Driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



	public class Driver {
		
		private final WebDriver webdriver ;
		
		
		public Driver() throws IOException
		{
			Reader Propertyfile = new FileReader(System.getProperty("user.dir")+"\\ApplicationProperties.properties");
			Properties property = new Properties();
			property.load(Propertyfile);
			String Browser = property.getProperty("Browser");
			
			
			if(Browser.equalsIgnoreCase("FireFox"))
			{
				webdriver  = new ChromeDriver();
			}
			else
			{
				String driverPath = property.getProperty("ChromeDriverPath");
				System.setProperty("webdriver.chrome.driver", driverPath);
				ChromeOptions options = new ChromeOptions();
				options.setAcceptInsecureCerts(true);
				options.addArguments(Arrays.asList("--ignore-certificate-errors","--allow-running-insecure-content","--disable-extension","--start-maximized"));
				webdriver  = new ChromeDriver(options);
			}
					
		}
		
		public WebDriver getDriver()
		{
			return webdriver;
		}
		
	
}
