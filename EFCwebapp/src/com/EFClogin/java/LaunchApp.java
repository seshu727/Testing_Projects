package com.EFClogin.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class LaunchApp {
	protected static WebDriver driver;
	
	@BeforeTest
	public static void loadbrowser() throws Throwable {
		 driver = new ChromeDriver();
		 driver.get("http://efcdev.firstaccess.co/");
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