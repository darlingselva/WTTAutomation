package Snippet.OVR;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Snippet.TestClass;

import base.Commonmethods;
import pages.AdminPortalElements.Admin_login_page_Elements;

public class LoginSnippet extends TestClass{
	
	public static void login() throws Exception {
		Admin_login_page_Elements admin =  PageFactory.initElements(driver,Admin_login_page_Elements.class);
		Commonmethods.properties_file="Adminportal";
		 String url=base.Commonmethods.getvaluefrompropertiesfile("url");
		 driver.get(url);
		 WebDriverWait wait1 = new WebDriverWait(driver,60);
		Commonmethods base=new Commonmethods(driver,wait1);
		base.Sendkey(admin.ittf_username, Commonmethods.getvaluefrompropertiesfile("admin.username"));
		base.Sendkey(admin.ittf_password, Commonmethods.getvaluefrompropertiesfile("admin.password"));;	        
			base.click(admin.ittf_Sign_button);
			
			//base.wait(12);
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//base.takescreenshoot();
			
			Assert.assertEquals("ITTF-Admin Center", driver.getTitle());
			base.wait(2);
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	      	base.takescreenshoot();
			
			//base.wait(2);
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	

}
