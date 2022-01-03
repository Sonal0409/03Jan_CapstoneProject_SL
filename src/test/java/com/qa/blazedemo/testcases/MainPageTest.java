package com.qa.blazedemo.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.blazedemo.Pages.MainPage;
import com.qa.blazedemo.base.TestBase;

public class MainPageTest extends TestBase {
	
	MainPage mp;
	
	@BeforeClass
	public void openBrowser()
	{
		
		mp = new MainPage();
	}
	
	
	@Test(priority='1')
	public void clickdestinationTest() throws InterruptedException
	{
		mp.clickdestination();
	}
	
	
	@Test(priority='2')
	public void clickTravellinkTest()
	{
		mp.clickTravellink();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
