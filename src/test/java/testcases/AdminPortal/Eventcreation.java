package testcases.AdminPortal;



import org.testng.annotations.Test;
import Snippet.TestClass;
import Snippet.AdminPortal.EventCreationSnippet;



public class Eventcreation extends TestClass{
	
	
	
	@Test
	public static void crateevent() throws Exception {
	
		EventCreationSnippet.Adminportal_event_creation();
	
	}
	

}
