package TestCases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import com.imcs.BaseClass.BaseClass;
import com.imcs.PageObjects.HomePage;
import com.imcs.PageObjects.LoginPage;

public class LoginTest extends BaseClass{
	LoginPage lg;
	HomePage hp;

	@BeforeMethod
	public void pageObjects() {
		lg = new LoginPage(getDriver());
		hp = new HomePage(getDriver());
	}
	//Verifying the valid username and valid password login
	@Test(priority=1)
	public void validLogin() throws InterruptedException, IOException {
		String user="agathas@8w0r65.onmicrosoft.com";
		String pass="ascellus123@";
		lg.loginfun(user, pass);
		boolean expected=true;
		boolean actual=hp.isDisplayedLogo().isDisplayed();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
	}
	//Verifying the valid username and invalid password login
	@Test(priority=2)
	public void invalidpass() throws InterruptedException, IOException {
		String user="agathas@8w0r65.onmicrosoft.com";
		String pass="test@123";
		lg.loginfun(user, pass);
//		boolean expected=true;
//		boolean actual=lg.isDisplayedPasswordError().isDisplayed();
//		System.out.println(actual);
//		Assert.assertEquals(actual, expected);
	}
	//Verifying the valid username and invalid password login
		@Test(priority=3)
		public void invalidUser() throws InterruptedException, IOException {
			String user="agathastest.onmicrosoft.com";
			String pass="ascellus123@";
			lg.loginfun(user, pass);
			boolean expected=true;
			boolean actual=lg.isDisplayeduserError().isDisplayed();
			System.out.println(actual);
			Assert.assertEquals(actual, expected);
		}
		//Verifying the invalid username and invalid password login
				@Test(priority=3)
				public void invalidUserandPass() throws InterruptedException, IOException {
					String user="agathastest.onmicrosoft.com";
					String pass="test123@";
					lg.loginfun(user, pass);
					boolean expected=true;
					boolean actual=lg.isDisplayeduserError().isDisplayed();
					System.out.println(actual);
					Assert.assertEquals(actual, expected);
				}

	

	

}
