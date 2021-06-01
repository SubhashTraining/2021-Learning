package test.StepDefinition;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import driver.Driver;

public class hooksSetepDefinition {
	
	public static Map<String,Object> WebDriverResources =new HashMap<>(); ;
	private WebDriver webDriver ;
	
	@Before
	public void setUp()
	{
		Driver driver= new Driver();
		webDriver= driver.getDriver();
		WebDriverResources.put("driver", webDriver);
	}

	
	@After
	public void tearDown()
	{
		webDriver.quit();
	}
	
}
