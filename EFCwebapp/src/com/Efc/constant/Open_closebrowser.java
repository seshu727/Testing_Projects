package com.Efc.constant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Efc.Driverfactory.Testrun;
import com.Efc.Utilities.Propertiesdata;
import com.Efc.commonlibs.Commonmethods;

public class Open_closebrowser  {
	public static WebDriver driver;
	static Commonmethods common;

	@SuppressWarnings("static-access")
	@BeforeTest
	public static void loadbrowser() throws Throwable {
		common = new Commonmethods();
    Propertiesdata p = new Propertiesdata();
		 driver = new ChromeDriver();
		driver.get(p.getkeyvalue("URL"));
		
		common.staticwait(driver);
		 driver.manage().window().maximize(); 
		
	}
	
	@AfterTest
	public static void closebrowser() {
		driver.close();
	}
	
	
	
}