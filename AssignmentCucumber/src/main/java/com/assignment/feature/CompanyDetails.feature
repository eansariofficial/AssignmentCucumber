Feature: Add Comapny details after clicking on Company and its deals

@Company
Scenario: Create new company details

	Given check page name
	Then create company
	|CompanyName | StreetAddress | City  | State      | Zip    | Country |Title           | Description                      |
	|Automation  | SectorV		 |Kolkata| WestBengal | 700000 | India	 |Testing Purpose | Automation Testing with Cucumber |
	|Testing     | SectorVI		 |Kolkata| WestBengal | 700000 | India	 |Testing Purpose | Automation Testing with Cucumber |
	
#	Then add Deals
#	|Title           | Description                      |
#	|Testing Purpose | Automation Testing with Cucumber |