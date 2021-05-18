package Package1;

import java.io.File;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverClass {

	private static final DriverClass driverClass = new DriverClass();
	private WebDriver driver;
	
	
	
	private DriverClass()
	{
		
		String sep = File.separator;
		System.setProperty("webdriver.chrome.driver", "C:"+sep+"Users"+sep+"778294"+sep+"workspace"+sep+"Selenium"+sep+"Libraries"+sep+"chromedriver_win32"+sep+"chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments(Arrays.asList("--start-maximized","--disable-extensions","--disable-infobars"));
		options.setAcceptInsecureCerts(true);
		this.driver = new ChromeDriver(options);	
	}
	
	public static DriverClass getInstance()
	{
		return driverClass;
	}
	
	public WebDriver getDriver()
	{
		return this.driver;
	}
	
	public void quit()
	{
		this.driver.quit();
	}
	
	
	public void close()
	{
		this.driver.close();
	}
	
}
