package com.infosys.MYUHCapplication.basetest;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.infosys.MYUHCapplication.browserfactory.DriverFactory;
import com.infosys.MYUHCapplication.objectrepository.AppConsts;
import com.infosys.MYUHCapplication.pageobjects.PageLogin;



public class BaseTest {
	
	
	 WebDriver driver;
	  
	  @BeforeSuite
	public void DbConnection() {
		
	}

	 
	  
	  
	  
	  
	  @Parameters({"browser"}) 
	  @BeforeMethod()
	  public void browserlaunch(@Optional("ie") String browsertest) throws IOException {
		  DriverFactory browser=new  DriverFactory(driver);
		  driver=browser.browserOpen(browsertest);
		
	  }
	  
	 
	@Test
	public void firstTestcase() throws IOException {
		
	PageLogin pl=new PageLogin(driver);	
	pl.Login(AppConsts.URL,AppConsts.Username,AppConsts.Password);
		
		
	}	
	
	@Test 
	public void SecondTestcase() throws IOException {
		
		
		
	}
	
	@AfterMethod
	public void browserclose() {
		
		driver.close();
		
	}


}
