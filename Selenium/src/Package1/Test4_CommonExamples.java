
package Package1;
import java.io.File;
import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test4_CommonExamples {
	
	
	
	
	public static void main(String args[]) throws InterruptedException
	{
		
		//BootStrap drop down
		
		String sep = File.separator;
		System.setProperty("webdriver.chrome.driver","C:"+sep+"Users"+sep+"778294"+sep+"workspace"+sep+"Selenium"+sep+"Libraries"+sep+"chromedriver_win32"+sep+"chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments(Arrays.asList("--start-maximized","--disable-infobars","--disable-extensions"));
		options.setAcceptInsecureCerts(true);
		
		
		WebDriver driver = new ChromeDriver(options);
		WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
		By tutorial = By.cssSelector("div.dropdown button#menu1 span");
		
		WebElement tutorialElement= findElement(driver,tutorial);
		wait.until(ExpectedConditions.elementToBeClickable(tutorialElement)).click();
		
		
		
		By tutorialDD_Elements = By.cssSelector(".dropdown ul.dropdown-menu li ");
		List<WebElement> dropDownElements = findElements(driver,tutorialDD_Elements);
		
		Iterator<WebElement> iterator = dropDownElements.iterator();
		
		while(true)
		{
			WebElement innerElement = iterator.next().findElement(By.tagName("a"));
			if(innerElement.getAttribute("innerText").equals("HTML"))
			{
				System.out.println(innerElement.getAttribute("innerHTML"));
				innerElement.click();
				break;
			}
			
		}
		
					
		driver.navigate().to("https://jqueryui.com/resources/demos/droppable/default.html");
		
		
		Actions action = new Actions(driver);
		action.dragAndDrop(findElement(driver,By.cssSelector("div#draggable")), findElement(driver,By.cssSelector("div#droppable"))).perform();
		Thread.sleep(10000);
		
		
		
		driver.close();
		
		
		
		
		
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
