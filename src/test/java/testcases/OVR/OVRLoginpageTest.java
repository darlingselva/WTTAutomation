package testcases.OVR;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.CommonPaths;
import base.Commonmethods;
import pages.AdminPortalElements.Admin_login_page_Elements;
import Snippet.TestClass;
import testcases.AdminPortal.LoginPageTest;

public class OVRLoginpageTest extends TestClass{
	
public static Logger logger = Logger.getLogger(LoginPageTest.class);
	

	@Test(priority=1)
	public void admin_portal_loginPageTitleTest() throws Exception{
		
		

		
		Admin_login_page_Elements admin =  PageFactory.initElements(driver,Admin_login_page_Elements.class); 
		
        Commonmethods base=new Commonmethods(driver,wait);
        
        admin.ittf_username.sendKeys("oesadmin@wtt.com");
        admin.ittf_password.sendKeys("oesadmin@123");
		base.wait(4);
        
		base.click(admin.ittf_Sign_button);
		
		base.wait(12);
		base.takescreenshoot();
		
		Assert.assertEquals("ITTF-Admin Center", driver.getTitle());
		
		System.out.println(CommonPaths.Screenshot_path);
	}

}
