package Package1;
import java.io.File;
import java.time.Duration;
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test3_MouseActions {

	public static final By HomeScreen_Mobiles = By.xpath("//div[@id='nav-xshop']//a[contains(text(),'Mobiles')]");
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		String sep = File.separator;
		System.setProperty("webdriver.chrome.driver", "C:"+sep+"Users"+sep+"778294"+sep+"workspace"+sep+"Selenium"+sep+"Libraries"+sep+"chromedriver_win32"+sep+"chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.addArguments("--start-maximized");
		options.addArguments("--disable-infobars");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		
		//WebDriver wait has been depreciated
		// WebDriverWait wait = new WebDriverWait(driver,10000);
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(HomeScreen_Mobiles).click();
		
		

		Thread.sleep(2000);	
		WebElement MobileAccessories = driver.findElement(By.xpath("//span[contains(text(),' Mobiles & Accessories')]"));
		 	
	
		 Actions actions = new Actions(driver);
		 actions.moveToElement(MobileAccessories).perform();
		 actions.moveToElement(driver.findElement(By.xpath("//ul[@class='mm-category-list']//li/a[contains(text(),'Cases & Covers')]"))).click().perform();
		
		
		 
		 Consumer<By> hoverOver = (By by)->{
			
			 actions.moveToElement(driver.findElement(by)).perform();
		 };
		 
		 
		 
		 hoverOver.accept(By.xpath("//span[contains(text(),' Mobiles & Accessories')]"));
		 hoverOver.accept(By.xpath("//ul[@class='mm-category-list']//li/a[contains(text(),'Cases & Covers')]"));
		 actions.click().perform();
		 
		 Thread.sleep(5000);
		 System.out.println(driver.getTitle());
		 
	
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
