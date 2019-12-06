package com.Functionlib.java;

	



import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utilities.java.Propertiesdata;

public class Commonfunctions

	{
	static String value;
		
	   protected static WebDriver driver;
	  
		public static   WebDriver startBrowser() throws Throwable
		{
			if(Propertiesdata.getkeyvalue("browser").equalsIgnoreCase("chrome"))
			
			{
			//System.setProperty("webdriver.chrome.driver", "D:\\softwares files\\chromedriver.exe");
				    driver = new ChromeDriver();

			}
			else if(Propertiesdata.getkeyvalue("browser").equalsIgnoreCase("ie")){
				System.setProperty("webdriver.ie.driver", "D:\\softwares files\\IEDriverServer.exe");
				
				driver = new InternetExplorerDriver();
			}
			
			return driver;
		}
		
		public static void urlHitting() throws Throwable{
			
			//	System.out.println(" hitting");
			driver.get(Propertiesdata.getkeyvalue("URL"));
		//	System.out.println("not hitting");
			driver.manage().window().maximize();
			
		}


		public static void clickonButton(WebDriver driver ,String locatortype, String locatorvalue){
			
			if(locatortype.equalsIgnoreCase("id")){
				
				driver.findElement(By.id(locatorvalue)).click();
			}
			else if(locatortype.equalsIgnoreCase("name")){
				driver.findElement(By.name(locatorvalue)).click();
			}
			else if(locatortype.equalsIgnoreCase("xpath")){
				driver.findElement(By.xpath(locatorvalue)).click();
			
		}
		}
			public static void sendingData(WebDriver driver , String locatortype,String locatorvalue,String data){
				
				if(locatortype.equalsIgnoreCase("id")){
					driver.findElement(By.id(locatorvalue)).clear();
					
					driver.findElement(By.id(locatorvalue)).sendKeys(data);
				}
				else if(locatortype.equalsIgnoreCase("name")){
					driver.findElement(By.name(locatorvalue)).clear();
					driver.findElement(By.name(locatorvalue)).sendKeys(data);
				}
				else if(locatortype.equalsIgnoreCase("xpath")){
					driver.findElement(By.name(locatorvalue)).clear();
					driver.findElement(By.xpath(locatorvalue)).sendKeys(data);
					
				}
		}
			public static void WaitForFunctions(WebDriver driver ,String locatortype,String locatorvalue,String waittime){
				
				WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(waittime));
				if(locatortype.equalsIgnoreCase("id")){
					
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorvalue)));
				}
				else if(locatortype.equalsIgnoreCase("name")){
					
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorvalue)));
				}
				else  if(locatortype.equalsIgnoreCase("xpath")){
					
					wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(locatorvalue)));
				}	
		          
				
			}
			public static void implicitWait(WebDriver driver){
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
					
			}
			public static void closeBrowser(WebDriver driver){
				
				driver.close();
			}
			public static void submitButton(WebDriver driver,String locatortype,String locatorvalue){
				
				if(locatortype.equalsIgnoreCase("xpath")){
					driver.findElement(By.xpath(locatorvalue)).submit();
				}else
				if(locatortype.equalsIgnoreCase("id")){
					driver.findElement(By.id(locatorvalue)).submit();
				}else
					if(locatortype.equalsIgnoreCase("name")){
						driver.findElement(By.name(locatorvalue)).submit();	
			}
			}
			public static  void alertsHandle(){
				driver.switchTo().alert().accept();
			}
					
			
			public static void data(WebDriver driver,String loctortype,String locatorvalue) throws IOException
			{
				String message="";
				if(loctortype.equalsIgnoreCase("id"))
				{
				message=driver.findElement(By.id(locatorvalue)).getAttribute("value");
			}
				else if(loctortype.equalsIgnoreCase("xpath"))
				{
				message=driver.findElement(By.xpath(locatorvalue)).getAttribute("value");
			}
				else if(loctortype.equalsIgnoreCase("name"))
				{
				message=driver.findElement(By.name(locatorvalue)).getAttribute("value");

				
			}

			}
			public static void mouseOvers(){
		
					
					Actions act = new Actions(driver);
					act.moveToElement(driver.findElement(By.xpath("//li[@id='mi_a_stock_items']//a[contains(text(),'Stock Items')]")));
					act.build().perform();
					
					
					act.moveToElement(driver.findElement(By.xpath("//li[@id='mi_a_stock_categories']//a[contains(text(),'Stock Categories')]"))).click().build().perform();
					
				
					
			}
			
			public static void Login1() throws Throwable {
				
				System.out.println("Application started");
				
				System.out.println("title of application is:"+driver.getTitle());
				System.out.println("Url of App is:"+driver.getCurrentUrl());
				

		             Thread.sleep(8000);
					 driver.findElement(By.xpath("//zc-block-tree-node[1]/app-com-render[2]/div[1]/zc-widget-login[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("lo");
					    Thread.sleep(2000);
					 driver.findElement(By.xpath("//zc-block-tree-node[1]/app-com-render[2]/div[1]/zc-widget-login[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("123123");
					    Thread.sleep(2000);
					 driver.findElement(By.xpath("//div[4]/button[1]")).click();
					 Thread.sleep(10000);
					/// String loginStatus = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("toast-container"))).getText();
					 //System.out.println(loginStatus);
					 if(driver.findElement(By.xpath("//div[1]/div[1]/span[1]")).isDisplayed()) {
						 
					
						System.out.println("Test Passed::::::::::::::  Login Success");
						
					 }
					      
					 else {
						
						 System.out.println("Test Failed  Login Failed");
					 }
				
					 }
			
			
			
			
			
		
				
				
			}
	     	    
	     	    	 
	     	     
	     	     
				
		
				
				
			

			






