package Snippet.AdminPortal;

import org.openqa.selenium.support.PageFactory;

import Snippet.TestClass;
import base.Commonmethods;
import pages.AdminPortalElements.EventcreationElements;
import pages.AdminPortalElements.SubEventcreationElements;

public class SubEventCreationSnippet extends TestClass{
	
	public static void Adminportal_Subevent_creation() throws Exception {
		
		LoginSnippet.login();
		EventcreationElements event =  PageFactory.initElements(driver,EventcreationElements.class);
		SubEventcreationElements subevent =  PageFactory.initElements(driver,SubEventcreationElements.class);
		Commonmethods base=new Commonmethods(driver,wait);
		
		event.tab_event.click();
		base.wait(2);
		
		subevent.text_event_globalsearch.sendKeys("2755");
		base.wait(2);
		subevent.button_event_searchresult.click();
		base.wait(2);
		subevent.tab_subevents.click();
		base.wait(2);
		subevent.button_create_subevents.click();
		
	}

}
