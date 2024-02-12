package testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import base.DriverInitialisation;

public class TestClass extends DriverInitialisation{
	
	@BeforeSuite
	public void setUp(){
		initialization();	
	}
	
	@AfterSuite
	public void destroyDriver(){
		driver.quit();
	}
}