package com.infosys.MYUHCapplication.pageobjects;

import org.openqa.selenium.WebDriver;

import com.infosys.MYUHCapplication.resuableactionlib.ReusableActionLib;

public class PageHome extends ReusableActionLib{
	
	WebDriver driver;
	
	public PageHome(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}
	

}
