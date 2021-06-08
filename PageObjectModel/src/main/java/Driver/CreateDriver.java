package Driver;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

public class CreateDriver {
	
	public static Map<String,Object> EnvironmentalVariables = new HashMap<>();
	
	
	
	public void createDriver() throws IOException
	{
		WebDriver driver = new Driver().getDriver();
		EnvironmentalVariables.put("driver", driver);
	}
	
	
	
	
}
