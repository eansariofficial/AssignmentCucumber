package com.assignment.stepDefination;

import java.util.Map;

import com.assignment.test.CasesPage;
import com.assignment.test.ErpTest;
import com.assignment.test.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CasesStepDefination  extends ErpTest {
	static HomePage homePage;
	static CasesPage casesPage;
	public CasesStepDefination() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	@Before("@Cases")
	public void login() throws Exception
	{
		initialization();
		String userid = properties.getProperty("username");
		String password = properties.getProperty("password");
		homePage = login(userid, password);
	}
	@After("@Cases")
	public void logout() throws Exception
	{
		ending();
	}
	
	@Given("^check home page name at the time of create cases$")
	public void check_home_page_name_at_the_time_of_create_cases() throws Exception {
	   
		homePage = homePage.checkTitle();
	}

	@Then("^create new Cases$")
	public void create_new_Cases(DataTable credentials) throws Exception {
	    
		for(Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			String dtTitle = data.get("Title");
			String dtDescription = data.get("Description");
			casesPage = homePage.gotoCases();
			casesPage = casesPage.addDetailsInCasePage(dtTitle, dtDescription);
	}

	}


	
}
