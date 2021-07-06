package com.docker.seleniumGrid.DockerGrid;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 {
	
	
	@BeforeSuite
	public void startDockerBatchFile() throws IOException, InterruptedException
	{
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("cmd /c start dockerup.bat");
		Thread.sleep(60000);
		
	}
	
	
	
	
	
	
	
	
	@AfterSuite
	public void stopBockerCompose() throws IOException
	{
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("cmd /c start dockercomposedown.bat");
	}
	
	@BeforeTest
	public void setSystemProperties()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
		
	}
	
	@Test
	public void Test1() throws MalformedURLException
	{
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.addArguments("--start-maximized");		
		WebDriver driver = new RemoteWebDriver( new URL("http://localhost:4444/wd/hub"),options);
		driver.get("https://www.amazon.in");
		driver.quit();
		System.out.println("Test 1 Passed");
		
		
	}
	
	@Test
	public void Test2() throws MalformedURLException
	{
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.addArguments("--start-maximized");		
		WebDriver driver = new RemoteWebDriver( new URL("http://localhost:4444/wd/hub"),options);
		driver.get("https://www.amazon.in");
		driver.quit();
		System.out.println("Test 2 Passed");
		
	}
	@Test
	public void Test3() throws MalformedURLException
	{
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.addArguments("--start-maximized");		
		WebDriver driver = new RemoteWebDriver( new URL("http://localhost:4444/wd/hub"),options);
		driver.get("https://www.amazon.in");
		driver.quit();
		System.out.println("Test 3 Passed");
		
	}

	@Test
	public void Test4() throws MalformedURLException
	{
		FirefoxOptions options = new FirefoxOptions();
		options.setAcceptInsecureCerts(true);
		options.addArguments("--start-maximized");		
		WebDriver driver = new RemoteWebDriver( new URL("http://localhost:4444/wd/hub"),options);
		driver.get("https://www.amazon.in");
		driver.quit();
		System.out.println("Test 4 Passed");
		
	}
	@Test
	public void Test5() throws MalformedURLException
	{
		FirefoxOptions options = new FirefoxOptions();
		options.setAcceptInsecureCerts(true);
		options.addArguments("--start-maximized");		
		WebDriver driver = new RemoteWebDriver( new URL("http://localhost:4444/wd/hub"),options);
		driver.get("https://www.amazon.in");
		driver.quit();
		System.out.println("Test 5 Passed");
		
	}
	@Test
	public void Test6() throws MalformedURLException
	{
		FirefoxOptions options = new FirefoxOptions();
		options.setAcceptInsecureCerts(true);
		options.addArguments("--start-maximized");		
		WebDriver driver = new RemoteWebDriver( new URL("http://localhost:4444/wd/hub"),options);
		driver.get("https://www.amazon.in");
		driver.quit();
		System.out.println("Test 6 Passed");
		
	}
	
	

}
