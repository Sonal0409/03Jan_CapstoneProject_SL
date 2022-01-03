package com.qa.blazedemo.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.blazedemo.Pages.RegisterPage;
import com.qa.blazedemo.base.TestBase;

public class RegisterPageTest extends TestBase {
	
	RegisterPage rp;
	
	@BeforeClass
	public void openBrowser()
	{
	
		rp = new RegisterPage();
	}
	
	@Test(priority='1')
	public void verifytitleTest()
	{
		rp.verifytitle();
	}
	
	@Test(priority='2')
	public void clickLinkToRegisterPageTest() throws InterruptedException
	{
		rp.clickLinkToRegisterPage();
	}
	
	@Test(priority='3')
	public void verifyRegisterURLTest()
	{
		rp.verifyRegisterURL();
	}
	
	@Parameters({"name","company","email","pwd","cpwd"})
	@Test(priority='4')
	public void RegisterUserTest(String name,String company, String email, String pwd, String cpwd)
	{
		rp.RegisterUser(name,company,email,pwd,cpwd);
	}
	

	
	
	
	
	
	
	

}
