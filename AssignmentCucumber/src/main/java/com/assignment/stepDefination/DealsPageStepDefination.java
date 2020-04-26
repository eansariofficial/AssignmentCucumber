package com.assignment.stepDefination;

import java.util.Map;

import com.assignment.test.DealsPage;
import com.assignment.test.ErpTest;
import com.assignment.test.HomePage;


import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DealsPageStepDefination extends ErpTest{
	static HomePage homePage;
	static DealsPage dealsPage;
	public DealsPageStepDefination() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	@Before("@Deals")
	public void login() throws Exception
	{
		initialization();
		String userid = properties.getProperty("username");
		String password = properties.getProperty("password");
		homePage = login(userid, password);
	}
	@After("@Deals")
	public void logout() throws Exception
	{
		ending();
	}

	@Given("^check Page Title$")
	public void check_Page_Title() throws Exception {
		homePage = homePage.checkTitle();
	}

	@Then("^create deals$")
	public void create_deals(DataTable credentials) throws Exception 	 {
		for(Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			String dtTitle = data.get("Title");
			String dtDescription = data.get("Description");
			dealsPage = homePage.clickDealsPage();
			dealsPage = dealsPage.addDeals(dtTitle, dtDescription);
		}
		    
	}

	@Then("^try to export deals$")
	public void try_to_export_deals() throws Exception 	 {
		dealsPage = dealsPage.deleteEvent();
	    
	}


}
