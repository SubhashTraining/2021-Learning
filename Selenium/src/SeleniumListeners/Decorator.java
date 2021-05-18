package SeleniumListeners;

import Package1.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;


public class Decorator  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Originaldriver = DriverClass.getInstance().getDriver();
		
		WebDriverListener listener = new MyListener();
		
		
		WebDriver driver = new EventFiringDecorator(listener).decorate(Originaldriver);
		
		driver.navigate().to("www.google.com");
		
		driver.quit();
		
	}

}
