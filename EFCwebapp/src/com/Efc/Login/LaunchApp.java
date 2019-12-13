package com.Efc.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Efc.Utilities.Propertiesdata;

public class LaunchApp extends Propertiesdata {
	public static WebDriver driver;
	
	@BeforeTest
	public static void loadbrowser() throws Throwable {
		 driver = new ChromeDriver();
		 driver.get(getkeyvalue("URl"));
		 driver.manage().window().maximize(); 
		
	}
	
	/*
	 * @AfterTest public static void closeBrowser() {
	 * 
	 * driver.close();
	 * 
	 * }
	 */
	
	
	
	
}