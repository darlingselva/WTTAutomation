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
import testcases.TestClass;

import base.Commonmethods;

public class LoginPageTest extends TestClass{
	
	public static Logger logger = Logger.getLogger(LoginPageTest.class);
	

	@Test(priority=1)
	public void admin_portal_loginPageTitleTest() throws Exception{
		
		

		
		Admin_login_page_Elements admin =  PageFactory.initElements(driver,Admin_login_page_Elements.class); 
		
		
		
        Commonmethods base=new Commonmethods(driver,wait);
        
        admin.ittf_username.sendKeys(Commonmethods.getvaluefrompropertiesfile("admin.username"));
        //admin.ittf_password.sendKeys("oesadmin@123");
        admin.ittf_password.sendKeys(Commonmethods.getvaluefrompropertiesfile("admin.password"));
		base.wait(4);
        
		base.click(admin.ittf_Sign_button);
		
		base.wait(12);
		//base.takescreenshoot();
		
		Assert.assertEquals("ITTF-Admin Center", driver.getTitle());
		
		base.wait(2);
		
      	base.takescreenshoot();
		
		base.wait(2);
		
		//System.out.println(CommonPaths.Screenshot_path);
		  
		
	}
	

}