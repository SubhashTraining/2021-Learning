package com.org.SeleniumTraining.SeleniumRemoteDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Hello world!
 *
 */
public class runner 
{
    public static void main( String[] args ) throws MalformedURLException
    {
      ChromeOptions options = new ChromeOptions();
      options.addArguments(Arrays.asList("--ignore-certificate-errors","--allow-running-insecure-content","--disable-extensions","--start-maximized"));
      options.setAcceptInsecureCerts(true);
      DesiredCapabilities  desiredCapabilities = new DesiredCapabilities();
      desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
      RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.104:4444/wd/hub"),desiredCapabilities);
      
      driver.get("https://www.amazon.in");
      
      driver.quit();
      
      
      
      
    }
}
