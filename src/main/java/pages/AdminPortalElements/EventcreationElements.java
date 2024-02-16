package pages.AdminPortalElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EventcreationElements {
	
	 WebDriver driver;

		public EventcreationElements(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
		
		@FindBy(xpath = "//a[@href='#/list/events/tournaments']")
	    public WebElement tab_event;


		@FindBy(xpath = "//button[@class='prime_button mob-mt-10 ng-star-inserted']")
	    public WebElement button_event_core_tab_creation;
		
		@FindBy(xpath = "//input[@placeholder='Name']")
	    public WebElement text_event_core_tab_creation_EventName;
		
		@FindBy(xpath = "//span[text()='All Event Core Types']/../../parent::mat-select")
	    public WebElement button_event_core_tab_creation_EventCoreType;
		
		
		@FindBy(xpath = "//input[@placeholder='Search Event Core Type']")
	    public WebElement text_event_core_tab_creation_searchEventCoreType;
		
		@FindBy(xpath = "//div[contains(text(),'Is Closed Event')]//parent::div//following-sibling::div//label")
	    public WebElement toggle_event_core_tab_creation_IsClosedEvent;
		
		@FindBy(xpath = "//div[contains(text(),'Is AI Enabled')]//parent::div//following-sibling::div//label")
	    public WebElement toggle_event_core_tab_creation_IsAIEnabled;
		
		@FindBy(xpath = "//div[contains(text(),'Is Betting Enabled')]//parent::div//following-sibling::div//label")
	    public WebElement toggle_event_core_tab_creation_IsBettingEnabled;
		
		@FindBy(xpath = "//div[contains(text(),'Is Front End Platform Visible')]//parent::div//following-sibling::div//label")
	    public WebElement toggle_event_core_tab_creation_IsFrontEndPlatformVisible;

		@FindBy(xpath = "//div[contains(text(),'Active')]//parent::div//following-sibling::div//label")
	    public WebElement toggle_event_core_tab_creation_Active;
		
		@FindBy(xpath = "//div[contains(text(),'Show Organizer in OES')]//parent::div//following-sibling::div//label")
	    public WebElement toggle_event_core_tab_creation_ShowOrganizerinOES;
		
		@FindBy(xpath = "//span[text()='Select Organization']")
	    public WebElement button_event_core_tab_creation_SelectOrganization;
		
		@FindBy(xpath = "//span[text()='Select Organization']/../../parent::div[@class='cuppa-dropdown']//input")
	    public WebElement text_event_core_tab_creation_SelectOrganizationsearch;
		
		@FindBy(xpath ="(//span[text()='Select Organization']/../../parent::div[@class='cuppa-dropdown']//input[@type='checkbox'])[2]")
	    public WebElement checkbox_event_core_tab_creation_SelectOrganizationsearchresult;

		
		@FindBy(xpath = "//span[text()='Select Currency']")
	    public WebElement button_event_core_tab_creation_SelectCurrency;
		
		@FindBy(xpath = "//span[text()='Select Currency']/../../parent::div[@class='cuppa-dropdown']//input")
	    public WebElement text_event_creation_SelectCurrencysearch;
		
		@FindBy(xpath = "(//span[text()='Select Currency']/../../parent::div[@class='cuppa-dropdown']//input)[2]")
	    public WebElement checkbox_event_creation_SelectCurrencysearchresult;
		
		@FindBy(xpath = "//div[contains(text(),'Tags')]/../parent::div//input")
	    public WebElement text_event_core_tab_creation_Tags;
        
		@FindBy(xpath = "//div[contains(text(),'Website')]/../parent::div//input")
	    public WebElement text_event_core_tab_creation_Website;
		
		@FindBy(xpath = "//div[contains(text(),'WYC Deadline Hours')]/../parent::div//input")
	    public WebElement text_event_creation_WYCDeadlineHours;
		
		@FindBy(xpath = "//span[text()='Select Time Zone']")
	    public WebElement button_event_core_tab_creation_SelectTimeZone;
		
		@FindBy(xpath = "//span[text()='Select Time Zone']/../../parent::div[@class='cuppa-dropdown']//input")
	    public WebElement text_event_core_tab_creation_SelectTimeZonesearch;
		
		@FindBy(xpath = "(//span[text()='Select Time Zone']/../../parent::div[@class='cuppa-dropdown']//input[@type='checkbox'])[2]")
	    public WebElement checkbox_event_core_tab_creation_SelectTimeZonesearchresult;
		
		@FindBy(xpath = "//div[contains(text(),'Tournament Logo')]/../parent::div//label")
	    public WebElement button_event_core_tab_creation_TournamentLogo;
		
		@FindBy(xpath = "//span[text()='Select Venue']/../../parent::mat-select")
	    public WebElement button_event_core_tab_creation_SelectVenue;
		
		@FindBy(xpath = "//input[@placeholder='Search Venue']")
	    public WebElement text_event_core_tab_creation_SelectVenuesearch;
		
		@FindBy(xpath = "//div[contains(text(),'GPS Co-Ordinates')]/../parent::div//input")
	    public WebElement text_event_core_tab_creation_GPSCoOrdinates;
		
		@FindBy(xpath = "//div[contains(text(),'Address Line1')]/../parent::div//input")
	    public WebElement text_event_core_tab_creation_AddressLine1;
		
		@FindBy(xpath = "//div[contains(text(),'Address Line2')]/../parent::div//input")
	    public WebElement text_event_core_tab_creation_AddressLine2;
		
		@FindBy(xpath = "//div[contains(text(),'Address Line3')]/../parent::div//input")
	    public WebElement text_event_core_tab_creation_AddressLine3;
		
		@FindBy(xpath = "//div[contains(text(),'City')]/../parent::div//input")
	    public WebElement text_event_core_tab_creation_City;
		
		@FindBy(xpath = "//div[contains(text(),'State')]/../parent::div//input")
	    public WebElement text_event_core_tab_creation_State;
		
		@FindBy(xpath = "//div[contains(text(),'Country')]/../parent::div//mat-select")
	    public WebElement button_event_core_tab_creation_Country;
		
		
		@FindBy(xpath = "//input[@placeholder='Search Country']")
	    public WebElement text_event_core_tab_creation_Countrysearch;
		

		@FindBy(xpath = "//div[contains(text(),'Postcode')]/../parent::div//input")
	    public WebElement text_event_creation_Postcode;

		@FindBy(xpath = "//div[contains(text(),'Tournament Category Group')]/../parent::div//mat-select")
	    public WebElement button_event_creation_TournamentCategoryGroup;
		
		@FindBy(xpath = "//input[@placeholder='Search Tournament Category Group']")
	    public WebElement text_event_creation_TournamentCategoryGroupsearch;
		
		@FindBy(xpath = "(//div[contains(text(),'Tournament Category')]/../parent::div//mat-select)[2]")
	    public WebElement button_event_creation_TournamentCategory;
		
		@FindBy(xpath = "//input[@placeholder='Search Tournament Category']")
	    public WebElement text_event_creation_TournamentCategory;
		
		@FindBy(xpath = "//div[contains(text(),'Tournament Category Group') and contains(text(),'Select Tournament Category')]//parent::div/../parent::div//mat-select")
	    public WebElement button_event_creation_TournamentCategoryGroup1;
		
		
		@FindBy(xpath = "//input[@placeholder='Search Tournament Category']")
	    public WebElement text_event_creation_TournamentCategoryGroupsearch1;
		
		
		@FindBy(xpath = "(//div[contains(text(),'Tournament Age Category')]/../parent::div//span)[1]")
	    public WebElement button_event_creation_TournamentAgeCategory;
		
		@FindBy(xpath = "(//span[text()='Select Tournament Age Category']/../../parent::div[@class='cuppa-dropdown']//input)[2]")
	    public WebElement button_event_creation_TournamentAgeCategorysearch;
		
		@FindBy(xpath = "(//span[text()='Select Tournament Age Category']/../../parent::div[@class='cuppa-dropdown']//input[@type='checkbox'])[3]")
	    public WebElement checkbox_event_creation_TournamentAgeCategorysearchresult;
		
		//Event creation - 2: Competition
		
		@FindBy(xpath = "//div[text()='2: Competition']")
	    public WebElement tab_event_creation_Competition;
		
		@FindBy(xpath = "//div[contains(text(),'Prefill from Tournament Competition Round Templates')]/../parent::div//mat-select")
	    public WebElement button_event_creation_Competition_PrefillfromTournamentCompetitionRoundTemplates;
		
		@FindBy(xpath = "//input[@placeholder='Search Tournament Competition Round']")
	    public WebElement text_event_creation_Competition_PrefillfromTournamentCompetitionRoundTemplatessearch;
		
		@FindBy(xpath = "//div[contains(text(),'No. of Qualification Rounds')]/../parent::div//input")
	    public WebElement text_event_creation_Competition_NofQualificationRounds;
		
		@FindBy(xpath = "//div[contains(text(),'No. of Total Matches')]/../parent::div//input")
	    public WebElement text_event_creation_Competition_NoofTotalMatches;
		
		@FindBy(xpath = "//div[contains(text(),'Entries Ranking Year')]/../parent::div//mat-select")
	    public WebElement button_event_creation_Competition_EntriesRankingYear;
		
		@FindBy(xpath = "//input[@placeholder='Search Entries Ranking Year']")
	    public WebElement text_event_creation_Competition_EntriesRankingYearsearch;
		
		@FindBy(xpath = "//div[contains(text(),'Entries Ranking Week')]/../parent::div//mat-select")
	    public WebElement button_event_creation_Competition_EntriesRankingWeek;
		
		@FindBy(xpath = "//input[@placeholder='Search Entries Ranking Week']")
	    public WebElement text_event_creation_Competition_EntriesRankingWeeksearch;    
	    
		@FindBy(xpath = "//div[contains(text(),'Count Ranking Year')]/../parent::div//mat-select")
	    public WebElement button_event_creation_Competition_CountRankingYear;
		
		@FindBy(xpath = "//input[@placeholder='Search Count Ranking Year']")
	    public WebElement text_event_creation_Competition_CountRankingYear;
		
		@FindBy(xpath = "//div[contains(text(),'Count Ranking Week')]/../parent::div//mat-select")
	    public WebElement button_event_creation_Competition_CountRankingWeek;
		
		@FindBy(xpath = "//input[@placeholder='Search Count Ranking Week']")
	    public WebElement text_event_creation_Competition_CountRankingWeeksearch;
		
		@FindBy(xpath = "//div[contains(text(),'Seeding Ranking Year')]/../parent::div//mat-select")
	    public WebElement button_event_creation_Competition_SeedingRankingYear;
		
		@FindBy(xpath = "//input[@placeholder='Search Seeding Ranking Year']")
	    public WebElement text_event_creation_Competition_SeedingRankingYearsearch;
		
		@FindBy(xpath = "//div[contains(text(),'Seeding Ranking Week')]/../parent::div//mat-select")
	    public WebElement button_event_creation_Competition_SeedingRankingWeek;
		
		@FindBy(xpath = "//input[@placeholder='Search Seeding Ranking Week']")
	    public WebElement text_event_creation_Competition_SeedingRankingWeeksearch;
		
		@FindBy(xpath = "//div[contains(text(),'Ranking Expiry Year')]/../parent::div//mat-select")
	    public WebElement button_event_creation_Competition_RankingExpiryYear;
		
		@FindBy(xpath = "//input[@placeholder='Search Ranking Expiry Year']")
	    public WebElement text_event_creation_Competition_RankingExpiryYearsearch;
		
		@FindBy(xpath = "//div[contains(text(),'Ranking Expiry Week')]/../parent::div//mat-select")
	    public WebElement button_event_creation_Competition_RankingExpiryWeek;
	    
		@FindBy(xpath = "//input[@placeholder='Search Ranking Expiry Week']")
	    public WebElement text_event_creation_Competition_RankingExpiryWeeksearch;
		
		@FindBy(xpath = "//div[contains(text(),'System of Play')]/../parent::div//span")
	    public WebElement button_event_creation_Competition_SystemofPlay;
	    
		@FindBy(xpath = "//div[contains(text(),'System of Play')]/../../parent::div//input[@type='text']")
	    public WebElement text_event_creation_Competition_SystemofPlaysearch;
		
		@FindBy(xpath = "//div[contains(text(),'System of Play')]/../../parent::div//input[@type='checkbox']//following-sibling::label[text()='Group Based']")
	    public WebElement check_event_creation_Competition_SystemofPlayGroupBased;
	    
		@FindBy(xpath = "//div[contains(text(),'System of Play')]/../../parent::div//input[@type='checkbox']//following-sibling::label[text()='Knockout']")
	    public WebElement check_event_creation_Competition_SystemofPlayKnockout;
		
		@FindBy(xpath = "(//div[contains(text(),'Playing System')])[2]/../parent::div//div[@data-placeholder='Enter Content...']")
	    public WebElement text_event_creation_Competition_PlayingSystem;
		
		@FindBy(xpath = "//div[contains(text(),'Overall Prize Money')]/../parent::div//input")
	    public WebElement text_event_creation_Competition_OverallPrizeMoney;
		
		@FindBy(xpath = "//div[contains(text(),'Prize Money Tax')]/../parent::div//textarea")
	    public WebElement text_event_creation_Competition_PrizeMoneyTax;
		
		@FindBy(xpath = "//div[contains(text(),'Prize Comments')]/../parent::div//div[@data-placeholder='Enter Content...']")
	    public WebElement text_event_creation_Competition_PrizeComments;
		
	    
	    
	    
	    
	    
	    //Event creation - 3: Participant Organizations
		
		@FindBy(xpath = "//div[text()='3: Participant Organizations']")
	    public WebElement tab_event_creation_ParticipantOrganizations;
		
		@FindBy(xpath = "//button[text()='Add New']")
	    public WebElement button_event_creation_ParticipantOrganizations_AddNew;
		
		@FindBy(xpath = "//input[@name='searchText']")
	    public WebElement text_event_creation_ParticipantOrganizations_searchText;
		
		@FindBy(xpath = "//div[contains(text(),'Organization')]/../parent::div//mat-select")
	    public WebElement button_event_creation_ParticipantOrganizations_Organization;
		
		@FindBy(xpath = "//input[@placeholder='Search Organization']")
	    public WebElement text_event_creation_ParticipantOrganizations_Organizationsearch;
		
		@FindBy(className = "mat-option-pseudo-checkbox mat-pseudo-checkbox ng-star-inserted")
	    public WebElement checkbox_event_creation_ParticipantOrganizations_Organizationsearchresult;
		
		@FindBy(xpath = "//mat-icon[text()='close']")
	    public WebElement button_event_creation_ParticipantOrganizations_Organizationclose;
		
		
		//Event creation - 4: Profile Quotas
		
		@FindBy(xpath = "//div[text()='4: Profile Quotas']")
	    public WebElement tab_event_creation_ProfileQuotas;
		
		@FindBy(xpath = "//div[text()='5: Key Persons']")
	    public WebElement tab_event_creation_KeyPersons;
		
		@FindBy(xpath = "//div[text()='6: Dates']")
	    public WebElement tab_event_creation_Dates;
		
		@FindBy(xpath = "//div[text()='7: Draws']")
	    public WebElement tab_event_creation_Draws;
		
		@FindBy(xpath = "//div[text()='8: Match Configuration']")
	    public WebElement tab_event_creation_MatchConfiguration;

		@FindBy(xpath = "//div[text()='9: Logos']")
	    public WebElement tab_event_creation_Logos;

		@FindBy(xpath = "//div[text()='10: Equipment']")
	    public WebElement tab_event_creation_Equipment;
		
		@FindBy(xpath = "//div[text()='11: Online Entry System']")
	    public WebElement tab_event_creation_OnlineEntrySystem;
		
		@FindBy(xpath = "//div[text()='12: Payment Options']")
	    public WebElement tab_event_creation_PaymentOptions;
		
		@FindBy(xpath = "//div[text()='13: Tournament Fee']")
	    public WebElement tab_event_creation_TournamentFee;
		
		@FindBy(xpath = "//div[text()='14: Non-MA Tournament Fee']")
	    public WebElement tab_event_creation_NonMATournamentFee;
		
		@FindBy(xpath = "//div[text()='15: Hospitality']")
	    public WebElement tab_event_creation_Hospitality;
		
		@FindBy(xpath = "//div[text()='16: Non-MA Hospitality']")
	    public WebElement tab_event_creation_NonMAHospitality;
		
		@FindBy(xpath = "//div[text()='17: Miscellaneous']")
	    public WebElement tab_event_creation_Miscellaneous;
		
		@FindBy(xpath = "//div[text()='18: Travel']")
	    public WebElement tab_event_creation_Travel;
		
		@FindBy(xpath = "//div[text()='19: Transportation']")
	    public WebElement tab_event_creation_Transportation;
		
		@FindBy(xpath = "//div[text()='20: Sponsors']")
	    public WebElement tab_event_creation_Sponsors;
		
		@FindBy(xpath = "//div[text()='21: Documents']")
	    public WebElement tab_event_creation_Documents;

		@FindBy(xpath = "//div[text()='22: Accreditation']")
	    public WebElement tab_event_creation_Accreditation;
		
		@FindBy(xpath = "//div[text()='23: Visa']")
	    public WebElement tab_event_creation_Visa;
		
		@FindBy(xpath = "//div[text()='24: Comments']")
	    public WebElement tab_event_creation_Comments;
		
		@FindBy(xpath = "//div[text()='25: Review']")
	    public WebElement tab_event_creation_Review;

}
