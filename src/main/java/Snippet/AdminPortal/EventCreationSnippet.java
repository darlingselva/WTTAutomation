package Snippet.AdminPortal;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Snippet.TestClass;
import base.ActionFunctions;
import base.Commonmethods;
import pages.AdminPortalElements.EventcreationElements;
import util.Testutil;
import util.TestDataReader;


public class EventCreationSnippet extends TestClass{
	
	
	public static void Adminportal_event_creation() throws Exception {
	     LoginSnippet.login();
		EventcreationElements event =  PageFactory.initElements(driver,EventcreationElements.class);
		Commonmethods base=new Commonmethods(driver,wait);	
		
		
		WebElement b;
		TestDataReader.tetsdatareader("TestData.xlsx");
		for(int i=0;i<TestDataReader.TestheaderArray.length;i++) {
			String[] a=TestDataReader.TestheaderArray[i].toString().split("_");
		switch(a[0].toString()) {
		case "tab":
			 b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
			 b.click();
			 base.wait(1);
			 break;			 
		case "button":
			try {
			 b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
			 b.click();
			 base.wait(1);
			}
			catch(Exception e) {
				b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
				base.wait(1);
				base.jclick(b);
				 base.wait(1);
			}
			 break;
		case "text":
			 b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
			 b.clear();
			 b.sendKeys(TestDataReader.TestdataArray[i].toString());
			 base.wait(1);
			 break;
		case "textarea":
			 b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
			 b.clear();
			 b.sendKeys(TestDataReader.TestdataArray[i].toString());
			 base.wait(1);
			 break;			 
		case "searchtext":
			b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
			b.sendKeys(TestDataReader.TestdataArray[i].toString());
			base.wait(1);
			b.sendKeys(Keys.ENTER);
			base.wait(1);
			break;
		case "toggle":
			try {
			 b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
			 b.click();
			 base.wait(1);
			}
			catch(Exception e) {
				b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
				base.wait(1);
				base.jclick(b);
				 base.wait(1);
			}
			 break;			 
		case "checkbox":
			 b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
			 base.wait(1);
			 base.jclick(b);
			 base.wait(1);
			 break;
		case "bartext":
			 b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
			 b.clear();
			 b.sendKeys(TestDataReader.TestdataArray[i].toString());
			 base.wait(1);
			 break;	 		 
		case "date":
			
			 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyy, HH:mm:ss");
			 if(a[a.length-1].contains("Start")) {
				 b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
		      LocalDateTime now = LocalDateTime.now(); 
		      String date_var=dtf.format(now).toString();
		      b.sendKeys(date_var);
			 }
			 else if(a[a.length-1].contains("End")) {
				 b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
				 LocalDateTime now = LocalDateTime.now().plusDays(1); 
			      String date_var=dtf.format(now).toString();
			      b.sendKeys(date_var);
			 }
			 else if(a[a.length-1].contains("From")) {
				 b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
			      LocalDateTime now = LocalDateTime.now(); 
			      String date_var=dtf.format(now).toString();
			      b.sendKeys(date_var);
			 }
			 else if(a[a.length-1].contains("To")) {
				 b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
				 LocalDateTime now = LocalDateTime.now().plusDays(1); 
			      String date_var=dtf.format(now).toString();
			      b.sendKeys(date_var);
			 }
			 else {
				 b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
			      LocalDateTime now = LocalDateTime.now(); 
			      String date_var=dtf.format(now).toString();
			      b.sendKeys(date_var);
			 }
			 base.wait(1);
			 break;	 	 
		default:
			break;
		}
	
		
		}
		
		base.wait(5);
		base.takescreenshoot("eventcreation");
		
		
		/*
		event.tab_event.click();
		event.button_event_core_tab_creation.click();
		event.tab_event_creation_Competition.click();
		event.tab_event_creation_ParticipantOrganizations.click();
		event.tab_event_creation_ProfileQuotas.click();
		event.tab_event_creation_KeyPersons.click();
		event.tab_event_creation_Dates.click();
		event.tab_event_creation_Draws.click();
		event.tab_event_creation_MatchConfiguration.click();
		event.tab_event_creation_Logos.click();
		event.tab_event_creation_Equipment.click();
		event.tab_event_creation_OnlineEntrySystem.click();
		event.tab_event_creation_PaymentOptions.click();
		event.tab_event_creation_TournamentFee.click();
		event.tab_event_creation_NonMATournamentFee.click();
		event.tab_event_creation_Hospitality.click();
		event.tab_event_creation_NonMAHospitality.click();
		event.tab_event_creation_Miscellaneous.click();
		event.tab_event_creation_Travel.click();
		event.tab_event_creation_Transportation.click();
		
		 base.wait(2);
		event.tab_event_creation_Sponsors.click();	
		base.wait(2);
		event.button_event_creation_Sponsors_AddNew.click();	
		base.wait(2);
		event.text_event_creation_Sponsors_AddSponsorInformation_SponsorName.sendKeys("test");
		base.wait(2);
		event.text_event_creation_Sponsors_AddSponsorInformation_SponsorLink.sendKeys("test");
		base.wait(2);
		event.text_event_creation_Sponsors_AddSponsorInformation_Priority.sendKeys("test");	
		base.wait(2);
		event.button_event_creation_Sponsors_AddSponsorInformation_SponsorCoreType.click();
		base.wait(2);
		event.bartext_event_creation_Sponsors_AddSponsorInformation_SponsorCoreTypesearch.sendKeys("ittf");
		base.wait(2);
		base.jclick(event.checkbox_event_creation_Sponsors_AddSponsorInformation_SponsorCoreTypesearchresult);
		base.wait(2);	
		event.button_event_creation_Sponsors_AddSponsorInformation_SponsorType.click();
		base.wait(2);
		event.bartext_event_creation_Sponsors_AddSponsorInformation_SponsorTypesearch.sendKeys("free");
		base.wait(2);
		base.jclick(event.checkbox_event_creation_Sponsors_AddSponsorInformation_SponsorTypesearchresult);
		base.wait(2);	
		event.button_event_creation_Sponsors_AddSponsorInformation_Organization.click();
		base.wait(2);
		event.searchtext_event_creation_Sponsors_AddSponsorInformation_SearchOrganization.sendKeys("india");
		base.wait(2);
		event.searchtext_event_creation_Sponsors_AddSponsorInformation_SearchOrganization.sendKeys(Keys.ENTER);
		base.wait(2);
		event.button_event_creation_Sponsors_AddSponsorInformation_Proceed.click();
		base.wait(12);
       */
	}
	
	public static void main(String[] args) {
		TestDataReader.tetsdatareader("TestData.xlsx");
		for(int i=0;i<TestDataReader.TestheaderArray.length;i++) {
			String[] a=TestDataReader.TestheaderArray[i].toString().split("_");
			//System.out.println(a[0].toString());
			
			switch(a[0].toString()) {
			
			case "date":
				 System.out.println(TestDataReader.TestheaderArray[i].toString());
				System.out.println("length="+a.length);
				 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyy, HH:mm:ss");
				 if(a[a.length-1].toString().contains("Start")) {
					 System.out.println(TestDataReader.TestheaderArray[i].toString());
			      LocalDateTime now = LocalDateTime.now(); 
			      String date_var=dtf.format(now).toString();
			      
				 }
				 else if(a[a.length-1].toString().contains("End")) {
					System.out.println(TestDataReader.TestheaderArray[i].toString());
					 LocalDateTime now = LocalDateTime.now().plusDays(1); 
				      String date_var=dtf.format(now).toString();
				 }
				 else {
					 System.out.println("not available");
				 }
				 
				 break;	 	 
			default:
				break;
			}
			}
		
	}
   
}
