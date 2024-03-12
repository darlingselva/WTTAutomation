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
		
		
		
		
		@FindBy(xpath = "//a[@href='#/list/events/tournaments']")
	    public WebElement tab_event;

}
