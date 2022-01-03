package com.qa.blazedemo.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.blazedemo.Pages.LoginPage;
import com.qa.blazedemo.base.TestBase;

public class LoginPageTest extends TestBase {
	
	LoginPage lp;
	
	@BeforeClass
	public void openBrowser()
	{
		
		lp = new LoginPage();
	}
	
	@Test(priority='1')
	public void clickLinkToLoginPageTest() throws InterruptedException
	{
		lp.clickLinkToLoginPage();
	}
	
	@Test(priority='2')
	public void verifyLoginURLTest()
	{
		lp.verifyloginURL();
	}

	@Parameters({"useremail","password"})
	@Test(priority='3')
	public void logindetailsTest(String useremail, String password) throws InterruptedException
	{
		lp.logindetails(useremail,password);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
