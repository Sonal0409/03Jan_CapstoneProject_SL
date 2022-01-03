package com.qa.blazedemo.Pages;

import org.openqa.selenium.By;

import com.qa.blazedemo.base.TestBase;

public class LoginPage extends TestBase {

	public void clickLinkToLoginPage() throws InterruptedException
	{
		driver.findElement(By.linkText("home")).click();
		Thread.sleep(2000);
		
	}
	
	public void verifyloginURL()
	{
		String URL = driver.getCurrentUrl();
		System.out.println("URL of the page is :" + URL);
	}
	
	
	public void logindetails(String useremail, String password) throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys(useremail);
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
}
