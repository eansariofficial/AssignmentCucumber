Feature: Create new Contacts after clicking on Contact page  

@Login
Scenario: Create Contact

	Given check title of webpage
	Then goto contact page and create new contact
	|firstnamee | lastnamee | email |
	|Ehtesham	|Ansari		|eht22197@gmail.com|
	|Arbaz		|Khan		|eht22197@yahoo.com|
	
#	Given click on contact page and create new contact
#	Then create event
