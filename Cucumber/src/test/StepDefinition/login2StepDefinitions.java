package test.StepDefinition;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main.LoginPage;

public class login2StepDefinitions {
	
	LoginPage loginPage = new LoginPage();
	
@When("^User selects the search box and Enters the Search String and Selects the Search icon with multiple records using data tables$")
public void user_selects_the_search_box_and_Enters_the_Search_String_and_Selects_the_Search_icon_with_multiple_records_using_data_tables(DataTable arg1) {
    
	List<Map<String,String>> data =  arg1.asMaps(String.class, String.class);
	data.forEach(map->{
		System.out.println(map.get("UserName"));
		System.out.println(map.get("Password"));
		System.out.println(map.get("ErrorMessage"));
		System.out.println(map.get("Confirm"));
		
	});
   
}



@Then("^Search String should appear on top left corner using multiple records data tables with header and values$")
public void search_String_should_appear_on_top_left_corner_using_multiple_records_data_tables_with_header_and_values(DataTable arg1){
   
	List<Map<String,String>> data = arg1.asMaps(String.class, String.class);
	data.forEach(map-> {
		System.out.println(map.get("UserName"));
		System.out.println(map.get("Password"));
		System.out.println(map.get("ErrorMessage"));
		System.out.println(map.get("Confirm"));
	});
    
}

}
