package com.wipro.testcases;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wipro.pages.BaseClass;
import com.wipro.pages.loginPage;
import com.wipro.utility.ExcelDataProvider;
import com.wipro.utility.Helper;

public class loginTest extends BaseClass{
	
	WebDriver driver;
	
	
	
	
	@Test
   public void loginApp() throws FileNotFoundException {
		
		
		
		loginPage pagelogin = PageFactory.initElements(driver, loginPage.class);
		pagelogin.loginToApp(excel.getStringData(1, 1, 1), excel.getStringData(1, 1, 1));
		

	   
   }

}
