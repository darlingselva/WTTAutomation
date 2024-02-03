package base;

import org.openqa.selenium.By;

public class CommonLocators {
	
	public String userName="By.className('username')";
	public static By password = By.className("password");
	public static By loginBtn = By.xpath("//input[@type='submit']");
	public static By crmLogo = By.xpath("//img[contains(@class,'img-responsive')]");
	public static By signUpBtn = By.xpath("//button[contains(text(),'Sign Up')]");
}