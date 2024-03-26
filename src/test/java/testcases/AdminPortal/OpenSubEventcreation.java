package testcases.AdminPortal;

import org.testng.annotations.Test;

import Snippet.TestClass;
import Snippet.AdminPortal.EventCreationSnippet;
import Snippet.AdminPortal.LoginSnippet;
import Snippet.AdminPortal.LogoutSnippet;
import Snippet.AdminPortal.SubEventCreationSnippet;

public class OpenSubEventcreation extends TestClass {

	@Test
	public static void opensubeventcreation() throws Exception {

		LoginSnippet.login();
		EventCreationSnippet.Adminportal_event_creation();
		LogoutSnippet.Adminportal_logout();
		LoginSnippet.login();
		SubEventCreationSnippet.Adminportal_Subevent_creation("Open");
		LogoutSnippet.Adminportal_logout();


	}

}
