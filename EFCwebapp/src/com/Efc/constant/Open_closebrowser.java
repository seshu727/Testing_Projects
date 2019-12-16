package com.Efc.constant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Efc.Driverfactory.Driverscript;
import com.Efc.Utilities.Propertiesdata;

public class Open_closebrowser  {
	public static WebDriver driver;

	@SuppressWarnings("static-access")
	@BeforeTest
	public static void loadbrowser() throws Throwable {
    Propertiesdata p = new Propertiesdata();
		 driver = new ChromeDriver();
		driver.get(p.getkeyvalue("URL"));
		 driver.manage().window().maximize(); 
		
	}
	
	@AfterTest
	public static void closebrowser() {
		driver.close();
	}
	
	
	
}