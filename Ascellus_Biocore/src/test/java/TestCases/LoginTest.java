package TestCases;

import java.io.IOException;

import org.junit.Test;
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
	@Test
	public void Login() throws InterruptedException, IOException {
		String s = ExcelRead.readStringData(1, 1);
		String s2 = ExcelRead.readStringData(1, 2);
		lg.loginfun(s, s2);
		boolean Expected = true;
		HomePage hp = new HomePage(getDriver());
		boolean actual=act.isDisplayed(getDriver(), hp.ToClickdeduction());
		Assert.assertEquals(actual, Expected);
	}
	

	

}
