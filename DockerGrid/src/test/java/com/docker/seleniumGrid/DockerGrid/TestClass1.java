package com.docker.seleniumGrid.DockerGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {

	@BeforeTest
	public void bTest()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
	}
	
	
	@Test
	public void test1() throws MalformedURLException
	{
		
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),chromeOptions);
		
		driver.get("https://www.amazon.in");
		System.out.println("Test1:"+driver.getTitle());
		driver.quit();
		
	}
	
	
	@Test
	public void test2() throws MalformedURLException
	{
	FirefoxOptions Options = new FirefoxOptions();
	WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),Options);
	
	driver.get("https://www.amazon.in");
	System.out.println("Test2:"+driver.getTitle());
	driver.quit();
		
	}
	
	
	@Test
	public void test3() throws MalformedURLException
	{
		ChromeOptions chromeOptions = new ChromeOptions();
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),chromeOptions);
	
	driver.get("https://www.amazon.in");
	System.out.println("Test3:"+driver.getTitle());
	driver.quit();
		
	
		
	}
	
	@Test
	public void test4()throws MalformedURLException
	{
		FirefoxOptions Options = new FirefoxOptions();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),Options);
	
	driver.get("https://www.amazon.in");
	System.out.println("Test4:"+driver.getTitle());
	driver.quit();
		
		
	}
	
	
	@Test
	public void test5()throws MalformedURLException
	{
		FirefoxOptions Options = new FirefoxOptions();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),Options);
	
	driver.get("https://www.amazon.in");
	System.out.println("Test5:"+driver.getTitle());
	driver.quit();
		
		
	}
	
	
	@Test
	public void test6()throws MalformedURLException
	{
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),chromeOptions);
	
	driver.get("https://www.amazon.in");
	System.out.println("Test6:"+driver.getTitle());
	driver.quit();
		
		
	}
	
	
	@Test
	public void test7() throws MalformedURLException {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),chromeOptions);
	
	driver.get("https://www.amazon.in");
	System.out.println("Test7:"+driver.getTitle());
	driver.quit();
		
	}
	
	
	@Test
	public void test8()throws MalformedURLException {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),chromeOptions);
		
		driver.get("https://www.amazon.in");
		System.out.println("Test8:"+driver.getTitle());
		driver.quit();
		
	}
	
	
	@Test
	public void test9() throws MalformedURLException {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),chromeOptions);
		
		driver.get("https://www.amazon.in");
		System.out.println("Test9:"+driver.getTitle());
		driver.quit();
		
	}
	
	
	@Test
	public void test10() throws MalformedURLException {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),chromeOptions);
		
		driver.get("https://www.amazon.in");
		System.out.println("Test10:"+driver.getTitle());
		driver.quit();
	}
	
	
	
}
