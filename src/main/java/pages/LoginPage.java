package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BasePage;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	//Page Elements:
	public static By username = By.className("username");
	public static By password = By.className("password");
	public static By loginBtn = By.xpath("//input[@type='submit']");
	public static By crmLogo = By.xpath("//img[contains(@class,'img-responsive')]");
	public static By signUpBtn = By.xpath("//button[contains(text(),'Sign Up')]");
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateCRMImage(){
		return driver.findElement(crmLogo).isDisplayed();
	}
	
	public HomePage login(String un, String pwd){
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		//loginBtn.click();
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", loginBtn);
		return new HomePage();
	}
}