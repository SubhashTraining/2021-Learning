package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjects.LoginPageObjects;
import driver.Driver;
import test.StepDefinition.hooksSetepDefinition;

public class LoginPage {
	
	
	
	private WebDriver driver = (WebDriver)hooksSetepDefinition.WebDriverResources.get("driver");
	
	public void openApplicationn()
	{
		driver.navigate().to("https://www.amazon.in");
	}
	
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	
	public void SearchHomePageTextBox(String SearchString)
	{
		
		WebElement twotabsearchtextbox = driver.findElement(LoginPageObjects.twotabsearchtextbox);
		twotabsearchtextbox.clear();
		twotabsearchtextbox.sendKeys(SearchString);
		driver.findElement(LoginPageObjects.nav_search_submit_button).click();
	
	}
	
	public String getSearchString()
	{
		WebElement element = driver.findElement(LoginPageObjects.searchString);
		return element.getAttribute("innerText");
		
	}
	
	
	
	

}
