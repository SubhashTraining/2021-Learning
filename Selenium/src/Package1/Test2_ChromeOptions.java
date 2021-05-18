
package Package1;import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test2_ChromeOptions {
	
	public static void main(String agrs[])
	{
		
		
		/* 	Capabilities are options that lets you customize the chrome driver session
		 	Capabilities can be set to you chrome driver session using ChromeOptions class or Desired Capabilities
		 	DesiredCapabilities is available by depreciated in java
		 	
		 	
		 	
			start-maximized: Used to open Chrome in maximize mode
			incognito: Used to open Chrome in incognito mode
			headless: Used to open Chrome in headless mode
			disable-extensions: Used to disable existing extensions on Chrome browser
			disable-popup-blocking: Used to disable pop-ups displayed on Chrome browser
			make-default-browser: Used to make Chrome as default browser
			version: Used to print chrome browser version
			disable-infobars: Used to prevent Chrome from displaying the notification.
		 
		 	
		 */
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("diable-extensions");
		List<String> arguments = Arrays.asList("start-maximized","disable-popup-blocking");		
		options.addArguments(arguments);
		
		
		//Add an extension to chrome 
		//Donwload extensions for chrome... (.crx file)
		options.addExtensions(new File("path to extendsion"));
		
		
		
		
		
		
			/*
		 
		 	Since Selenium version 3.6.0, the ChromeOptions class in Java also implements the Capabilities interface, 
		 	allowing you to specify other WebDriver capabilities not specific to ChromeDriver.
		 
			 */
		
		
		//Add web driver capabilities 
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("myhttpproxy:3337");
		options.setCapability("proxy", proxy);
		
		//Add chrome driver specific capability
		options.addExtensions(new File(""));
		options.addArguments("disable-extensions");
		
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("www.google.com");
		driver.close();
		
	}
	

}
