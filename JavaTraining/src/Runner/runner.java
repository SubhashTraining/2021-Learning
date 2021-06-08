package Runner;

import org.openqa.selenium.WebDriver;

import Driver.Driver;

public class runner {
	
	public static void main (String[] agrs) throws InterruptedException
	{
		
		WebDriver driver = new Driver().getDriver();
		
		driver.get("https://www.amazon.in/");
		
		
		Thread.sleep(3000);
		
		
		
		driver.quit();
	}
	

}
