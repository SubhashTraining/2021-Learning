package FrameWork.Selenium;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import FrameWork.Settings;
import FrameWork.Util;

public class WebDriverFactory {
	
	private static Properties properties;
	
	
	public static WebDriver getWebDriver(Browser browser)
	{
				
		WebDriver driver = null;	
		properties = Settings.getProperties();
		
		switch(browser)
		{
			case CHROME:
				System.setProperty("webdriver.chrome.driver", Util.getRelativePath()+properties.getProperty("chromedriverpath"));
				String downloadPath =  Util.getRelativePath()+Util.getFileSeperator()+"Downloads";
				Map<String,Object> chromPref = new HashMap<String,Object>();
				chromPref.put("profile.default_content_settings.popups", 0);
				chromPref.put("download.default_directory",downloadPath);	
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.setExperimentalOption("prefs", chromPref);
				Proxy proxy = new Proxy();
				
				proxy.setHttpProxy("myhttpproxy:3337");
				proxy.setFtpProxy("myhttpproxy:3337");
				proxy.setSslProxy("myhttpproxy:3337");
				chromeOptions.setCapability("proxy",proxy);
				chromeOptions.setAcceptInsecureCerts(true);
				chromeOptions.addArguments(Arrays.asList("--start-maximized"));
				
				driver=new ChromeDriver(chromeOptions);
				
				
		}
		
		return driver;
		
	}

}
