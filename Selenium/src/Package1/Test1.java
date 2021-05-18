package Package1;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


	/*
	 
 	start-maximized: Used to open Chrome in maximize mode
	incognito: Used to open Chrome in incognito mode
	headless: Used to open Chrome in headless mode
	disable-extensions: Used to disable existing extensions on Chrome browser
	disable-popup-blocking: Used to disable pop-ups displayed on Chrome browser
	make-default-browser: Used to make Chrome as default browser
	version: Used to print chrome browser version
	disable-infobars: Used to prevent Chrome from displaying the notification.
	
	 */


	//Chrome Options and Desired Capabilities

public class Test1 {
	
	public static void main(String agrs[]) throws InterruptedException
	{
		
		
		
		String sep = File.separator;
		System.setProperty("webdriver.chrome.driver", "C:"+sep+"Users"+sep+"778294"+sep+"workspace"+sep+"Selenium"+sep+"Libraries"+sep+"chromedriver_win32"+sep+"chromedriver.exe");
		
		
		//Chrome Options are used to control the properties of the chrome driver
		
		ChromeOptions options = new ChromeOptions();
		
		//Diable developer mode extension
		
		options.addArguments("disable-extensions");
		List<String> arguments = new ArrayList<>();
		arguments.add("start-maximized");
		arguments.add("disable-popup-blocking");
		options.addArguments(arguments);
		
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		driver.close();
		
		/*
			ACCEPT_SSL_CERTS:  This will tell the browser to accept SSL Certificates.
			PLATFORM_NAME: This is used to set the Operating System platform.
			BROWSER_NAME: This is used to set the browser name.
			VERSION: This is used to set the browser version.
		 */
		
		
		
		
		
		
		
		
		
	}

}
