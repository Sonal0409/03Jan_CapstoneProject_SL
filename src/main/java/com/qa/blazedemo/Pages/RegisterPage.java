package com.qa.blazedemo.Pages;

import org.openqa.selenium.By;

import com.qa.blazedemo.base.TestBase;

public class RegisterPage extends TestBase{
	
	
	// Action method for the elements to be tested
	
	public void verifytitle()
	{
		String title = driver.getTitle();
		System.out.println("title of the page is :" + title);
	}

	public void clickLinkToRegisterPage() throws InterruptedException
	{
		driver.findElement(By.linkText("home")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
	}
	
	public void verifyRegisterURL()
	{
		String URL = driver.getCurrentUrl();
		System.out.println("URL of the page is :" + URL);
	}
	
	public void RegisterUser(String name, String company, String email, String pwd, String Cpwd)
	{
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("company")).sendKeys(company);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("password-confirm")).sendKeys(Cpwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
	
	
	
	
	
	
	
}
