package Snippet.OES;

import org.openqa.selenium.support.PageFactory;

import Snippet.TestClass;
import base.Commonmethods;
import pages.OESelements.OES_login_page_Elements;

public class OESLogoutSnippet  extends TestClass{
	
	public static void logout() throws Exception {
		OES_login_page_Elements OEs =  PageFactory.initElements(driver,OES_login_page_Elements.class);
		Commonmethods base=new Commonmethods(driver,wait);
		base.wait(1);
		OEs.button_OEs_logout.click();
		base.wait(2);
	}

}
