package testcases.OES;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Snippet.TestClass;
import Snippet.OES.OESLoginSnippet;
import Snippet.OES.OESLogoutSnippet;
import testcases.AdminPortal.LoginPageTest;
public class OESloginpageTest extends TestClass{

	public static Logger logger = Logger.getLogger(LoginPageTest.class);


	@Test(priority=1)
	public void OES_portal_loginPageTitleTest() throws Exception{

		OESLoginSnippet.login();
		OESLogoutSnippet.logout();
	}
}
