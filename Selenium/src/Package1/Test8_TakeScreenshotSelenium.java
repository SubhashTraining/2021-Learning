package Package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Test8_TakeScreenshotSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = DriverClass.getInstance().getDriver();
		
		driver.navigate().to("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		 org.openqa.selenium.TakesScreenshot screenshot = (org.openqa.selenium.TakesScreenshot)driver;
		 File source = screenshot.getScreenshotAs(OutputType.FILE);
		 try {
			FileHandler.copy(source, new File("SeleniumScreenshot.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 driver.quit();

	}

}
