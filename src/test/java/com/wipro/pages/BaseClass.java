package com.wipro.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.wipro.utility.BrowserFactory;
import com.wipro.utility.ConfigDataProvider;
import com.wipro.utility.ExcelDataProvider;
import com.wipro.utility.Helper;

public class BaseClass {
	
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	
	
	@BeforeSuite
	public void setUpSuite() throws FileNotFoundException {
		excel = new ExcelDataProvider();
		config = new ConfigDataProvider();
	}
	
	@BeforeClass
	public void setup() {
		
		driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getStagingURL());
		
	}
	
	
	@AfterClass
	public void teardown() {
		
		BrowserFactory.quitBrowser(driver);
		
	}
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			Helper.captureScreenshot(driver);
		}
		
	}

}
