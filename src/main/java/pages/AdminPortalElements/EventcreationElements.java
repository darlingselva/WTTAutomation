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
		

}
