package com.qa.blazedemo.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.blazedemo.Pages.ChooseFlightPage;
import com.qa.blazedemo.Pages.FindFlightPage;
import com.qa.blazedemo.Pages.PurchageflightPage_instructor;
import com.qa.blazedemo.base.TestBase;
import com.qa.blozedemo.utils.Xls_dataProvider;



public class PurchaseFlightTest_Instructor extends TestBase {
	
	PurchageflightPage_instructor pf;
	FindFlightPage ff;
	ChooseFlightPage cf;
	
	@BeforeClass
	public void openbrowser()
	{
		pf = new PurchageflightPage_instructor();
		ff = new FindFlightPage();
		cf = new ChooseFlightPage();
	}
	
	@Test(priority='1')
	public void ChooselightPageTest() throws InterruptedException
	{
		ff.findFlightnoParam();
		cf.chooseflight();
	}
	
	@Test(priority='2', dataProvider = "testdata")
	public void PurchageflightPageTest(String name, String address, String city, String state, 
			String zipCode, String creditCardNumber,String creditCardMonth,
			String creditCardYear, String nameOnCard)
	{
		pf.purchaseflightdetails( name,  address,  city,  state, 
				 zipCode,  creditCardNumber, creditCardMonth,
				 creditCardYear,  nameOnCard);
	}
	
	
	@DataProvider(name="testdata")
	public Object[][] readdata()
	{
		
		Object input[][]=Xls_dataProvider.getTestData("Sheet1");
		
		return input;
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
