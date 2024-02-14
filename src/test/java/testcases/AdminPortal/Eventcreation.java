package testcases.AdminPortal;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.Commonmethods;
import pages.AdminPortalElements.EventcreationElements;
import testcases.TestClass;
import testcases.AdminPortal.LoginPageTest;

public class Eventcreation extends TestClass{
	
	
	
	@Test
	public static void crateevent() throws Exception {
	
		LoginPageTest log=new LoginPageTest();
		log.admin_portal_loginPageTitleTest();
		EventcreationElements event =  PageFactory.initElements(driver,EventcreationElements.class);
		WebDriverWait wait1 = new WebDriverWait(driver,20);
		Commonmethods base=new Commonmethods(driver,wait1);
		event.tab_event.click();
		base.wait(1);
		event.button_event_core_tab_creation.click();
		base.wait(1);
		event.text_event_core_tab_creation_EventName.sendKeys("test");
		base.wait(1);
		event.button_event_core_tab_creation_EventCoreType.click();;
		base.wait(1);
		event.text_event_core_tab_creation_searchEventCoreType.sendKeys("WTT");
		base.wait(1);
		event.text_event_core_tab_creation_searchEventCoreType.sendKeys(Keys.ENTER);
		base.wait(1);
		event.toggle_event_core_tab_creation_IsClosedEvent.click();
		base.wait(1);
	    event.toggle_event_core_tab_creation_IsAIEnabled.click();
	    base.wait(1);
	    event.toggle_event_core_tab_creation_IsBettingEnabled.click();
	    base.wait(1);
	    event.toggle_event_core_tab_creation_IsFrontEndPlatformVisible.click();
	    base.wait(1);
	    event.toggle_event_core_tab_creation_Active.click();
	    base.wait(1);
	    event.toggle_event_core_tab_creation_ShowOrganizerinOES.click();
	    base.wait(1);
	    event.button_event_core_tab_creation_SelectOrganization.click();
	    base.wait(1);
	    event.text_event_core_tab_creation_SelectOrganizationsearch.sendKeys("india");
	    base.wait(3);
		//event.checkbox_event_core_tab_creation_SelectOrganizationsearchresult.click();
	    base.doubleClick(event.checkbox_event_core_tab_creation_SelectOrganizationsearchresult);
		base.wait(4);
		event.button_event_core_tab_creation_SelectCurrency.click();
		base.wait(1);
		event.text_event_creation_SelectCurrencysearch.sendKeys("sg");
		base.wait(1);
		//event.checkbox_event_creation_SelectCurrencysearchresult.click();
		base.doubleClick(event.checkbox_event_creation_SelectCurrencysearchresult);
		base.wait(1);
		//event.text_event_creation_SelectCurrencysearch.sendKeys("test");
		base.wait(1);
		event.text_event_core_tab_creation_Tags.sendKeys("test,tset,test");
		base.wait(1);
		event.text_event_core_tab_creation_Website.sendKeys("test");
		base.wait(1);
		event.text_event_creation_WYCDeadlineHours.sendKeys("-1");
		base.wait(1);
		event.button_event_core_tab_creation_SelectTimeZone.click();
		base.wait(1);
		event.text_event_core_tab_creation_SelectTimeZonesearch.sendKeys("utc");
		base.wait(1);
		//event.checkbox_event_core_tab_creation_SelectTimeZonesearchresult.click();
		base.doubleClick(event.checkbox_event_core_tab_creation_SelectTimeZonesearchresult);
		base.wait(1);
		event.button_event_core_tab_creation_SelectVenue.click();
		base.wait(1);
		event.text_event_core_tab_creation_SelectVenuesearch.sendKeys("tes");
		base.wait(1);
		event.text_event_core_tab_creation_SelectVenuesearch.sendKeys(Keys.ENTER);
		base.wait(1);
		event.text_event_core_tab_creation_GPSCoOrdinates.sendKeys("test");
		base.wait(1);
		event.text_event_core_tab_creation_AddressLine1.sendKeys("test");
		base.wait(1);
		event.text_event_core_tab_creation_AddressLine2.sendKeys("test");
		base.wait(1);
		event.text_event_core_tab_creation_AddressLine3.sendKeys("test");
		base.wait(1);
		event.text_event_core_tab_creation_City.sendKeys("test");
		base.wait(1);
		event.text_event_core_tab_creation_State.sendKeys("test");
		base.wait(1);
		event.button_event_core_tab_creation_Country.click();
		base.wait(1);
		event.text_event_core_tab_creation_Countrysearch.sendKeys("india");
		base.wait(1);
		event.text_event_core_tab_creation_Countrysearch.sendKeys(Keys.ENTER);
		base.wait(1);
		event.text_event_creation_Postcode.sendKeys("test");
		base.wait(1);
		event.button_event_creation_TournamentCategoryGroup.click();
		base.wait(1);
		event.text_event_creation_TournamentCategoryGroupsearch.sendKeys("wtt");
		base.wait(1);
		event.text_event_creation_TournamentCategoryGroupsearch.sendKeys(Keys.ENTER);
		base.wait(1);
		event.button_event_creation_TournamentCategory.click();
		base.wait(1);
		event.text_event_creation_TournamentCategory.sendKeys("wtt");
		base.wait(1);
		event.text_event_creation_TournamentCategory.sendKeys(Keys.ENTER);
		base.wait(1);
		base.scrollToView(event.button_event_creation_TournamentAgeCategory);
		base.wait(1);
		event.button_event_creation_TournamentAgeCategory.click();
		base.wait(1);
		event.button_event_creation_TournamentAgeCategorysearch.click();
		base.wait(1);
		event.button_event_creation_TournamentAgeCategorysearch.sendKeys("m");
		base.wait(1);
		//event.checkbox_event_creation_TournamentAgeCategorysearchresult.click();
		base.doubleClick(event.checkbox_event_creation_TournamentAgeCategorysearchresult);

		
		
	}
	

}
