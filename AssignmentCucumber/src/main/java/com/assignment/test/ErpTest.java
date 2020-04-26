package com.assignment.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.assignment.base.Features;
import com.assignment.base.TestBase;



public class ErpTest extends TestBase {
	String edtemail 							= "//input[@name='email']";
	String edtpassword 							= "//input[@name='password']";
	String btnlogin 							= "//div[text()='Login']";

	 
	public ErpTest() throws Exception{
		super();
		PageFactory.initElements(driver, this);
	}
	public HomePage login(String userid, String pass) throws Exception
	{
		Features sel = new Features(driver);
		String username = userid;
		String passw = pass;
		sel.xp(edtemail).type(userid);
		sel.xp(edtpassword).type(passw);
		sel.xp(btnlogin).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return new HomePage();
	}
	
	

}
