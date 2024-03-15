package testcases.AdminPortal;

import org.testng.annotations.Test;

import Snippet.TestClass;
import Snippet.AdminPortal.EventCreationSnippet;
import Snippet.AdminPortal.LoginSnippet;
import Snippet.AdminPortal.SubEventCreationSnippet;

public class StaticSubEventcreation  extends TestClass {
	
	@Test
public static void staticsubcrateevent() throws Exception {
		
	  
		 LoginSnippet.login();
		SubEventCreationSnippet.Adminportal_Subevent_creation();
	
	}
	

}
