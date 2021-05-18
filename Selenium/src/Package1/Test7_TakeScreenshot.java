package Package1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test7_TakeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = DriverClass.getInstance().getDriver();
		
		driver.navigate().to("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		 
		TakeScreenShot.getInstance().printSreen();
		
		By startTime = By.xpath("//*[contains(text(),'Click me to start timer')]");
		driver.findElement(startTime).click();
		
		TakeScreenShot.getInstance().printSreen();
		
		
		
	
		
		
		
		
		driver.quit();
		
	}

}
