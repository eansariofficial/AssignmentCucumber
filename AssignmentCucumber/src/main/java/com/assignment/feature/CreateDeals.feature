Feature: Create new deals 
@Deals
Scenario: Create new deals after clicking on Deals page

	Given check Page Title
	Then create deals
	|Title           | Description                      |
	|Testing Purpose | Automation Testing with Cucumber |
	Then try to export deals