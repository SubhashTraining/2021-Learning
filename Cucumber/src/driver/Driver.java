package driver;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
	
	
	private final WebDriver webdriver ;
	
		
	 public Driver()
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\778294\\workspace\\Selenium\\Libraries\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setAcceptInsecureCerts(true);
			options.addArguments(Arrays.asList("--disable-extensions","--disable-inforbars","--start-maximized"));
			webdriver= new ChromeDriver(options);
	}
	
	public WebDriver getDriver()
	{
		return webdriver;
	}
	
	
	
	

}
