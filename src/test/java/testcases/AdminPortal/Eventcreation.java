package testcases.AdminPortal;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Snippet.TestClass;
import Snippet.AdminPortal.EventCreationSnippet;
import Snippet.AdminPortal.LoginSnippet;
import base.Commonmethods;
import pages.AdminPortalElements.EventcreationElements;


public class Eventcreation extends TestClass{
	
	
	
	@Test
	public static void crateevent() throws Exception {
	
		EventCreationSnippet.Adminportal_event_creation();
	
	}
	

}
