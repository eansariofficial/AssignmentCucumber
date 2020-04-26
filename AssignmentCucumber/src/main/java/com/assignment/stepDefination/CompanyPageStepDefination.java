package com.assignment.stepDefination;

import java.util.Map;

import com.assignment.test.CompanyPage;
import com.assignment.test.ErpTest;
import com.assignment.test.HomePage;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CompanyPageStepDefination extends ErpTest{
	static HomePage homePage;
	static CompanyPage companyPage;
	public CompanyPageStepDefination() throws Exception {
		super(); 
		// TODO Auto-generated constructor stub
	}

	@Before("@Company")
	public void login() throws Exception
	{
		initialization();
		String userid = properties.getProperty("username");
		String password = properties.getProperty("password");
		homePage = login(userid, password); 
	}
	@After("@Company")
	public void logout() throws Exception
	{
		ending();
	}
	
	@Given("^check page name$")
	public void check_page_name() throws Exception  {
		homePage = homePage.checkTitle();
	   
	}

	@Then("^create company$")
	public void create_company(DataTable credentials) throws Exception  {
		for(Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			companyPage = homePage.clickCompanies();
			String dtCompanyName = data.get("CompanyName");
			String dtStreetAddress = data.get("StreetAddress");
			String dtCity = data.get("City");
			String dtState = data.get("State");
			String dtZip = data.get("Zip");
			String dtCountry = data.get("Country");
			companyPage = companyPage.addCompanyDetails(dtCompanyName, dtStreetAddress, dtCity, dtState, dtZip, dtCountry);
			String dtTitle = data.get("Title");
			String dtDescription = data.get("Description");
			companyPage = companyPage.addDeals(dtTitle, dtDescription);
			
		}
	    
	}
	
	
//	@Then("^add Deals$")
//	public void add_Deals(DataTable credentials) {
//		for(Map<String, String> data : credentials.asMaps(String.class, String.class)) {
//			String dtTitle = data.get("Title");
//			String dtDescription = data.get("Description");
//			companyPage = companyPage.addDeals(dtTitle, dtDescription);
//		}
//	}



}
