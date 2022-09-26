package com.imcs.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.imcs.BaseClass.BaseClass;

public class HomePage extends BaseClass{
	WebDriver driver;
	@FindBy(xpath="//span[@class='ng-tns-c230-0 imcs_providers nav-text']")
	WebElement provider;
	@FindBy(xpath="//input[@type='email']")
	WebElement emailinput;
	
	
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public WebElement toClickProvider()
	{
		return provider;
	}
	public WebElement toEnterEmail()
	{
		return emailinput;
	}
}
