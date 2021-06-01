
Feature: Test Amazon login page

@feature
Scenario: Google HomePage Open Check
	Given User opens the browser
	When user enters the amazon url in the browser and press enter
	Then Amazon Home Page Opens
	#And  The title displays
	#And quit driver

	
@outline1
Scenario Outline: Make a Search via HomeScreen text box
	Given when the user is in LoginPage
	When  User selects the sign in button and Enters the "<SearchString>" and Selects the Search button
	Then 	"<SearchString>" should appear on top left corner
	  	
Examples:
		|SearchString|
		|Mobile|
		|Samsung|


		
@Outline		
Scenario: Make a Search via HomeScreen text box multiple times with Data Tables without Headers
	Given when the user is in LoginPage 
	When  User selects the search box and Enters the Search String and Selects the Search icon
				|Mobile|
	Then 	Search String should appear on top left corner
				|Mobile|
	  	
