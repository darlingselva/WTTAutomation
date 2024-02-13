package testcases;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import base.CommonPaths;
import base.DriverInitialisation;

public class TestClass extends DriverInitialisation{
	
	@BeforeSuite
	public void setUp(){
		initialization();	
	}
	
	
	@AfterMethod
	public void screenShot(ITestResult result){
	//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
		if(ITestResult.FAILURE==result.getStatus()){
			try{
				// To create reference of TakesScreenshot
				TakesScreenshot screenshot=(TakesScreenshot)driver;
				// Call method to capture screenshot
				File src=screenshot.getScreenshotAs(OutputType.FILE);
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss"); 
				   LocalDateTime now = LocalDateTime.now();  
				      File f1 = new File(CommonPaths.Screenshot_failure_path+dtf.format(now).toString()); 
				      if (!f1.exists()){
				    	  f1.mkdirs();
				    	} 
				File DestFile=new File(CommonPaths.Screenshot_failure_path+dtf.format(now).toString()+"/"+result.getName()+".png");
				FileUtils.copyFile(src, DestFile);
				
				//FileUtils.copyFile(src, new File("D:\\"+result.getName()+".png"));
				System.out.println("Failure method name="+result.getName());
				System.out.println("Successfully captured a screenshot");
			}catch (Exception e){
				System.out.println("Exception while taking screenshot "+e.getMessage());
			} 
	}
	}
	
	
	
	@AfterSuite
	public void destroyDriver(){
		driver.quit();
	}
}