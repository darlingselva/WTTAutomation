package pages.AdminPortalElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Admin_login_page_Elements {

	 WebDriver driver;

	public Admin_login_page_Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

	@FindBy(xpath = "//input[@name='username']")
    public WebElement ittf_username;
	
	@FindBy(xpath = "//input[@name='password']")
    public WebElement ittf_password;
	
	@FindBy(xpath = "//span[text()='Sign In']")
    public WebElement ittf_Sign_button;
		
}
