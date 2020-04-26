package com.assignment.stepDefination;

import java.util.Map;

import com.assignment.base.TestBase;
import com.assignment.test.ContactPage;
import com.assignment.test.ErpTest;
import com.assignment.test.HomePage;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ContactPageStepDefination extends ErpTest{
	static HomePage homePage;
	static ContactPage contactPage;
	public ContactPageStepDefination() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	@Before("@Login")
	public void login() throws Exception
	{
		initialization();
		String userid = properties.getProperty("username");
		String password = properties.getProperty("password");
		homePage = login(userid, password);
	}
	@After("@Login")
	public void logout() throws Exception
	{
		ending();
	}

	
	@Given("^check title of webpage$")
	public void check_title_of_webpage() throws Exception {
		homePage = homePage.checkTitle();
	}
	
	@Then("^goto contact page and create new contact$")
	public void goto_contact_page_and_create_new_contact(DataTable credentials) throws Exception  {
		for(Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			contactPage = homePage.clickContact();
			String firstnamee = data.get("firstnamee");
			String lastnamee = data.get("lastnamee");
			String email = data.get("email");
			contactPage = contactPage.addContactDetails(firstnamee, lastnamee, email);
		}
	}

	
	
//	@Given("^click on contact page and create new contact$")
//	public void click_on_contact_page_and_create_new_contact() throws Exception {
//		homePage = homePage.checkTitle();
//		contactPage = homePage.clickContact();
//		
//	
//	}
//
//	@Then("^create event$")
//	public void create_event(DataTable credentials) throws Exception {
//		for(Map<String, String> data : credentials.asMaps(String.class, String.class)) {
//
//			String firstnamee = data.get("firstnamee");
//			String lastnamee = data.get("lastnamee");
//			String email = data.get("email");
//			contactPage = contactPage.addContactDetails(firstnamee, lastnamee, email);
//		}
//		}

}
