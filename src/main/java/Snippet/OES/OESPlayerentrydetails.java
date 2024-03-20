package Snippet.OES;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Snippet.TestClass;
import Snippet.AdminPortal.EventCreationSnippet;
import Snippet.AdminPortal.SubEventCreationSnippet;
import base.Commonmethods;
import pages.OESelements.OES_Home_page_Elements;
import pages.OESelements.OES_Playerentries_page_Elements;
import pages.OESelements.OES_event_page_Elements;
import util.Fileuploadrobotclass;
import util.TestDataReader;


public class OESPlayerentrydetails extends TestClass {

	public static void OEs_playerentrydetails() throws Exception {
		
		EventCreationSnippet.eventname="Event_nameALYXDWV";
		SubEventCreationSnippet.subeventype1="Closed";
		OES_Home_page_Elements OEs_home =  PageFactory.initElements(driver,OES_Home_page_Elements.class);
		OES_event_page_Elements OEs_event =  PageFactory.initElements(driver,OES_event_page_Elements.class);
		OES_Playerentries_page_Elements OEs_player =  PageFactory.initElements(driver,OES_Playerentries_page_Elements.class);
		Commonmethods base=new Commonmethods(driver,wait);	
		base.wait(1);
		OEs_home.text_OEs_searchbar.sendKeys(EventCreationSnippet.eventname.toString());
		base.wait(2);
		String Oesresult="(//div[text()='"+EventCreationSnippet.eventname+"']//parent::div)[1]";
		WebElement Oesresult_element=driver.findElement(By.xpath(Oesresult));
		Oesresult_element.click();
		base.wait(4);
		OEs_event.button_OEs_event_PlayerEntries.click();
		base.wait(3);
		//OEs_player.button_OEs_event_playerentries_subeventslist.click();
		
		List<WebElement> listOfElements=driver.findElements(By.xpath("//sub-event-entries-list//div[@class='row m0']//div[@class='eventslist-card']"));
		
		System.out.println("list of number="+listOfElements.size());
		base.wait(1);
		
		String listevent;
		WebElement listdeventelement;
		if(SubEventCreationSnippet.subeventype1.equals("Closed")) {
		for(int i=0;i<listOfElements.size();i++) {
			base.wait(2);
		listevent="(//sub-event-entries-list//div[@class='row m0']//div[@class='eventslist-card'])"+"["+(i+1)+"]"+"//div[@class='eventscard-title']";
		listdeventelement=driver.findElement(By.xpath(listevent));
			
			//System.out.println(listdeventelement.getText());
			
			base.wait(1);
			base.checkelementvisibility(listdeventelement);
		base.wait(2);
		listdeventelement.click();
		base.wait(2);
		OEs_player.button_OEs_event_playerentries_Actions.click();
		base.wait(2);
		OEs_player.button_OEs_event_playerentries_Actions_PrefillEntries.click();
		base.wait(4);
		OEs_player.button_OEs_event_playerentries_Actions_PrefillEntries_PullfromRanking.click();
		base.wait(2);
		OEs_player.button_OEs_event_playerentries_Actions_PrefillEntries_MainDraw.click();
		base.wait(2);
		OEs_player.button_OEs_event_playerentries_Actions_PrefillEntries_QualificationDraw.click();
		base.wait(2);
		OEs_player.button_OEs_event_playerentries_Actions_PrefillEntries_UpdateEntries.click();
		base.wait(2);
		Assert.assertEquals(driver.switchTo().alert().getText(), "Are you sure want to update entries ? (Caution : this will clear your existing entries)");
		base.wait(1);
		driver.switchTo().alert().accept();
		base.wait(12);
		OEs_player.button_OEs_event_playerentries_Back.click();
		base.wait(2);
		
		}
		}
		else if(SubEventCreationSnippet.subeventype1.equals("Open")) {
			for(int i=0;i<listOfElements.size();i++) {
				
				base.wait(2);
				listevent="(//sub-event-entries-list//div[@class='row m0']//div[@class='eventslist-card'])"+"["+(i+1)+"]"+"//div[@class='eventscard-title']";
				listdeventelement=driver.findElement(By.xpath(listevent));
					
					//System.out.println(listdeventelement.getText());
					
					base.wait(1);
					base.checkelementvisibility(listdeventelement);
				base.wait(2);
				listdeventelement.click();
				base.wait(2);
			OEs_player.button_OEs_event_playerentries_Actions.click();
			base.wait(2);
			OEs_player.button_OEs_event_playerentries_Actions_ImportRecords.click();
			base.wait(2);
			OEs_player.filebutton_OEs_event_playerentries_Actions_ImportRecords_ChooseFile.click();
			base.wait(2);
			 Fileuploadrobotclass.fileuploadmethod(TestDataReader.TestdataArray[i].toString());
			 base.wait(12);
			 OEs_player.button_OEs_event_playerentries_Actions_ImportRecords_ImportRecords.click();
			 OEs_player.button_OEs_event_playerentries_Back.click();
		     base.wait(2);
			}
			
		}
		else {
			
		}
	}
	
	

	

}
