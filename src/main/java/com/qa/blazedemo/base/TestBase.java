package com.qa.blazedemo.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

	// write a method to define the global variables and elements needed for the project
	
	public static WebDriver driver;
	
	@BeforeTest
	public static void initialization()
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.get("https://blazedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
	}
	
	@AfterTest
	public void browserClose() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
	
}
