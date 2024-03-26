package testcases.AdminPortal;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import Snippet.TestClass;


import Snippet.AdminPortal.*;
public class LoginPageTest extends TestClass{

	public static Logger logger = Logger.getLogger(LoginPageTest.class);


	@Test(priority=1)
	public void admin_portal_loginPageTitleTest() throws Exception{


		LoginSnippet.login();

		LogoutSnippet.Adminportal_logout();
	}


}