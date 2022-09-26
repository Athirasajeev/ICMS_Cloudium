package com.imcs.PageObjects;

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
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public WebElement ToClickUsername()
	{
		return username;
	}
	public void loginfun(String user,String pass)
	{
		Action act=new Action();
		act.type(username, user);
		act.type(password, pass);
	//	act.click(driver, loginbtn);
	}

}
