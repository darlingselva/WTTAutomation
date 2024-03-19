package Snippet.OES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Snippet.TestClass;
import Snippet.AdminPortal.EventCreationSnippet;
import base.Commonmethods;
import pages.OESelements.OES_Home_page_Elements;


public class OESPlayerentrydetails extends TestClass {

	public static void OEs_playerentrydetails() throws Exception {
		
		//EventCreationSnippet.eventname="Event_nameIOEMYRK";
		OES_Home_page_Elements OEs_home =  PageFactory.initElements(driver,OES_Home_page_Elements.class);
		Commonmethods base=new Commonmethods(driver,wait);	
		base.wait(1);
		OEs_home.text_OEs_searchbar.sendKeys(EventCreationSnippet.eventname.toString());
		base.wait(2);
		String Oesresult="(//div[text()='"+EventCreationSnippet.eventname+"']//parent::div)[1]";
		WebElement Oesresult_element=driver.findElement(By.xpath(Oesresult));
		Oesresult_element.click();
		base.wait(4);
	}
	
	

	

}
