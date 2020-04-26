package com.assignment.test;

import com.assignment.base.Features;
import com.assignment.base.TestBase;

public class CallsPage  extends TestBase{
	public CallsPage() throws Exception {
			
			// TODO Auto-generated constructor stub
		}
	
	String clkCallTimeTextBox 					= "//label[text()='Call Time']//following::input[1]";
	String clkNew 								= "//button[text()='New']";
	String clkType 								= "//div[@name='type']";
	String clkCall 								= "//span[text()='CALL']";
	String edtDuration 							= "//input[@name='duration']";
	String edtDiscription					    = "//textarea[@name='description']";
	String btnSave 								= "//button[text()='Save']";
	String clkCallTime 							= "//li[@class='react-datepicker__time-list-item  react-datepicker__time-list-item--selected']";
	String clkAssignedTo 						= "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div/div/i";
	String clkEhteshamAnsari 					= "//div[@class='selected item']//span[text()='Ehtesham Ansari']";
	
	public CallsPage addCAll(String des, String dur, String callTime) throws Exception
	{
		Features sel = new Features(driver);
		
		sel.xp(clkNew).click();
		sel.xp(clkCallTimeTextBox).type(callTime);
		sel.xp(clkType).click();
		sel.xp(clkCall).click();
		sel.xp(edtDuration).type(dur);
		sel.xp(clkAssignedTo).click();
		sel.xp(clkEhteshamAnsari).click();
		sel.xp(edtDiscription).type(des);
		sel.xp(btnSave).click();

		return new CallsPage();
	}

}
