Feature: Create new Calls in this website

@Calls
Scenario: Create new CAlls

	Given check home page name in Calls
	Then create new Calls
	|CallTime        | Description                      | Duration |
	|09/04/2020 00:00 | Automation Testing with Cucumber | 10	   |
	|09/05/2020 00:00 | Automation Testing with Cucumber |20		   |
	
#	Then add Deals
#	|Title           | Description                      |
#	|Testing Purpose | Automation Testing with Cucumber |