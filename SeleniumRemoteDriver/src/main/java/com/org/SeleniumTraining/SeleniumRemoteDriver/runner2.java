package com.org.SeleniumTraining.SeleniumRemoteDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class runner2 {
	
	public static void main(String agrs[]) throws MalformedURLException
	{
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.addArguments("--start-maximized","--disable-infobars","--disable-extensions");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),options);
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());
		driver.quit();
		System.out.println("Test Passed");
		
	}

}
