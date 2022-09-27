package com.imcs.BaseClass;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.imcs.Actions.Action;
import com.imcs.PageObjects.LoginPage;
import com.imcs.Utilities.ExcelRead;

import io.github.bonigarcia.wdm.WebDriverManager;

     public class BaseClass {
	public static Properties prop;
	public static Action act=new Action();
	
	//loadConfig method is to load the configuration
	public static ThreadLocal<RemoteWebDriver> driver=new ThreadLocal<RemoteWebDriver>();
	@BeforeSuite
	public void loadConfig() {
	//	DOMConfigurator.configure("Log4j.xml");
		//ExtentManager.setExtent();

		try {
			 prop = new Properties();
			FileInputStream ip = new FileInputStream(
			System.getProperty("user.dir") + "\\Configurations\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@BeforeMethod
	public void firstCall() throws InterruptedException, AWTException, IOException {
		launchApp();
		
	}
	public static WebDriver getDriver()
	{
		return driver.get();
	}
	public void launchApp() throws InterruptedException, AWTException, IOException {
		
	   String browserName = prop.getProperty("Browser");
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver.set(new ChromeDriver());
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver.set(new FirefoxDriver());
		} else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver.set(new EdgeDriver());
		}
		//Maximize the screen
		getDriver().manage().window().maximize();
		Action action = new Action();
		//Implicit TimeOuts
	    act.implicitWait(getDriver(), 10);
		//PageLoad TimeOuts
		act.pageLoadTimeOut(getDriver(), 30);   
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(3000);
		
		/*WebElement userNameTxt = getDriver().findElement(By.id("i0116")); 
		//WebElement nextBtn = getDriver().findElement(By.id("idSIButton9")); 
		WebElement passwordTxt = getDriver().findElement(By.id("i0118"));
		JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();  	
		// set the text
		jsExecutor.executeScript("arguments[0].value=user", userNameTxt); 
		Thread.sleep(2000);
		getDriver().findElement(By.id("idSIButton9")).click();
		Thread.sleep(2000);
		//jsExecutor.executeScript("arguments[0].value='ascellus123@'", passwordTxt); 
		getDriver().findElement(By.id("i0118")).sendKeys(pass);
		Thread.sleep(2000);
		getDriver().findElement(By.id("idSIButton9")).click();
		Thread.sleep(3000);
		getDriver().findElement(By.id("idBtn_Back")).click();
		//jsExecutor.executeScript("arguments[0].click();", signinBtn);  
		Thread.sleep(5000);*/
			
	}
	@AfterMethod
	public void endbrowser()
	{
		getDriver().close();
	}
	//@AfterSuite
	public void EndGame()
	{
		
	//	ExtentManager.endReport();
	}
	
	}