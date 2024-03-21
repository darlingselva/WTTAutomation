package testcases.OES;

import org.testng.annotations.Test;

import Snippet.TestClass;
import Snippet.AdminPortal.EventCreationSnippet;
import Snippet.AdminPortal.EventpublishtoOESSnippet;
import Snippet.AdminPortal.LoginSnippet;
import Snippet.AdminPortal.LogoutSnippet;
import Snippet.AdminPortal.SubEventCreationSnippet;
import Snippet.OES.OESLoginSnippet;
import Snippet.OES.OESLogoutSnippet;
import Snippet.OES.OESPlayerentrydetails;

public class OESPlayerEntryDetailsOpenSubevents extends TestClass {

	@Test
public static void OEsplayerentrydetailsopensubevents() throws Exception {
		
		LoginSnippet.login();
	     EventCreationSnippet.Adminportal_event_creation();
	     LogoutSnippet.Adminportal_logout();
		 LoginSnippet.login();
		SubEventCreationSnippet.Adminportal_Subevent_creation("Open");
		LogoutSnippet.Adminportal_logout();
		LoginSnippet.login();
		EventpublishtoOESSnippet.Adminportal_event_publish_into_OEs();
		LogoutSnippet.Adminportal_logout();
	 
		OESLoginSnippet.login();
		OESPlayerentrydetails.OEs_playerentrydetails();
		OESLogoutSnippet.logout();
		
	}

}
