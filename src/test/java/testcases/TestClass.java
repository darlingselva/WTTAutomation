package testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import base.TestBase;

public class TestClass extends TestBase{
	
	@BeforeSuite
	public void setUp(){
		initialization();	
	}
	
	@AfterSuite
	public void destroyDriver(){
		driver.quit();
	}
}