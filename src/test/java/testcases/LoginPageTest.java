package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.CommonLocators;
import pages.LoginPage;

public class LoginPageTest extends TestClass{
	LoginPage loginPage;
	CommonLocators L1;
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		loginPage = new LoginPage(driver, wait);
		L1 = new CommonLocators();
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "#1 Free CRM Power Up your Entire Business Free Forever");
	}
}