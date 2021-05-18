package Package1;
import java.io.File;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test5_FluentWait {
	
	public static void main(String agrs[])
	{
		
		String sep = File.separator;
		System.setProperty("webdriver.chrome.driver","C:"+sep+"Users"+sep+"778294"+sep+"workspace"+sep+"Selenium"+sep+"Libraries"+sep+"chromedriver_win32"+sep+"chromedriver.exe");
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments(Arrays.asList("--start-maximized","--disable-infobars","--disable-extensions"));
		options.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(options);
		
		driver.navigate().to("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		
		By startTime = By.xpath("//*[contains(text(),'Click me to start timer')]");
		WebElement Timer = findElement(driver,startTime);
		Timer.click();
		
		
		Function<WebDriver,WebElement> fluent_Function = new Function<WebDriver,WebElement>(){

			@Override
			public WebElement apply(WebDriver driver)  {
				
				
				WebElement element = driver.findElement(By.xpath("//p[@id='demo']"));
				
				if(element.getAttribute("innerText").equalsIgnoreCase("QTP"))
				{
					System.out.println(element.getAttribute("innerHTML"));
					return element;
				}
				else
				{
					return null;
				}
			}
			
		};
		
		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		
		WebElement element = wait.until(fluent_Function);
		System.out.println(element.isDisplayed());
		
		
		
		
		
		
		
		driver.quit();
		
		
		
	}
	public static WebElement findElement(WebDriver driver, By byObject)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(byObject));
		 
		return element;
		
		
	}
	
	public static List<WebElement> findElements(WebDriver driver, By byObject)
	{
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byObject));
		return elements;
		
	}
	

}
