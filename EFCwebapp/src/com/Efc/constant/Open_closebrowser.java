package com.Efc.constant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Efc.Driverfactory.Testrun;
import com.Efc.Functionlib.commonfunlib;
import com.Efc.Utilities.Propertiesdata;

public class Open_closebrowser  {
	public static WebDriver driver;
	@BeforeTest
	public static void loadbrowser() throws Throwable {
       Propertiesdata p = new Propertiesdata();
		 driver = new ChromeDriver();
		 driver.get(p.getkeyvalue("URL"));
		 Thread.sleep(4000);
		 driver.manage().window().maximize(); 
		
	}
	

	
}