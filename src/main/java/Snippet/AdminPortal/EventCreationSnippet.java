package Snippet.AdminPortal;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Snippet.TestClass;
import base.Commonmethods;
import pages.AdminPortalElements.Admin_login_page_Elements;
import pages.AdminPortalElements.EventcreationElements;
import util.Fileuploadrobotclass;
import util.TestDataReader;


public class EventCreationSnippet extends TestClass{
	
	public static String eventid;
	
	public static void Adminportal_event_creation() throws Exception {
	     //LoginSnippet.login();
		EventcreationElements event =  PageFactory.initElements(driver,EventcreationElements.class);
		Admin_login_page_Elements admin =  PageFactory.initElements(driver,Admin_login_page_Elements.class);
		Commonmethods base=new Commonmethods(driver,wait);	
		
	
		WebElement b;
		TestDataReader.tetsdatareader("Eventcreation.xlsx");
		for(int i=0;i<TestDataReader.TestheaderArray.length;i++) {
			String[] a=TestDataReader.TestheaderArray[i].toString().split("_");
		switch(a[0].toString()) {
		case "tab":
			 b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
			 base.checkelementvisibility(b);
			 base.wait(3);
			 b.click();
			 base.wait(1);
			 break;			 
		case "button":
			try {
			 b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
			 base.checkelementvisibility(b);
			 b.click();
			 base.wait(1);
			}
			catch(Exception e) {
				b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
				 base.checkelementvisibility(b);
				base.jclick(b);
				 base.wait(1);
			}
			 break;
		case "text":
			 b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
			 base.checkelementvisibility(b);
			 b.clear();
			 b.sendKeys(TestDataReader.TestdataArray[i].toString());
			 base.wait(1);
			 break;
		case "textarea":
			 b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
			 base.checkelementvisibility(b);
			 b.clear();
			 b.sendKeys(TestDataReader.TestdataArray[i].toString());
			 base.wait(1);
			 break;			 
		case "searchtext":
			b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
			 base.checkelementvisibility(b);
			b.sendKeys(TestDataReader.TestdataArray[i].toString());
			base.wait(1);
			b.sendKeys(Keys.ENTER);
			base.wait(1);
			break;
		case "toggle":
			try {
			 b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
			 base.checkelementvisibility(b);
			 b.click();
			 base.wait(1);
			}
			catch(Exception e) {
				b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
				 base.checkelementvisibility(b);
				base.jclick(b);
				 base.wait(1);
			}
			 break;			 
		case "checkbox":
			 b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
			 base.checkelementvisibility(b);
			 base.jclick(b);
			 base.wait(1);
			 break;
		case "bartext":
			 b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
			 base.checkelementvisibility(b);
			 b.clear();
			 b.sendKeys(TestDataReader.TestdataArray[i].toString());
			 base.wait(1);
			 break;	 		 
		case "date":
			
			 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyy, HH:mm:ss");
			 if(a[a.length-1].contains("Start")) {
				 b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
				 base.checkelementvisibility(b);
		      LocalDateTime now = LocalDateTime.now(); 
		      String date_var=dtf.format(now).toString();
		      b.sendKeys(date_var);
			 }
			 else if(a[a.length-1].contains("End")) {
				 b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
				 base.checkelementvisibility(b);
				 LocalDateTime now = LocalDateTime.now().plusDays(1); 
			      String date_var=dtf.format(now).toString();
			      b.sendKeys(date_var);
			 }
			 else if(a[a.length-1].contains("From")) {
				 b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
				 base.checkelementvisibility(b);
			      LocalDateTime now = LocalDateTime.now(); 
			      String date_var=dtf.format(now).toString();
			      b.sendKeys(date_var);
			 }
			 else if(a[a.length-1].contains("To")) {
				 b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
				 base.checkelementvisibility(b);
				 LocalDateTime now = LocalDateTime.now().plusDays(1); 
			      String date_var=dtf.format(now).toString();
			      b.sendKeys(date_var);
			 }
			 else {
				 b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
				 base.checkelementvisibility(b);
			      LocalDateTime now = LocalDateTime.now(); 
			      String date_var=dtf.format(now).toString();
			      b.sendKeys(date_var);
			 }
			 break;
		
		case "filebutton":
			try {
			 b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
			 base.checkelementvisibility(b);
			 b.click();
			 base.wait(3);
			 Fileuploadrobotclass.fileuploadmethod(TestDataReader.TestdataArray[i].toString());
			 base.wait(3);
			}
			catch(Exception e) {
				b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
				 base.checkelementvisibility(b);
				base.jclick(b);
				base.wait(3);
				 Fileuploadrobotclass.fileuploadmethod(TestDataReader.TestdataArray[i].toString());
				 base.wait(3);
			}
			 
		default:
			break;
		}
	
		
		}
		
		base.wait(5);
		base.jclick(event.button_event_creation_cCreate);
		base.wait(30);
//      String eventsuccesspopmessage=event.text1_event_successpopupmessage.getText();
//		
//		Assert.assertEquals(eventsuccesspopmessage, "Event Added Successfully");
		
		base.wait(3);
		
		try {
		if(event.text1_event_eventdeails.isDisplayed()==true) {
		String tempeventid=event.text1_event_eventdeails.getText();
		
		String[] tempsubeventid1=tempeventid.toString().split("#");
		
		eventid=tempsubeventid1[1].toString();
		
		System.out.println("event id="+eventid);
		base.takescreenshoot("eventcreation");
		}
		else {
			base.takescreenshoot("eventcreationerror");	
		}
		}
		catch(NoSuchElementException e) {
			base.takescreenshoot("eventcreationerror");	
			
		}
		catch(Exception e) {
			base.takescreenshoot("eventcreationerror");	
			e.printStackTrace();
		}
		base.wait(3);
		admin.ittf_logout_button.click();
	
		
       
		
		
	}
	

   
}
