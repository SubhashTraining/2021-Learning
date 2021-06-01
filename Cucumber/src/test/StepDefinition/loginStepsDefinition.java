package test.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.Driver;
import main.LoginPage;

import org.junit.Assert;




public class loginStepsDefinition {
	
	LoginPage loginPage = new LoginPage();
	
	
	@Given("User opens the browser")
	public void user_opens_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	 }
	    		
	@When("user enters the amazon url in the browser and press enter")
	public void user_enters_the_amazon_url_in_the_browser_and_press_enter() {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.openApplicationn();
	}
	
	@Then("Amazon Home Page Opens")
	public void amazon_home_page_opens() {
	    // Write code here that turns the phrase above into concrete actions
		String title=loginPage.getTitle();
		try{
			Assert.assertEquals("Title", title);
		}catch(Exception e){}
	}
	
	
	
	
	
	
	@Given("^when the user is in LoginPage$")
	public void when_the_user_is_in_LoginPage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.openApplicationn();
	}

	@When("^User selects the sign in button and Enters the \"([^\"]*)\" and Selects the Search button$")
	public void user_selects_the_sign_in_button_and_Enters_the_and_Selects_the_Search_button(String arg1) throws Throwable {
	    loginPage.SearchHomePageTextBox(arg1);
	   
	}

	@Then("^\"([^\"]*)\" should appear on top left corner$")
	public void should_appear_on_top_left_corner(String arg1) throws Throwable {
	    String searchString = loginPage.getSearchString();
	    System.out.println(searchString +":"+arg1);
	    try{
	    	Assert.assertEquals(arg1, searchString.replaceAll("[\"]", ""));
	    }catch(Exception e){}
	  
	}


	
	//Scenario3
	@When("^User selects the search box and Enters the Search String and Selects the Search icon$")
	public void user_selects_the_search_box_and_Enters_the_Search_String_and_Selects_the_Search_icon(DataTable arg1) {
		 String argument =  arg1.asList(String.class).get(0);
		 loginPage.SearchHomePageTextBox(argument);
	    
	}

	@Then("^Search String should appear on top left corner$")
	public void search_String_should_appear_on_top_left_corner(DataTable arg1) {
		String argument =  arg1.asList(String.class).get(0); 
		String searchString = loginPage.getSearchString();
	     try{
	    	Assert.assertEquals(argument, searchString.replaceAll("[\"]", ""));
	    }catch(Exception e){}
	    
	}
	
	
	
	
	
}
