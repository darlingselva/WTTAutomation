package Snippet.AdminPortal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Snippet.TestClass;
import base.Commonmethods;
import pages.AdminPortalElements.Admin_login_page_Elements;
import pages.AdminPortalElements.EventcreationElements;
import pages.AdminPortalElements.SubEventcreationElements;
import util.TestDataReader;

public class SubEventCreationSnippet extends TestClass{
	
	public static String subeventid="null";
	
	public static void Adminportal_Subevent_creation() throws Exception {
		
	
		//LoginSnippet.login();
		//EventCreationSnippet.Adminportal_event_creation();
		Admin_login_page_Elements admin =  PageFactory.initElements(driver,Admin_login_page_Elements.class);
		EventcreationElements event =  PageFactory.initElements(driver,EventcreationElements.class);
		SubEventcreationElements subevent =  PageFactory.initElements(driver,SubEventcreationElements.class);
		Commonmethods base=new Commonmethods(driver,wait);
		
		base.wait(3);
		 String static_eventid="2767";
		event.tab_event.click();
		base.wait(2);
		if (EventCreationSnippet.eventid!= null) {
	    subevent.text_event_globalsearch.sendKeys(EventCreationSnippet.eventid);
		}
		else {
			subevent.text_event_globalsearch.sendKeys(static_eventid);
		}
		base.wait(2);
		
		
		WebElement b;
		TestDataReader.tetsdatareader("SubEventcreation.xlsx");
		for(int i=0;i<TestDataReader.TestheaderArray.length;i++) {
			String[] a=TestDataReader.TestheaderArray[i].toString().split("_");
		switch(a[0].toString()) {
		case "tab":
			 b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
			 base.checkelementvisibility(b);
			 base.wait(3);
			 b.click();
			 base.wait(1);
			 break;			 
		case "button":
			try {
			 b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
			 base.checkelementvisibility(b);
			 b.click();
			 base.wait(1);
			}
			catch(Exception e) {
				b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
				 base.checkelementvisibility(b);
				base.jclick(b);
				 base.wait(1);
			}
			 break;
		case "text":
			 b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
			 base.checkelementvisibility(b);
			 b.clear();
			 b.sendKeys(TestDataReader.TestdataArray[i].toString());
			 base.wait(1);
			 break;
		case "textarea":
			 b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
			 base.checkelementvisibility(b);
			 b.clear();
			 b.sendKeys(TestDataReader.TestdataArray[i].toString());
			 base.wait(1);
			 break;			 
		case "searchtext":
			b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
			 base.checkelementvisibility(b);
			b.sendKeys(TestDataReader.TestdataArray[i].toString());
			base.wait(1);
			b.sendKeys(Keys.ENTER);
			base.wait(1);
			break;
		case "toggle":
			try {
			 b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
			 base.checkelementvisibility(b);
			 b.click();
			 base.wait(1);
			}
			catch(Exception e) {
				b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
				 base.checkelementvisibility(b);
				base.jclick(b);
				 base.wait(1);
			}
			 break;			 
		case "checkbox":
			 b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
			 base.checkelementvisibility(b);
			 base.jclick(b);
			 base.wait(1);
			 break;
		case "bartext":
			 b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
			 base.checkelementvisibility(b);
			 b.clear();
			 b.sendKeys(TestDataReader.TestdataArray[i].toString());
			 base.wait(1);
			 break;	 		 
		case "date":
			
			 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyy, HH:mm:ss");
			 if(a[a.length-1].contains("Start")) {
				 b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
				 base.checkelementvisibility(b);
		      LocalDateTime now = LocalDateTime.now(); 
		      String date_var=dtf.format(now).toString();
		      b.sendKeys(date_var);
		      base.wait(2);
			 }
			 else if(a[a.length-1].contains("End")) {
				 b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
				 base.checkelementvisibility(b);
				 LocalDateTime now = LocalDateTime.now().plusDays(1); 
			      String date_var=dtf.format(now).toString();
			      b.sendKeys(date_var);
			      base.wait(2);
			 }
			 else if(a[a.length-1].contains("From")) {
				 b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
				 base.checkelementvisibility(b);
			      LocalDateTime now = LocalDateTime.now(); 
			      String date_var=dtf.format(now).toString();
			      b.sendKeys(date_var);
			      base.wait(2);
			 }
			 else if(a[a.length-1].contains("To")) {
				 b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
				 base.checkelementvisibility(b);
				 LocalDateTime now = LocalDateTime.now().plusDays(1); 
			      String date_var=dtf.format(now).toString();
			      b.sendKeys(date_var);
			      base.wait(2);
			 }
			 else {
				 b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
				 base.checkelementvisibility(b);
			      LocalDateTime now = LocalDateTime.now(); 
			      String date_var=dtf.format(now).toString();
			      b.sendKeys(date_var);
			      base.wait(2);
			 }
			 break;	 	 
		default:
			break;
		}
	
		
		}
		
		
		String subreventsuccesspopmessage=subevent.text1_subevents_successpopupmessage.getText();
		
		Assert.assertEquals(subreventsuccesspopmessage, "Sub Event Added Successfully");
		
		base.wait(3);
		String tempsubeventid=subevent.text1_subevents_subeventdeails.getText();
		
		String[] tempsubeventid1=tempsubeventid.toString().split("#");
		
		subeventid=tempsubeventid1[1].toString();
		
		System.out.println("Sub event id="+subeventid);
		
		base.takescreenshoot("subevent");
		
		//admin.ittf_logout_button.click();
		
		
		
	  
	}

}
