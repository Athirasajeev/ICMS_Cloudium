package com.imcs.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.imcs.Actions.Action;
import com.imcs.BaseClass.BaseClass;

public class LoginPage extends BaseClass{
	WebDriver driver;
	@FindBy(id="loginform-username")
	WebElement username;
	@FindBy(id="loginform-password")
	WebElement password;
	@FindBy(xpath="//div[@id='passwordError']")
	WebElement passwordError;
	@FindBy(id="idA_PWD_ForgotPassword")
	WebElement forgotlink;
	@FindBy(id="i0116")
	WebElement userNameTxt;
	@FindBy(id="i0118")
	WebElement passwordTxt;
	@FindBy(id="usernameError")
	WebElement usernameError;
	@FindBy(id="KmsiCheckboxField")
	WebElement dontshowit;


	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public WebElement ToClickUsername()
	{
		return username;
	}
	public WebElement isDisplayedPasswordError()
	{
		return passwordError;
	}
	public WebElement isDisplayedForgotLink()
	{
		return forgotlink;
	}
	public WebElement enterUsername()
	{
		return userNameTxt;
	}
	public WebElement enterPassword()
	{
		return passwordTxt;
	}
	public WebElement isDisplayeduserError()
	{
		return usernameError;
	}
	public WebElement toclickDontShowItAgain()
	{
		return dontshowit;
	}
	public void loginfun(String user,String pass) throws InterruptedException
	{
		Action act=new Action();
		act.type(userNameTxt, user);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(4000);
		act.type(passwordTxt, pass);
		Thread.sleep(4000);
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(3000);
		act.click(driver, dontshowit);
		driver.findElement(By.id("idBtn_Back")).click();
		Thread.sleep(5000);

	}

}
