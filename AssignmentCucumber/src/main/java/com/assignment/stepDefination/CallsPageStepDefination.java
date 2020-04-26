package com.assignment.stepDefination;

import java.util.Map;

import com.assignment.test.CallsPage;
import com.assignment.test.ErpTest;
import com.assignment.test.HomePage;
import com.assignment.test.TaskPage;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CallsPageStepDefination  extends ErpTest {
	static HomePage homePage;
	static CallsPage callsPage;
	public CallsPageStepDefination() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	@Before("@Calls")
	public void login() throws Exception
	{
		initialization();
		String userid = properties.getProperty("username");
		String password = properties.getProperty("password");
		homePage = login(userid, password);
	}
	@After("@Calls")
	public void logout() throws Exception
	{
		ending();
	}
	
	
	@Given("^check home page name in Calls$")
	public void check_home_page_name_in_Calls() throws Exception {
		homePage = homePage.checkTitle(); 
	}

	@Then("^create new Calls$")
	public void create_new_Calls(DataTable credentials) throws Exception {
		for(Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			String dtDuration = data.get("Duration");
			String dtDescription = data.get("Description");
			String dtCallTime = data.get("CallTime");
			callsPage = homePage.gotoCAlls();
			callsPage = callsPage.addCAll(dtDescription, dtDuration, dtCallTime);
	}
	    
	}
}
