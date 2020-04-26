package com.assignment.stepDefination;

import java.util.Map;

import com.assignment.test.ErpTest;
import com.assignment.test.HomePage;
import com.assignment.test.TaskPage;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TaskPageStepDefination  extends ErpTest {
	static HomePage homePage;
	static TaskPage taskPage;
	public TaskPageStepDefination() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	@Before("@Task")
	public void login() throws Exception
	{
		initialization();
		String userid = properties.getProperty("username");
		String password = properties.getProperty("password");
		homePage = login(userid, password);
	}
	@After("@Task")
	public void logout() throws Exception
	{
		ending();
	}
	
	@Given("^check home page name$")
	public void check_home_page_name() throws Throwable {
		homePage = homePage.checkTitle();
	}

	@Then("^create new Task$")
	public void create_new_Task(DataTable credentials) throws Exception {
		for(Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			String dtTitle = data.get("Title");
			String dtDescription = data.get("Description");
			taskPage = homePage.gotoTaskPage();
			taskPage = taskPage.addTask(dtTitle, dtDescription);
	}

	}
}
