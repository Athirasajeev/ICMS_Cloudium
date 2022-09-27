package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import com.imcs.BaseClass.BaseClass;
import com.imcs.PageObjects.HomePage;

public class HomeTest extends BaseClass{
	HomePage hp;

	@BeforeMethod
	public void pageObjects() {
		hp = new HomePage(getDriver());
	}

	@Test
	public void toClickProviderMenu() throws InterruptedException {
		hp.toClickProvider().click();
		Thread.sleep(3000);
		
	}

}
