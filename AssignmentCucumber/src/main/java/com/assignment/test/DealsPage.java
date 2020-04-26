package com.assignment.test;

import com.assignment.base.Features;
import com.assignment.base.TestBase;


public class DealsPage extends TestBase{

	public DealsPage() throws Exception {
		
		// TODO Auto-generated constructor stub
	}
	String clkCheckBox 							= "//div[@class='ui fitted checkbox']//input[@type='checkbox']";
	String clkDeleteIcon 						= "//button[@class='ui basic button item']";
	String edtDetailsAfterSaving 					= "//button[@class='ui icon button']//i[@class='money icon']";
	String edtAddTitle 								= "//input[@name='title']";
	String doPrivate 								= "//button[@class='ui small fluid positive toggle button']";
	String edtDiscription 							= "//textarea[@name='description']";
	String clkSaveCompanyDetails 					= "//button[text()='Save']";
	String clkDeals									="//span[text()='Deals']";
	String clkNewDeals 						= "//button[text()='New']" ;
	
	public DealsPage addDeals(String title, String des) throws Exception
	{
		Features sel = new Features(driver);
		
		sel.xp(clkNewDeals).click();
		sel.xp(edtAddTitle).type(title);
		sel.xp(doPrivate).click();
		sel.xp(edtDiscription).type(des);
		sel.xp(clkSaveCompanyDetails).click();
		sel.xp(clkDeals).click();

		return new DealsPage();
	}
	
	
	public DealsPage deleteEvent() throws Exception
	{
		Features sel = new Features(driver);
		sel.xp(clkCheckBox).click();
		sel.xp(clkDeleteIcon).click();
	
		return new DealsPage();
	}
}
