package Snippet.AdminPortal;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import Snippet.TestClass;
import base.Commonmethods;
import pages.AdminPortalElements.EventcreationElements;
import util.TestDataReader;


public class EventCreationSnippet extends TestClass{
	
	
	public static void Adminportal_event_creation() throws Exception {
	     LoginSnippet.login();
		EventcreationElements event =  PageFactory.initElements(driver,EventcreationElements.class);
		Commonmethods base=new Commonmethods(driver,wait);	
		
		
		WebElement b;
		TestDataReader.tetsdatareader("Eventcreation.xlsx");
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
