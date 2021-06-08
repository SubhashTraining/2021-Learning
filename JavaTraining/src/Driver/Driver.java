package Driver;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
	
	private final WebDriver driver;
	
	
	public Driver()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.addArguments(Arrays.asList("--ignore-extendsions","--ignore-infobars","--start-maximized"));
		driver = new ChromeDriver(options);
		
		
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
	
	
}
