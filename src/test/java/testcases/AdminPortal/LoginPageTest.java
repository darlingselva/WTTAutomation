package testcases.AdminPortal;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.CommonPaths;
import pages.LoginPage;
import pages.AdminPortalElements.Admin_login_page_Elements;
import pages.AdminPortalElements.EventcreationElements;
import Snippet.TestClass;

import base.Commonmethods;
import Snippet.AdminPortal.*;
public class LoginPageTest extends TestClass{
	
	public static Logger logger = Logger.getLogger(LoginPageTest.class);
	

	@Test(priority=1)
	public void admin_portal_loginPageTitleTest() throws Exception{
	
		
		LoginSnippet.login();
		
		
	}
	

}