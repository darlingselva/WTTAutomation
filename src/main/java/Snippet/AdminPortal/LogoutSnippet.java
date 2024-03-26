package Snippet.AdminPortal;

import org.openqa.selenium.support.PageFactory;

import Snippet.TestClass;
import base.Commonmethods;
import pages.AdminPortalElements.Admin_login_page_Elements;

public class LogoutSnippet extends TestClass {

	public static void Adminportal_logout() throws Exception {

		Admin_login_page_Elements admin =  PageFactory.initElements(driver,Admin_login_page_Elements.class);

		Commonmethods base=new Commonmethods(driver,wait);

		base.wait(2);

		admin.ittf_logout_button.click();

	}
}
