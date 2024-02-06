package testcases;

import org.testng.Assert;

import org.testng.annotations.Test;

import base.CommonLocators;
import pages.LoginPage;

public class LoginPageTest extends TestClass{
	LoginPage loginPage;
	CommonLocators L1;
	
	@Test(priority=1)
	public void loginPageTitleTest() throws Exception{
		loginPage = new LoginPage(driver, wait);
		L1 = new CommonLocators();
		
		String title = loginPage.validateLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
		loginPage.demo();		
		
	}
}