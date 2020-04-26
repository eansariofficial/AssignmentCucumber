package com.assignment.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.assignment.base.Features;
import com.assignment.base.TestBase;



public class HomePage extends TestBase {
	
	String clkContact = "//span[text()='Contacts']";
	String clkDeals = "//span[text()='Deals']";
	String clkTasks = "//span[text()='Tasks']";
	String clkCases = "//a[@href='/cases']";
	String clkCall = "//span[text()='Calls']";
	String pageName = "//div[@class='ui header item mb5 light-black']";
	String clkCompany 								= "//span[text()='Companies']";

	public HomePage() throws Exception { 
		PageFactory.initElements(driver, this);
	}
	
	public HomePage checkTitle() throws Exception {
		String title = driver.getTitle();
		if(title.equals("Cogmento CRM"))
			System.out.println("--SITE VISITED--"+title);
		return new HomePage();
		
	}
	public  HomePage checkPageName() throws Exception
	{
		String element = driver.findElement(By.xpath(pageName)).getText();
		
		return new HomePage();
	}

	public ContactPage clickContact() throws Exception
	{
		Features sel = new Features(driver);
		sel.xp(clkContact).click();

		return new ContactPage();
		
	}
	public CompanyPage clickCompanies() throws Exception
	{
		Features sel = new Features(driver);
		sel.xp(clkCompany).click();

		return new CompanyPage();
		
	}
	public DealsPage clickDealsPage() throws Exception
	{
		Features sel = new Features(driver);
		sel.xp(clkDeals).click();
		return new DealsPage();
	}
//
//	public DealsPage gotoEvent() throws Exception {
//		Features sel = new Features(driver);
//		sel.xp(clkDeals).click();
//
//		return new DealsPage();
//	}
//
	public TaskPage gotoTaskPage() throws Exception {
		Features sel = new Features(driver);
		sel.xp(clkTasks).click();

		return new TaskPage();
	}
//
	public CasesPage gotoCases() throws Exception {
		Features sel = new Features(driver);
		sel.xp(clkCases).click();

		return new CasesPage();
	}
//
	public CallsPage gotoCAlls() throws Exception {
		Features sel = new Features(driver);
		sel.xp(clkCall).click();

		return new CallsPage();
	}
	

	

}
