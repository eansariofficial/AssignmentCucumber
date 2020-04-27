package com.assignment.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assignment.utility.TestUtil;




public class TestBase {
	TestUtil testutil;
	public static Properties properties;
	public static WebDriver driver;
	String clkSetting 							= "/html/body/div[1]/div/div[2]/div[1]/div[3]/div[2]/div";
	String clkLogOut  							=  "//span[text()='Log Out']";
	String edtemail 					 		= "//input[@name='email']";
	String edtpassword 							= "//input[@name='password']";
	String btnlogin 							= "//div[text()='Login']";
	
	public TestBase() throws Exception
	{
		
		properties = new Properties();
		FileInputStream filelocation = new FileInputStream("C:\\Users\\eht22\\git\\AssignmentCucumber\\AssignmentCucumber\\src\\main\\java\\com\\assignment\\config\\config.properties");
		properties.load(filelocation);
	}
	public void initialization() throws Exception
	{
		 
		String browserName = properties.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",  "C:\\Users\\eht22\\git\\AssignmentCucumber\\AssignmentCucumber\\chrmedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else {
			System.out.println("Not Allowed in another browser");
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(testutil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/");
//		Features sel = new Features(driver);
//		String user = properties.getProperty("username");;
//		String passw = properties.getProperty("password");
//		sel.xp(edtemail).type(user);
//		sel.xp(edtpassword).type(passw);
//		sel.xp(btnlogin).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		public Homepage login(String userid, String pass) throws Exception
//		{
//			
//			
//			return new Homepage();
//		}
		
		
	}
	public void ending() throws Exception
	{
		Features sel = new Features(driver);
		sel.xp(clkSetting).click();
		sel.xp(clkLogOut).click();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
