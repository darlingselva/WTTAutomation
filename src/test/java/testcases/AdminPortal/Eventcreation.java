package testcases.AdminPortal;



import org.testng.annotations.Test;
import Snippet.TestClass;
import Snippet.AdminPortal.EventCreationSnippet;
import Snippet.AdminPortal.LoginSnippet;



public class Eventcreation extends TestClass{
	
	
	
	@Test
	public static void crateevent() throws Exception {
		LoginSnippet.login();
	
		EventCreationSnippet.Adminportal_event_creation();
	
	}
	

}
