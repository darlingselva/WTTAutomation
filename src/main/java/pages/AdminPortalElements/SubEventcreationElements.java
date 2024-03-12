package pages.AdminPortalElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubEventcreationElements {
	
	 WebDriver driver;
	 
		

		public SubEventcreationElements(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
		
		
		
		//search event 
		
		@FindBy(xpath = "//input[@placeholder='Search by Tournament Name,Type,Organization,Country,Status']")
	    public WebElement text_event_globalsearch;
		
		@FindBy(xpath = "//table//tbody//tr[1]//td[1]//span")
	    public WebElement button_event_searchresult;
		
		
		@FindBy(xpath = "//div[text()='Sub Events']")
	    public WebElement tab_subevents;
		
		@FindBy(xpath = "//button[@class='prime_button mob-mt-10 ng-star-inserted']")
		public WebElement button_create_subevents;
		
		// 1.Basics
		
		@FindBy (xpath = "//div[text()='1: Basics']")
		public WebElement tab_subevents_basics;
		
		@FindBy (xpath = "//span[text()='Select Sub Event Type']")
		public WebElement tab_sub_event_type;
		
		@FindBy (xpath = "//textarea[@placeholder='Description']")
		public WebElement tab_subevent_description;
		
		@FindBy (xpath = "//span[text()='Select Event Restriction']")
		public WebElement tab_subevent_eventrestiction;
		
		@FindBy (xpath = "//div[contains(text(),'Is Optional')]//parent::div//following-sibling::div//label")
		public WebElement toggle_subevent_IsOptional;
		
		@FindBy (xpath = "//input[@name='Sub Event Name']")
		public WebElement tab_subevent_name;
		
		@FindBy (xpath = "//span[text()='Select Entry Type']")
		public WebElement tab_Entry_Type;
		
		@FindBy (xpath = "//input[@name='NumberOfTotalMatches']")
		public WebElement tab_subevent_totalmatches_no;
		
		@FindBy (xpath = "//span[text()='Select Paralympic Classes']")
		public WebElement tab_subevent_paralympic_classes;
		
		//Entries/Seeding Ranking
		
		@FindBy (xpath = "//span[text()='Enter Entries Ranking Year']")
		public WebElement tab_subevent_entriesranking_year;
		
		@FindBy (xpath = "//input[@placeholder='Enter Entries Ranking Month']")
		public WebElement tab_subevent_entriesranking_month;
		
		@FindBy (xpath = "//span[text()='Select Seeding Ranking Week']")
		public WebElement tab_subevent_seedingranking_week;
		
		@FindBy (xpath = "//span[text()='Select Entries Ranking Week']")
		public WebElement tab_subevent_entriesranking_week;
		
		@FindBy (xpath = "//span[text()='Enter Seeding Ranking Year']")
		public WebElement tab_subevent_seddingranking_year;
		
		@FindBy (xpath = "//input[@placeholder='Enter Seeding Ranking Month']")
		public WebElement tab_subevent_seedingranking_month;
		
		//Entries Deadline
		
		@FindBy (xpath = "//input[@placeholder='Select Date']")
		public WebElement tab_subevent_entries_deadline;
		
		//Age Category Information
		
		@FindBy (xpath = "//span[text()='Select Tournament Age Category']")
		public WebElement tab_subevent_tournament_agecategory;
		
		//Conducting Draws Information
		
		@FindBy (xpath = "//span[text()='Select Event Draws']")
		public WebElement tab_subevent_draws;
		
		//Playing Draws Information
		
		@FindBy (xpath = "//span[text()='Select Sub Event Playing Draw']")
		public WebElement tab_subevent_playing_draw;
		
		/*
		 * @FindBy (xpath = "//span[text()='Next']") public WebElement
		 * tab_subevent_next;
		 */
		
		//2.Phases
		
		@FindBy (xpath = "//div[text()='2: Phases']")
		public WebElement tab_subevents_Phases;
		
		@FindBy (xpath = "//button[text()='Add New']")
		public WebElement button_subevent_addnew_phases;
		
		@FindBy (xpath = "//span[text()='Select Phase']")
		public WebElement tab_subevent_selectphase;
		
		@FindBy (xpath = "//input[@id='mat-input-110']")
		public WebElement tab_subevent_start_DateTime;
		
		@FindBy (xpath = "//span[text()='Select Event Draw']")
		public WebElement tab_subevent_select_eventdraw;
		
		@FindBy (xpath = "//input[@id='mat-input-111']")
		public WebElement tab_subevent_end_DateTime;
		
		@FindBy (xpath = "//span[text()='Proceed']")
		public WebElement button_subevent_proceed;
		
		@FindBy (xpath = "//span[text()='Cancel']")
		public WebElement button_subevent_cancel;
		
		/*
		 * @FindBy (xpath = "//span[text()='Next']") public WebElement
		 * button_subevent_next;
		 */
		
		//3.Prize
		
		@FindBy (xpath = "//div[text()='3: Prize']")
		public WebElement tab_subevents_Prize;
		
		@FindBy (xpath = "//input[@placeholder='Search...'])")
		public WebElement tab_subevents_prize_search;
		
		@FindBy (xpath = "//button[text()='Add New']")
		public WebElement button_subevent_addnew_prize;
		
		@FindBy (xpath = "//span[text()='Select Event Draw']")
		public WebElement tab_subevents_select_eventdraw;
		
		@FindBy (xpath = "//span[text()='Select Phase']")
		public WebElement tab_subevent_select_phase;
		
		@FindBy (xpath = "//span[text()='Select Prize Position']")
		public WebElement tab_subevent_prize_position;
		
		@FindBy (xpath = "//input[@name='field.display']")
		public WebElement tab_subevent_prizemoney;
		
		@FindBy (xpath = "//span[text()='Cancel']")
		public WebElement button_subevent_prize_cancel;
		
		@FindBy (xpath = "//span[text()='Select Currency']")
		public WebElement tab_subevent_select_currency;
		
		@FindBy (xpath = "//span[text()='Proceed']")
		public WebElement button_subevent_prize_proceed;
		
		//4: Review
		
		@FindBy (xpath = "//div[text()='4: Review']")
		public WebElement tab_subevents_Review;
		
		@FindBy (xpath = "//span[text()='Create']")
		public WebElement button_subevent_Create;
		
		@FindBy (xpath = "//button[text()='Cancel']")
		public WebElement tab_subevent_Cancel;
		

}
