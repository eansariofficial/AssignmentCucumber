package com.assignment.test;

import com.assignment.base.Features;
import com.assignment.base.TestBase;


public class CasesPage extends TestBase{
public CasesPage() throws Exception {
		
		// TODO Auto-generated constructor stub
	}

		String clkNew 								= "//button[text()='New']";
		String edtTitle 							= "//input[@name='title']";
		String clkPrivate 							= "//button[@class='ui small fluid positive toggle button']";
		String clkType 								= "//div[@name='type']";
		String clkTechnicalSupport 					= "//span[text()='Technical Support']";
		String clkCalender 							= "//input[@class='calendarField']";
		String clkEleven 							= "//div[text()='11']";
		String edtDiscription 						= "//textarea[@name='description']";
		String btnPriority 							= "//div[@name='priority']";
		String lnkHigh 								= "//span[text()='High']";
		String clkSave 								= "//button[text()='Save']";
		String clkCases = "//a[@href='/cases']";
		
		public CasesPage addDetailsInCasePage(String addTitle, String addDescription) throws Exception
		{
			Features sel = new Features(driver);
			sel.xp(clkNew).click();
			sel.xp(edtTitle).type(addTitle);
			sel.xp(clkPrivate).click();
			sel.xp(clkType).click();
			sel.xp(clkTechnicalSupport).click();
			sel.xp(clkCalender).click();
			sel.xp(clkEleven).click();
			sel.xp(edtDiscription).type(addDescription);
			sel.xp(btnPriority).click();
			sel.xp(lnkHigh).click();
			sel.xp(clkSave).click();
			

			return new CasesPage();
		}

}
