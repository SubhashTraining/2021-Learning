Feature: Login Page Feature 2

Scenario: Data Tables with multiple records Passing argumets as List of Maps
	Given 	when the user is in LoginPage
	When  	User selects the search box and Enters the Search String and Selects the Search icon with multiple records using data tables
					
					|UserName|Password|ErrorMessage|Confirm|
					|Subhash|SubhashPassword|InvaldUser|Yes|
					|Sanjay|SanjayPassword|ValidUser|No|
									
	Then 		Search String should appear on top left corner using multiple records data tables with header and values
	
					|UserName|Password|ErrorMessage|Confirm|
					|Subhash|SubhashPassword|InvaldUser|Yes|
					|Sanjay|SanjayPassword|ValidUser|No|
					

					