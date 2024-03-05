package Snippet.AdminPortal;

import java.io.IOException;
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


public class EventCreationSnippet extends TestClass{
	
	
	public static void Adminportal_event_creation() throws Exception {
	     LoginSnippet.login();
		EventcreationElements event =  PageFactory.initElements(driver,EventcreationElements.class);
		Commonmethods base=new Commonmethods(driver,wait);
		
		
		base.wait(5);
	     event.tab_event.click();
		
		base.wait(5);
		WebElement b = (WebElement) EventcreationElements.class.getField("button_event_core_tab_creation").get(event);
		b.click();
		//driver.findElement((By) event.button_event_core_tab_creation).click();
		//event.button_event_core_tab_creation.click();
		base.wait(1);
		
	EventcreationElements.text_event_core_tab_creation_EventName.click();
	
		event.text_event_core_tab_creation_EventName.sendKeys("test");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
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
	    base.jclick(event.checkbox_event_core_tab_creation_SelectOrganizationsearchresult);
		base.wait(4);
		event.button_event_core_tab_creation_SelectCurrency.click();
		base.wait(1);
		event.text_event_creation_SelectCurrencysearch.sendKeys("sg");
		base.wait(1);
		//event.checkbox_event_creation_SelectCurrencysearchresult.click();
		base.jclick(event.checkbox_event_creation_SelectCurrencysearchresult);
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
		base.jclick(event.checkbox_event_core_tab_creation_SelectTimeZonesearchresult);
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
		base.jclick(event.checkbox_event_creation_TournamentAgeCategorysearchresult);
		base.wait(4);
		
		//Event creation - 2: Competition
		
		
		event.tab_event_creation_Competition.click();
		base.wait(2);
		
		
		event.button_event_creation_Competition_PrefillfromTournamentCompetitionRoundTemplates.click();
		base.wait(2);
		event.text_event_creation_Competition_PrefillfromTournamentCompetitionRoundTemplatessearch.sendKeys("total");
		base.wait(2);
		event.text_event_creation_Competition_PrefillfromTournamentCompetitionRoundTemplatessearch.sendKeys(Keys.ENTER);
		base.wait(2);
		event.text_event_creation_Competition_NofQualificationRounds.sendKeys("2");
		base.wait(2);
		event.text_event_creation_Competition_NoofTotalMatches.sendKeys("10");
		base.wait(2);
		event.button_event_creation_Competition_EntriesRankingYear.click();
		base.wait(2);
		event.text_event_creation_Competition_EntriesRankingYearsearch.sendKeys("2024");
		base.wait(2);
		event.text_event_creation_Competition_EntriesRankingYearsearch.sendKeys(Keys.ENTER);
		base.wait(2);
		event.button_event_creation_Competition_EntriesRankingWeek.click();
		base.wait(2);
		event.text_event_creation_Competition_EntriesRankingWeeksearch.sendKeys("jan");
		base.wait(2);
		event.text_event_creation_Competition_EntriesRankingWeeksearch.sendKeys(Keys.ENTER);
		base.wait(2);
		event.button_event_creation_Competition_CountRankingYear.click();
		base.wait(2);
		event.text_event_creation_Competition_CountRankingYear.sendKeys("2024");
		base.wait(2);
		event.text_event_creation_Competition_CountRankingYear.sendKeys(Keys.ENTER);
		base.wait(2);
		event.button_event_creation_Competition_CountRankingWeek.click();
		base.wait(2);
		event.text_event_creation_Competition_CountRankingWeeksearch.sendKeys("jan");
		base.wait(2);
		event.text_event_creation_Competition_CountRankingWeeksearch.sendKeys(Keys.ENTER);
		base.wait(2);
		event.button_event_creation_Competition_SeedingRankingYear.click();
		base.wait(2);
		event.text_event_creation_Competition_SeedingRankingYearsearch.sendKeys("2024");
		base.wait(2);
		event.text_event_creation_Competition_SeedingRankingYearsearch.sendKeys(Keys.ENTER);
		base.wait(2);
		event.button_event_creation_Competition_SeedingRankingWeek.click();
		base.wait(2);
		event.text_event_creation_Competition_SeedingRankingWeeksearch.sendKeys("jan");
		base.wait(2);
		event.text_event_creation_Competition_SeedingRankingWeeksearch.sendKeys(Keys.ENTER);
		base.wait(2);
		event.button_event_creation_Competition_RankingExpiryYear.click();
		base.wait(2);
		event.text_event_creation_Competition_RankingExpiryYearsearch.sendKeys("2024");
		base.wait(2);
		event.text_event_creation_Competition_RankingExpiryYearsearch.sendKeys(Keys.ENTER);
		base.wait(2);
		event.button_event_creation_Competition_RankingExpiryWeek.click();
		base.wait(2);
		event.text_event_creation_Competition_RankingExpiryWeeksearch.sendKeys("jan");
		base.wait(2);
		event.text_event_creation_Competition_RankingExpiryWeeksearch.sendKeys(Keys.ENTER);
		base.wait(2);
		event.button_event_creation_Competition_SystemofPlay.click();
		base.wait(2);
		//event.text_event_creation_Competition_SystemofPlaysearch
		base.jclick(event.check_event_creation_Competition_SystemofPlayGroupBased);
		base.wait(2);
		base.jclick(event.check_event_creation_Competition_SystemofPlayKnockout);
		base.wait(2);
		//event.check_event_creation_Competition_SystemofPlayKnockout
		event.text_event_creation_Competition_PlayingSystem.sendKeys("test");
		base.wait(2);
		event.text_event_creation_Competition_OverallPrizeMoney.sendKeys("test");
		base.wait(2);
		event.text_event_creation_Competition_PrizeMoneyTax.sendKeys("test");
		base.wait(2);
		event.text_event_creation_Competition_PrizeComments.sendKeys("test");

         
		
		
		//Event creation - 3: Participant Organizations
		event.tab_event_creation_ParticipantOrganizations.click();
		base.wait(2);
		
		event.button_event_creation_ParticipantOrganizations_AddNew.click();
		base.wait(2);
        event.button_event_creation_ParticipantOrganizations_Organization.click();
        base.wait(2);
        event.text_event_creation_ParticipantOrganizations_Organizationsearch.sendKeys("india");
        base.wait(2);
        event.text_event_creation_ParticipantOrganizations_Organizationsearch.sendKeys(Keys.ENTER);
        //event.checkbox_event_creation_ParticipantOrganizations_Organizationsearchresult.click();
        //base.doubleClick(event.checkbox_event_creation_ParticipantOrganizations_Organizationsearchresult);
        base.wait(2);
        event.button_event_creation_ParticipantOrganizations_Organizationclose.click();
        base.wait(2);
        //event.checkbox_event_creation_selectallcontitent.click();
        //base.doubleClick(event.checkbox_event_creation_selectallcontitent);
        //base.wait(12);
       //base.doubleClick(event.checkbox_event_creation_deselectallcontitent);
        //event.checkbox_event_creation_selectallcontitent.click();
        //base.wait(12);
        //event.button_event_creation_Proceed.click();
        base.jclick(event.button_event_creation_Proceed);
        base.wait(8);
       
		
        //Event creation - 4: Profile Quotas
		
		
		event.tab_event_creation_ProfileQuotas.click();
		base.wait(2);
		
		event.button_event_creation_ProfileQuotas_AddNew.click();
		base.wait(2);
		event.button_event_creation_ProfileQuotas_Profile.click();
		base.wait(2);
		event.text_event_creation_ProfileQuotas_Profilesearch.sendKeys("father");
		base.wait(2);
		event.checkbox_event_creation_ProfileQuotas_ProfilesearchFather.click();
		base.wait(6);
		//event.button_event_creation_ProfileQuotas_Profilearrowicon.click();
		base.jclick(event.button_event_creation_ProfileQuotas_Profilearrowicon);
		base.wait(2);
		event.text_event_creation_ProfileQuotas_ProfilesearchAccreditationCode.sendKeys("1");
		base.wait(2);
		event.text_event_creation_ProfileQuotas_ProfilesearchHostCount.sendKeys("1");
		base.wait(2);
		event.text_event_creation_ProfileQuotas_ProfilesearchGeneralCount.sendKeys("1");
		base.wait(2);
		event.button_event_creation_ProfileQuotas_ProfileProceed.click();
		base.wait(2);
		event.button_event_creation_ProfileQuotas_DeleteAll.click();
		
		
		
		
		
		//Event creation - 5: Key Persons
		
		event.tab_event_creation_KeyPersons.click();
		base.wait(2);
		
		event.button_event_creation_KeyPersonsAddNew.click();
		base.wait(2);
		event.button_event_creation_KeyPersonsProfile.click();
		base.wait(2);
		base.jclick(event.checkbox_event_creation_KeyPersonsProfileTournamentSupervisor);
		base.wait(2);
		//base.jclick(event.button_event_creation_KeyPersonsIndividualNamedownarrowicon);
		//event.button_event_creation_KeyPersonsIndividualNamedownarrowicon.click();
		event.button_event_creation_KeyPersonsIndividualName.click();
		base.wait(2);
		event.text_event_creation_KeyPersonsIndividualNamesearch.sendKeys("ken");
		base.wait(10);
		//event.text_event_creation_KeyPersonsIndividualNamesearch.sendKeys(Keys.ENTER);
		event.text_event_creation_KeyPersonsIndividualNamesearchresult.click();
		base.wait(2);
		base.jclick(event.button_event_creation_KeyPersonsIndividualNameuparrowicon);
		base.wait(2);
		//event.toggle_event_creation_KeyPersonsactive.click();
		//base.jclick(event.toggle_event_creation_KeyPersonsactive);
		//base.wait(2);
		event.button_event_creation_KeyPersonsProceed.click();
		base.wait(2);
		
		
	    
		//Event creation - 6: Dates
		
		event.tab_event_creation_Dates.click();
		base.wait(2);
	
		event.tab_event_creation_Draws.click();
		base.wait(2);
		event.tab_event_creation_MatchConfiguration.click();
		base.wait(2);
		event.tab_event_creation_Logos.click();
		base.wait(2);
		event.tab_event_creation_Equipment.click();
		base.wait(2);
		event.tab_event_creation_OnlineEntrySystem.click();
		base.wait(2);
		event.tab_event_creation_PaymentOptions.click();
		base.wait(2);
		event.tab_event_creation_TournamentFee.click();
		base.wait(2);
		event.tab_event_creation_NonMATournamentFee.click();
		base.wait(2);
		event.tab_event_creation_Hospitality.click();
		base.wait(2);
		event.tab_event_creation_NonMAHospitality.click();
		base.wait(2);
		event.tab_event_creation_Miscellaneous.click();
		base.wait(2);
		event.tab_event_creation_Travel.click();
		base.wait(2);
		event.tab_event_creation_Transportation.click();
		base.wait(2);
		event.tab_event_creation_Sponsors.click();
		base.wait(2);
		event.tab_event_creation_Documents.click();
		base.wait(2);
		event.tab_event_creation_Accreditation.click();
		base.wait(2);
		event.tab_event_creation_Visa.click();
		base.wait(2);
		event.tab_event_creation_Comments.click();
		base.wait(2);
		
	   
		
		event.tab_event_creation_Review.click();
		base.wait(2);
		System.out.println("------------------------------------------------------");
		System.out.println(event.text1_event_creation_Review_Core_EventName.getText());
		System.out.println("------------------------------------------------------");
		
		Assert.assertEquals("test", event.text1_event_creation_Review_Core_EventName.getText());
		
	
	}
   
}
