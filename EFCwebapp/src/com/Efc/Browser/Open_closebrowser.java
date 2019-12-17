package com.Efc.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import com.Efc.Utilities.Get_property_data;

public class Open_closebrowser  {
	public static WebDriver driver;
	@BeforeTest
	public static void loadbrowser() throws Throwable {
       Get_property_data p = new Get_property_data();
		 driver = new ChromeDriver();
		 driver.get(p.getkeyvalue("URL"));
		 driver.manage().window().maximize(); 
		
	}
	

	
}