package com.imcs.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.imcs.BaseClass.BaseClass;

public class ProviderPage extends BaseClass{
	WebDriver driver;
	@FindBy(xpath="//span[@class='newprovider']")
	WebElement newprovider;
	@FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c72-97 ng-star-inserted']")
	WebElement providertype;
	@FindBy(xpath="(//span[@class='mat-checkbox-inner-container'])[1]")
	WebElement fulltimecheck;
	@FindBy(id="mat-input-24")
	WebElement providerFname;
	@FindBy(id="mat-input-25")
	WebElement providerinitial;
	@FindBy(id="mat-input-26")
	WebElement providerLname;
	@FindBy(id="mat-input-27")
	WebElement providersalutation;	
	@FindBy(xpath="(//span[@class='mat-radio-outer-circle'])[1]")
	WebElement genderMale;
	@FindBy(xpath="(//span[@class='mat-radio-outer-circle'])[2]")
	WebElement genderFemale;
	@FindBy(css=".mat-datepicker-toggle-default-icon.ng-star-inserted")
	WebElement providerDob;
	@FindBy(css=".mat-select-arrow.ng-tns-c72-104")
	WebElement ethinicity;
	@FindBy(xpath="//input[@formcontrolname='doctor_practice_name']")
	WebElement practicename;
	@FindBy(xpath="//input[@formcontrolname='street1']")
	WebElement street1;
	@FindBy(xpath="//input[@formcontrolname='street2']")
	WebElement street2;
	@FindBy(xpath="//input[@formcontrolname='city']")
	WebElement city;
	@FindBy(css=".mat-select-arrow.ng-tns-c72-118")
	WebElement state;
	@FindBy(xpath="//input[@formcontrolname='zip']")
	WebElement zipcode;
	@FindBy(css=".mat-form-field-infix.ng-tns-c69-120")
	WebElement managername;
	@FindBy(xpath="//input[@formcontrolname='scheduler_name']")
	WebElement schedulername;
	@FindBy(xpath="//input[@formcontrolname='supervisor_name']")
	WebElement supervisorname;
	@FindBy(css=".mat-select-arrow.ng-tns-c72-124")
	WebElement officetype;	
	@FindBy(xpath="//input[@formcontrolname='phone_number']")
	WebElement phone;
	@FindBy(css=".mat-select-arrow.ng-tns-c72-131")
	WebElement phonetype;
	@FindBy(xpath="//input[@formcontrolname='phone_comments']")
	WebElement phonecomments;
	@FindBy(xpath="//input[@formcontrolname='email_id']")
	WebElement email;
	@FindBy(css=".mat-select-arrow.ng-tns-c72-135")
	WebElement emailtype;
	@FindBy(xpath="//input[@formcontrolname='note']")
	WebElement emailcomment;
	@FindBy(css=".mat-select-arrow.ng-tns-c72-126")
	WebElement timezone;
	@FindBy(xpath="(//input[@formcontrolname='from_time'])[1]")
	WebElement fromtimesun;
	@FindBy(xpath="(//input[@formcontrolname='from_time'])[2]")
	WebElement fromtimemon;
	@FindBy(xpath="(//input[@formcontrolname='from_time'])[3]")
	WebElement fromtimetue;
	@FindBy(xpath="(//input[@formcontrolname='from_time'])[4]")
	WebElement fromtimewed;
	@FindBy(xpath="(//input[@formcontrolname='from_time'])[5]")
	WebElement fromtimethu;
	@FindBy(xpath="(//input[@formcontrolname='from_time'])[6]")
	WebElement fromtimefri;
	@FindBy(xpath="(//input[@formcontrolname='from_time'])[7]")
	WebElement fromtimesat;	
	@FindBy(xpath="(//input[@formcontrolname='to_time'])[1]")
	WebElement totimesun;
	@FindBy(xpath="(//input[@formcontrolname='to_time'])[2]")
	WebElement totimemon;
	@FindBy(xpath="(//input[@formcontrolname='to_time'])[3]")
	WebElement totimetue;
	@FindBy(xpath="(//input[@formcontrolname='to_time'])[4]")
	WebElement totimewed;
	@FindBy(xpath="(//input[@formcontrolname='to_time'])[5]")
	WebElement totimethu;
	@FindBy(xpath="(//input[@formcontrolname='to_time'])[6]")
	WebElement totimefri;
	@FindBy(xpath="(//input[@formcontrolname='to_time'])[7]")
	WebElement totimesat;
	@FindBy(xpath="(//span[@class='mat-radio-outer-circle'])[3]")
	WebElement handiAccessYes;
	@FindBy(xpath="(//span[@class='mat-radio-outer-circle'])[4]")
	WebElement handiAccessNo;
	@FindBy(xpath="(//span[@class='mat-radio-outer-circle'])[5]")
	WebElement EmmerCoveYes;
	@FindBy(xpath="(//span[@class='mat-radio-outer-circle'])[6]")
	WebElement EmmerCoveNo;
	@FindBy(xpath="//input[@formcontrolname='comments_handicap']")
	WebElement hadiAccessComment;
	@FindBy(xpath="//input[@formcontrolname='comments_emergancy']")
	WebElement EmerCovComment;
	@FindBy(xpath="(//button[@class='mat-focus-indicator mat-button mat-button-base white'])[1]")
	WebElement addLocation;
	@FindBy(xpath="(//span[@class='mat-checkbox-inner-container'])[2]")
	WebElement sameasloc;
	@FindBy(xpath="//input[@formcontrolname='billing_street1']")
	WebElement billstreet1;
	@FindBy(xpath="//input[@formcontrolname='billing_street2']")
	WebElement billstreet2;	
	@FindBy(xpath="//input[@formcontrolname='billing_city']")
	WebElement billcity;
	@FindBy(xpath="//div[@class='mat-select-arrow-wrapper ng-tns-c72-109']")
	WebElement billstate;
	@FindBy(xpath="//input[@formcontrolname='billing_zip']")
	WebElement billzipcode;
	@FindBy(xpath="(//span[@class='mat-radio-outer-circle'])[7]")
	WebElement willentyes;
	@FindBy(xpath="(//span[@class='mat-radio-outer-circle'])[8]")
	WebElement willentno;
	@FindBy(xpath="(//span[@class='mat-radio-outer-circle'])[9]")
	WebElement premodeemail;
	@FindBy(xpath="(//span[@class='mat-radio-outer-circle'])[10]")
	WebElement premofax;
	@FindBy(xpath="(//span[@class='mat-radio-outer-circle'])[11]")
	WebElement conpreemail;
	@FindBy(xpath="(//span[@class='mat-radio-outer-circle'])[12]")
	WebElement contprephone;
	@FindBy(xpath="(//span[@class='mat-radio-outer-circle'])[13]")
	WebElement contprefax;
	@FindBy(xpath="(//span[@class='mat-radio-outer-circle'])[14]")
	WebElement chasenoteyes;
	@FindBy(xpath="(//span[@class='mat-radio-outer-circle'])[15]")
	WebElement chasenoteno;
	@FindBy(xpath="(//span[@class='mat-radio-outer-circle'])[16]")
	WebElement sharedcalyes;
	@FindBy(xpath="(//span[@class='mat-radio-outer-circle'])[17]")
	WebElement sharedcalno;
	@FindBy(xpath="(//button[@class='mat-focus-indicator mat-button mat-button-base white'])[2]")
	WebElement cancelbutton;
	@FindBy(xpath="(//button[@class='mat-focus-indicator mat-button mat-button-base white'])[3]")
	WebElement savebutton;
	public ProviderPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
//	public WebElement ToClickUsername()
//	{
//	return username;
//	}
}
