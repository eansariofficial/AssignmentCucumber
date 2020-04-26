package com.assignment.test;

import com.assignment.base.Features;
import com.assignment.base.TestBase;


public class TaskPage extends TestBase{
	public TaskPage() throws Exception {
		
		// TODO Auto-generated constructor stub
	}

	String clkExportButton = "//button[text()='Export']";
	String clkOk = "//button[text()='OK']";
	String clkNewDeals 						= "//button[text()='New']" ;
	String doPrivate 								= "//button[@class='ui small fluid positive toggle button']";
	String edtDiscription 							= "//textarea[@name='description']";
	String clkSaveCompanyDetails 					= "//button[text()='Save']";
	String clkTasks = "//span[text()='Tasks']";
	String edtAddTitle 								= "//input[@name='title']";
	
	
	public TaskPage addTask(String title, String des) throws Exception
	{
		Features sel = new Features(driver);
		
		sel.xp(clkNewDeals).click();
		sel.xp(edtAddTitle).type(title);
		sel.xp(doPrivate).click();
		sel.xp(edtDiscription).type(des);
		sel.xp(clkSaveCompanyDetails).click();
		sel.xp(clkTasks).click();

		return new TaskPage();
	}
	
	public void exportTask() throws Exception
	{
		Features sel = new Features(driver);
		sel.xp(clkExportButton).click();
		sel.xp(clkOk).click();

	}
}
