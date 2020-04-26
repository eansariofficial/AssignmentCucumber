Feature: Create new Task in this website

@Task
Scenario: Create new Task

	Given check home page name
	Then create new Task
	|Title           | Description                      |
	|Testing Purpose | Automation Testing with Cucumber |
	|Testing Purpose | Automation Testing with Cucumber |
	
#	Then add Deals
#	|Title           | Description                      |
#	|Testing Purpose | Automation Testing with Cucumber |