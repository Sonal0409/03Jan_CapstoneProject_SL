package com.qa.blazedemo.testcases;

import org.testng.annotations.DataProvider;

import com.qa.blozedemo.utils.Xls_dataProvider;



public class PurchaseFlightTest {
	
	
	
	
	
	@DataProvider(name="testdata")
	public Object[][] readdata()
	{
		
		Object input[][]=Xls_dataProvider.getTestData("Sheet1");
		
		return input;
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
