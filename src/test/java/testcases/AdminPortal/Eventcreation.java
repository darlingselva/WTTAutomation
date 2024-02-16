package testcases.AdminPortal;

import org.openqa.selenium.By;
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
		base.startRecording();
		
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
		base.doubleClick(event.check_event_creation_Competition_SystemofPlayGroupBased);
		base.wait(2);
		base.doubleClick(event.check_event_creation_Competition_SystemofPlayKnockout);
		base.wait(2);
		//event.check_event_creation_Competition_SystemofPlayKnockout
		event.text_event_creation_Competition_PlayingSystem.sendKeys("test");
		base.wait(2);
		event.text_event_creation_Competition_OverallPrizeMoney.sendKeys("test");
		base.wait(2);
		event.text_event_creation_Competition_PrizeMoneyTax.sendKeys("test");
		base.wait(2);
		event.text_event_creation_Competition_PrizeComments.sendKeys("test");

   
		
		
		event.tab_event_creation_ParticipantOrganizations.click();
		base.wait(2);
		event.tab_event_creation_ProfileQuotas.click();
		base.wait(2);
		event.tab_event_creation_KeyPersons.click();
		base.wait(2);
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

		
	    base.stopRecording();
		
	}
	

}
