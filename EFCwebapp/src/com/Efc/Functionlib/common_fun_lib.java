package com.Efc.Functionlib;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Efc.Utilities.Get_property_data;

public class common_fun_lib  {
	protected static WebDriver driver;
	static String value;
	static ClipboardOwner owner =null;
	static int sleeptime = 2000;
	static Get_property_data po;
    
	@SuppressWarnings("static-access")
	public static WebDriver startBrowser() throws Throwable {
		if (po.getkeyvalue("browser").equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (po.getkeyvalue("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\PC\\git\\repository5\\DemoProject\\Driversdata\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (po.getkeyvalue("browser").equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\PC\\git\\repository5\\DemoProject\\Driversdata\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("Failed to start browser");
		}
		return driver;
	}
	public static void submitbtn() {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

	
    	public static void urlHitting(String url) throws Throwable {
		driver.get(url);
		driver.manage().window().maximize();
	   }
    	
    	
    	
    	
    	
         public static void fileUpload() throws Throwable {
		 StringSelection s = new StringSelection("C:\\Users\\PC\\Pictures\\Screenshots\\Screenshot (1).png");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, owner);
		 Robot r = new Robot();
		 r.setAutoDelay(1000);
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_V);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_V);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 staticwait(driver);
		 toastMessages();
         }
	   public static void clearingData(WebDriver driver, String locatortype, String locatorvalue) {
	    	if (locatortype.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locatorvalue)).clear();
	     	} }
	   
	   
      	public static void staticwait(WebDriver driver) throws InterruptedException {
		Thread.sleep(sleeptime);
		}
      	
      	
	      public static String textofElement(WebDriver driver, String locatortype, String locatorvalue) {
      
		if (locatortype.equalsIgnoreCase("id")) {

	     String data1=	driver.findElement(By.id(locatorvalue)).getText();
	     System.out.println(data1);
	     }

		else if (locatortype.equalsIgnoreCase("xpath")) {

	      String data1=	driver.findElement(By.id(locatorvalue)).getText();
	      System.out.println(data1);
	      }
		return locatorvalue;
	      }
	      
	      
     	public static void clickonButton(WebDriver driver, String locatortype, String locatorvalue) throws Throwable {

		   if (locatortype.equalsIgnoreCase("id")) {

			driver.findElement(By.id(locatorvalue)).click();
		    }
		   else if (locatortype.equalsIgnoreCase("xpath")) {
		
			driver.findElement(By.xpath(locatorvalue)).click();
		    }
		   else if (locatortype.equalsIgnoreCase("LinkText")) {
				
				driver.findElement(By.linkText(locatorvalue)).click();
			    }
		   else if (locatortype.equalsIgnoreCase("css")) {
				
				driver.findElement(By.cssSelector(locatorvalue)).click();
			    }
	        }

	   public static void toastMessages() throws Throwable {

		String errormessage = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.id(Get_property_data.getkeyvalue("toastid1")))).getText();
		String replacevalue=errormessage.replace("×", "");
		//System.out.println(replacevalue.trim());
		if(replacevalue.contains("Successfully")) {
			System.out.println("Toast Message "+replacevalue.trim());
			System.out.println("Data Added successfully");
		}else if(replacevalue.contains("Company")){
			System.out.println("Toast Message "+replacevalue.trim());
			System.out.println("Data Adding Unsuccessful");
		}
	  }

	public static String sendingData(WebDriver driver, String locatortype, String locatorvalue, String data)
			throws Throwable {

		if (locatortype.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locatorvalue)).clear();

			driver.findElement(By.id(locatorvalue)).sendKeys(data);
		}
		else if (locatortype.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locatorvalue)).clear();

			driver.findElement(By.xpath(locatorvalue)).sendKeys(data);
		}
		
		else if (locatortype.equalsIgnoreCase("className")) {
			driver.findElement(By.cssSelector(locatorvalue)).clear();

			driver.findElement(By.cssSelector(locatorvalue)).sendKeys(data);
		}
		else if (locatortype.equalsIgnoreCase("linktext")) {
			driver.findElement(By.cssSelector(locatorvalue)).clear();

			driver.findElement(By.cssSelector(locatorvalue)).sendKeys(data);
		}
		return data;
	}

	public static void explicitwait(WebDriver driver, String locatortype, String locatorvalue, String waittime) {

		WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(waittime));
		if (locatortype.equalsIgnoreCase("id")) {

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorvalue)));
		} else if (locatortype.equalsIgnoreCase("name")) {

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorvalue)));
		} else if (locatortype.equalsIgnoreCase("xpath")) {

			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(locatorvalue)));
		}

	}

	public static void implicitWait1(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void closeBrowser(WebDriver driver) {

		driver.close();
	}

	public static void alertsHandle() {
		String al = driver.switchTo().alert().getText();
		System.out.println(al);
		String str1="ok";
		String str2="cancel";
		if(str1.equalsIgnoreCase("ok")) {
		driver.switchTo().alert().accept();
		System.out.println("Alert Accepted");
	}
	else if(str2.equalsIgnoreCase("cancel")){
		
		driver.switchTo().alert().dismiss();
		System.out.println("Alert Accepted on cancel btn");
	}
	else {
		System.out.println("Alert Accept/dismiss Failed");
	}
	}
	public static void data(WebDriver driver, String loctortype, String locatorvalue) throws IOException {
		String message = "";
		if (loctortype.equalsIgnoreCase("id")) {
			message = driver.findElement(By.id(locatorvalue)).getAttribute("value");
		} else if (loctortype.equalsIgnoreCase("xpath")) {
			message = driver.findElement(By.xpath(locatorvalue)).getAttribute("value");
		} else if (loctortype.equalsIgnoreCase("name")) {
			message = driver.findElement(By.name(locatorvalue)).getAttribute("value");
	}}
}
	



