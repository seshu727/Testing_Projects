package com.Functionlib.java;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.EFClogin.java.LaunchApp;
import com.Utilities.java.Excel;



public class Functions extends LaunchApp {
	 static JavascriptExecutor js = (JavascriptExecutor) driver;
	static ClipboardOwner owner = null;
	
	public static void Login() throws Throwable {
		
		System.out.println("Application started");
		
		System.out.println("title of application is:"+driver.getTitle());
		System.out.println("Url of App is:"+driver.getCurrentUrl());
		
             Thread.sleep(1000);
			 driver.findElement(By.xpath("//zc-block-tree-node[1]/app-com-render[2]/div[1]/zc-widget-login[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("lo1");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//zc-block-tree-node[1]/app-com-render[2]/div[1]/zc-widget-login[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("123123");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//div[4]/button[1]")).click();
			 Thread.sleep(5000);
			/// String loginStatus = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("toast-container"))).getText();
			 String actualUrl="http://efcdev.firstaccess.co/#/loan/dashboard/dashboard";
		        String expectedUrl= driver.getCurrentUrl();
		        
		     if(actualUrl.equalsIgnoreCase(expectedUrl)) {
		    	 System.out.println("Test Passed");
		    	 
		     }else {
		    	 System.out.println("Test Failed");
		     }
	}
		        
		     public static void Waits() {
		    	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		    	 
		     }
		     
		     public static void Rightarrow() {
		    	 driver.findElement(By.xpath("//div[3]/div[1]/div[1]/div[2]/div[1]/span[2]/a[1]")).click();
		    	 
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
		 Thread.sleep(10000);  
		 if(driver.findElement(By.xpath("//zc-wrapper-validation-messages[1]/zc-file[1]/div[2]/ul[1]/li[1]/span[1]")).isDisplayed()) {
			 System.out.println("File uploaded success");
		 }else {
			 
			 System.out.println("File upload failed");
		 }
		 
	}
			 
			 public static void clientCreation() throws Throwable {
				 
				 Thread.sleep(1000);
			 driver.findElement(By.xpath("//div[@class='breadcrumb-widget']//a[@class='icon-bars sidebar-toggle']")).click();
			 
			 driver.findElement(By.xpath("//div[1]/app-side-menu[1]/ul[1]/li[3]/a[1]/span[1]")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
			 Thread.sleep(1000);
			//String basicpage = driver.findElement(By.xpath("//formly-field[1]/zc-view-wrapper[1]/zc-field-blog[1]/div[1]/div[1]")).getText();
			//System.out.println("Client 1st form:::::::"+basicpage);
			
			Thread.sleep(2000);
			// driver.close();
			System.out.println("Client creation started");
					 driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Smith");
					 Thread.sleep(1000);
					 driver.findElement(By.cssSelector("#client_number")).sendKeys("123123123123");
					 Thread.sleep(2000);
					 driver.findElement(By.cssSelector("body.sidebar.sidebar-icons:nth-child(2) div.main-content div.p-contain zc-block-tree-node.block div.ng-star-inserted div.row.no-gutters.ng-star-inserted div.col div.zc-widget-form.zc-panel.zc-contact-form form.ng-invalid.ng-star-inserted.ng-dirty.ng-touched formly-form.row formly-field.col-md-6.col-sm-12.ng-star-inserted:nth-child(4) zc-wrapper-label.ng-star-inserted zc-wrapper-fieldset.ng-star-inserted div.form-group zc-wrapper-validation-messages.ng-star-inserted zc-field-radio.ng-star-inserted div.ng-star-inserted div.radio.ng-star-inserted:nth-child(1) label.custom-control.custom-radio > span.custom-control-label")).click();
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//formly-field[5]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/label[1]")).click();
					// Select s =  new Select(driver.findElement(By.cssSelector("body.sidebar.sidebar-icons:nth-child(2) div.main-content div.p-contain zc-block-tree-node.block div.ng-star-inserted div.row.no-gutters.ng-star-inserted div.col div.zc-widget-form.zc-panel.zc-contact-form form.ng-invalid.ng-star-inserted.ng-dirty.ng-touched formly-form.row formly-field.col-md-6.col-sm-12.ng-star-inserted:nth-child(5) zc-wrapper-label.ng-star-inserted zc-wrapper-fieldset.ng-star-inserted div.form-group zc-wrapper-validation-messages.ng-star-inserted zc-field-select.ng-star-inserted div.ng-star-inserted p-dropdown.ng-tns-c10-0.ng-untouched.ng-pristine.ng-valid.ng-star-inserted div.ng-tns-c10-0.ui-dropdown.ui-widget.ui-state-default.ui-corner-all.ui-helper-clearfix.ui-dropdown-clearable > div.ui-dropdown-trigger.ui-state-default.ui-corner-right:nth-child(4)")));
					 Thread.sleep(2000);
				    //	s.selectByIndex(1);
					 driver.findElement(By.xpath("//span[contains(text(),'Company')]")).click();
					 Thread.sleep(2000);
					 
					 driver.findElement(By.xpath("//formly-form[1]/formly-field[6]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/label[1]")).click();
					 Thread.sleep(2000);
					 driver.findElement(By.xpath("//li[1]/span[1]")).click();
					 Thread.sleep(2000);
						
					 driver.findElement(By.xpath("//form[1]/formly-form[1]/formly-field[7]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-input[1]/div[1]/input[1]")).sendKeys("12312312312312");
					 Thread.sleep(2000);
					 driver.findElement(By.xpath("//div[@class='custom-file ng-star-inserted']")).click();
					 Thread.sleep(5000);
					 //uploading file
					 fileUpload();
		
					driver.findElement(By.xpath("//formly-field[15]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-input[1]/div[1]/input[1]")).sendKeys("online");
					Thread.sleep(2000);
					
					//male
					driver.findElement(By.xpath("//div[1]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[16]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-radio[1]/div[1]/div[1]/label[1]")).click();
					Thread.sleep(3000);
					//female
					//driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[16]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-radio[1]/div[1]/div[2]/label[1]")).click();
					driver.findElement(By.xpath("//formly-form[1]/formly-field[17]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-radio[1]/div[1]/div[1]/label[1]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//formly-form[1]/formly-field[18]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-formly-field-date[1]/p-calendar[1]/span[1]/input[1]")).sendKeys("12/11/1993");
					driver.findElement(By.linkText("12")).click();
					driver.findElement(By.cssSelector("#place_of_birth")).sendKeys("hyd");
					driver.findElement(By.cssSelector("#client_address")).sendKeys("hyd");//zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[16]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-radio[1]/div[1]/div[2]/label[1]
					driver.findElement(By.cssSelector("#email")).sendKeys("sess@gmail.com");
					driver.findElement(By.cssSelector("#phone_num")).sendKeys("423432439");
					driver.findElement(By.cssSelector("#alternative_phone")).sendKeys("423432432");
					driver.findElement(By.xpath("//formly-form[1]/div[1]/button[1]")).click();
					Thread.sleep(10000);
					
				
					
				WebElement table=driver.findElement(By.xpath("//div[1]/zc-widget-data-list[1]/div[1]/p-table[1]/div[1]/div[2]/table[1]"));
				List<WebElement>rows=table.findElements(By.tagName("tr"));
				System.out.println("no of rows are::"+rows.size());
				List<WebElement>cols=rows.get(1).findElements(By.tagName("td"));
				System.out.println("no of columns are::"+cols.size());
				String dataoftable =cols.get(0).getText();
				System.out.println(dataoftable);
					
			    	   if(dataoftable.equalsIgnoreCase("smith")) {
			    		   System.out.println("Client creation success");
			    		   System.out.println("Test passed:::::::::::");
			    		   
			    		   
			    	   }else {
			    		   System.out.println("Client creation failed");
			    		   System.out.println("Test failed");
			    		   
			    	   }
			 }
			    	
			 public static void  womenLoan() throws Throwable {
				 System.out.println("New appraisal creation started");
				 
				// Thread.sleep(10000);
				 driver.findElement(By.xpath("//div[@class='breadcrumb-widget']//a[@class='icon-bars sidebar-toggle']")).click();
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//app-com-render[1]/div[1]/app-side-menu[1]/ul[1]/li[2]/a[1]/span[1]")).click();
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//div[1]/zc-widget-data-list[1]/div[1]/p-table[1]/div[1]/div[1]/div[1]/button[1]")).click();
				 Thread.sleep(2000);
				 
				 driver.findElement(By.xpath("//formly-form[1]/formly-field[2]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/label[1]")).click();
					
				 Thread.sleep(2000);
				 Actions a = new Actions(driver);
				 a.sendKeys(Keys.ARROW_DOWN);
				 a.sendKeys(Keys.ENTER);
				 a.build().perform();
				
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//div[1]/div[1]/form[1]/formly-form[1]/formly-field[3]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/div[3]")).click();
				 a.sendKeys(Keys.ARROW_DOWN);
				 a.sendKeys(Keys.ENTER);
				 a.build().perform();
				 Thread.sleep(2000);
				
				 driver.findElement(By.xpath("//div[1]/form[1]/formly-form[1]/formly-field[4]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/div[3]")).click();
				 a.sendKeys(Keys.ARROW_DOWN);
				 a.sendKeys(Keys.ENTER);
				 a.build().perform();
				 Thread.sleep(3000);
				
			
			
				driver.findElement(By.xpath("//formly-field[5]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/div[3]")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//div[2]/ul[1]/li[1]/span[1]")).click();
				Thread.sleep(3000);
				//System.out.println("selected client name");
				
			    driver.findElement(By.xpath("//p-autocomplete[1]/span[1]/button[1]")).click();
			

				Thread.sleep(5000);
				a.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(3000);
				a.sendKeys(Keys.ENTER);
				a.build().perform();
			    Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"business_information@no_of_yrs_in_bus\"]")).sendKeys("8");		
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[1]/form[1]/formly-form[1]/div[1]/button[2]")).click();
				
			    	    }
			    	
	
			 public static void smeLoan() throws Throwable {
				 System.out.println("New appraisal creation started");
				 
					// Thread.sleep(10000);
					 driver.findElement(By.xpath("//div[@class='breadcrumb-widget']//a[@class='icon-bars sidebar-toggle']")).click();
					 Thread.sleep(2000);
					 driver.findElement(By.xpath("//app-com-render[1]/div[1]/app-side-menu[1]/ul[1]/li[2]/a[1]/span[1]")).click();
					 Thread.sleep(2000);
					 driver.findElement(By.xpath("//div[1]/zc-widget-data-list[1]/div[1]/p-table[1]/div[1]/div[1]/div[1]/button[1]")).click();
					 Thread.sleep(2000);
				 //1st one   
				 driver.findElement(By.xpath("//formly-form[1]/formly-field[2]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/label[1]")).click();
					
				 Thread.sleep(2000);
				 Actions a = new Actions(driver);
				 a.sendKeys(Keys.ARROW_DOWN);
				 a.sendKeys(Keys.ENTER);
				 a.build().perform();
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//div[1]/div[1]/form[1]/formly-form[1]/formly-field[3]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/div[3]")).click();
				 a.sendKeys(Keys.ARROW_DOWN);
				 a.sendKeys(Keys.ENTER);
				 a.build().perform();
				 Thread.sleep(2000);
				
				
				 //here we have to change if we want select a women ,to just one tap down 
				 driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[1]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[4]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/div[3]")).click();
				 Thread.sleep(1000);
				 a.sendKeys(Keys.ARROW_DOWN);
			     	a.sendKeys(Keys.ARROW_DOWN);
				   a.sendKeys(Keys.ARROW_DOWN);
				   a.sendKeys(Keys.ENTER);
				   a.build().perform();
					 Thread.sleep(2000);
				
				driver.findElement(By.xpath("//formly-field[5]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/div[3]")).click();
				 Thread.sleep(2000);
				driver.findElement(By.xpath("//div[2]/ul[1]/li[1]/span[1]")).click();
				 Thread.sleep(2000);
			
				
			    driver.findElement(By.xpath("//p-autocomplete[1]/span[1]/button[1]")).click();
				

				 Thread.sleep(2000);
				a.sendKeys(Keys.ARROW_DOWN);
				 Thread.sleep(2000);
				a.sendKeys(Keys.ENTER);
				a.build().perform();
				//System.out.println("selected client name");
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[1]/form[1]/formly-form[1]/div[1]/button[2]")).click();
				 System.out.println("New appraisal creation completed");
				 
			 }
			 
				 
			 
			 public static void homeLoan() throws Throwable {
				 
				 System.out.println("New appraisal creation started");
				
					Thread.sleep(4000);
					 driver.findElement(By.xpath("//div[@class='breadcrumb-widget']//a[@class='icon-bars sidebar-toggle']")).click();
					 Thread.sleep(2000);
					 driver.findElement(By.xpath("//app-com-render[1]/div[1]/app-side-menu[1]/ul[1]/li[2]/a[1]/span[1]")).click();
					 Thread.sleep(2000);
					 driver.findElement(By.xpath("//div[1]/zc-widget-data-list[1]/div[1]/p-table[1]/div[1]/div[1]/div[1]/button[1]")).click();
					 Thread.sleep(2000);;
				 
				 driver.findElement(By.xpath("//formly-form[1]/formly-field[2]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/label[1]")).click();
					
				 Thread.sleep(5000);
				 Actions a = new Actions(driver);
				 a.sendKeys(Keys.ARROW_DOWN);
				 a.sendKeys(Keys.ENTER);
				 a.build().perform();
				
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//div[1]/div[1]/form[1]/formly-form[1]/formly-field[3]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/div[3]")).click();
				 a.sendKeys(Keys.ARROW_DOWN);
				 a.sendKeys(Keys.ENTER);
				 a.build().perform();
				 Thread.sleep(4000);
				//
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//div[1]/form[1]/formly-form[1]/formly-field[4]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/div[3]")).click();
				 a.sendKeys(Keys.ARROW_DOWN);
		         a.sendKeys(Keys.ARROW_DOWN);
				 a.sendKeys(Keys.ENTER);
				 a.build().perform();
				 Thread.sleep(2000);
				 
				driver.findElement(By.xpath("//formly-field[5]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/div[3]")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//div[2]/ul[1]/li[1]/span[1]")).click();
				 Thread.sleep(2000);
				System.out.println("selected client name");
				
			    driver.findElement(By.xpath("//p-autocomplete[1]/span[1]/button[1]")).click();
				 Thread.sleep(2000);
				a.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(3000);
				a.sendKeys(Keys.ENTER);
				a.build().perform();
			   
				
				 Thread.sleep(2000);
				driver.findElement(By.xpath("//formly-form[1]/formly-field[9]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-input[1]/div[1]/input[1]")).sendKeys("8");		
				 Thread.sleep(2000);
				driver.findElement(By.xpath("//div[1]/form[1]/formly-form[1]/div[1]/button[2]")).click();
				 
				 
			 }
			 
			 public static void clientInfoandbusiness() throws InterruptedException {

				 System.out.println("user in client info form");
				 Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
				 
				 driver.findElement(By.xpath("//div[1]/div[1]/div[2]/div[1]/span[1]/a[1]")).click();
				 Thread.sleep(2000);
				 System.out.println("business info form");
				 driver.findElement(By.xpath("//div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[1]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-input[1]/div[1]/input[1]")).sendKeys("software");
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[2]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-input[1]/div[1]/input[1]")).sendKeys("busi");
				 Thread.sleep(2000);
				
				 driver.findElement(By.xpath("//zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[3]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-input[1]/div[1]/input[1]")).sendKeys("hyd");
				 
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//div[1]/form[1]/formly-form[1]/formly-field[4]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-input[1]/div[1]/input[1]")).sendKeys("10");
				 Thread.sleep(2000);
				 Actions d = new Actions(driver);
				 d.sendKeys(Keys.PAGE_DOWN);
				 d.build().perform();
				 
				 driver.findElement(By.xpath("//div[1]/form[1]/formly-form[1]/formly-field[5]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/label[1]")).click();
				 Actions s = new Actions(driver);
				 s.sendKeys(Keys.ARROW_DOWN);
				 s.sendKeys(Keys.ENTER);
				 s.build().perform();
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//p-calendar[1]/span[1]/input[1]")).sendKeys("08/11/2010");
				 Thread.sleep(2000);
				 driver.findElement(By.linkText("6")).click();
				 Thread.sleep(2000);driver.findElement(By.xpath("//div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[8]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-input[1]/div[1]/input[1]")).sendKeys("8");
				 driver.findElement(By.xpath("//app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[9]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-phone-field[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("123123123");
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//div[1]/form[1]/formly-form[1]/formly-field[10]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-phone-field[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("123123123");
				 Thread.sleep(2000);
				 
				 driver.findElement(By.xpath("//form[1]/formly-form[1]/formly-field[11]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/div[3]/span[1]")).click();
				 Thread.sleep(2000);
				// driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/ul[1]/li[1]/span[1]")).click();
				 //Thread.sleep(4000);
				 driver.findElement(By.xpath("//div[1]/form[1]/formly-form[1]/formly-field[11]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/div[3]")).click();
				// driver.findElement(By.xpath("//zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[12]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/label[1]")).click();
				 s.sendKeys(Keys.ARROW_DOWN);
				 s.sendKeys(Keys.ENTER);
				 s.build().perform();
				 
				 driver.findElement(By.xpath("//zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[12]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/label[1]")).click();
				 s.sendKeys(Keys.ARROW_DOWN);
				 s.sendKeys(Keys.ENTER);
				 s.build().perform();
				 Thread.sleep(2000);
				 Actions d1= new Actions(driver);
				 d1.sendKeys(Keys.PAGE_DOWN);
				 d1.build().perform();
				 
				 driver.findElement(By.xpath("//div[1]/div[1]/form[1]/formly-form[1]/formly-field[13]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-input[1]/div[1]/input[1]")).sendKeys("8");
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//form[1]/formly-form[1]/formly-field[14]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-input[1]/div[1]/input[1]")).sendKeys("2001");
				 Thread.sleep(2000);
                 driver.findElement(By.xpath("//div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
                 
                 String successmessage = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("toast-container"))).getText();
				 System.out.println(successmessage);
				 
				 if(successmessage.contains("Updated")) {
					 System.out.println("Client&BusinessForm Successfully Updated");
					 System.out.println("Test Passed:::::::::");
					 
				 }
				 else {
					 
					 System.out.println("Client&BusinessForm NotUpdated");
					 System.out.println("Test Failed");
				 }

				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/span[2]/a[1]")).click();
				 
			 }
		
			 public static void loanApp() throws Throwable {
				
				 System.out.println("user at loan application form");
				  Thread.sleep(4000);
				 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[1]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-currency-field[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("5000000");
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[2]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-input[1]/div[1]/input[1]")).sendKeys("12");
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[3]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-currency-field[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("12");
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//div[1]/form[1]/formly-form[1]/formly-field[4]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-formly-field-date[1]/p-calendar[1]/span[1]/input[1]")).sendKeys("20/11/2018");
				 Thread.sleep(2000);
				 driver.findElement(By.linkText("20")).click();
				   // Thread.sleep(4000);
				    Actions f1=new Actions(driver);
				    f1.sendKeys(Keys.PAGE_DOWN);
					 f1.build().perform();
					 Thread.sleep(10000);
				 driver.findElement(By.xpath("//zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/div[3]")).click();
				 Thread.sleep(2000);
				 Actions f = new Actions(driver);
				 f.sendKeys(Keys.ARROW_DOWN);
				 f.sendKeys(Keys.ENTER);
				 f.build().perform();
				 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[6]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-input[1]/div[1]/input[1]")).sendKeys("business");
				   
				 
				 
				 Thread.sleep(4000);
				 
				 driver.findElement(By.xpath("//div[1]/form[1]/formly-form[1]/formly-field[7]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-table-field[1]/div[1]/div[1]/button[1]")).click();
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//div[1]/div[1]/form[1]/formly-form[1]/formly-field[1]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-input[1]/div[1]/input[1]")).sendKeys("cool");
				 Thread.sleep(2000);
				 
				 driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[2]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-input[1]/div[1]/input[1]")).sendKeys("12");
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[3]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-currency-field[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("1000000");
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//div[1]/div[1]/div[1]/form[1]/formly-form[1]/div[1]/button[2]")).click();
				 Thread.sleep(2000);
				 
				 driver.findElement(By.xpath("//div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
				 String successmessage1 = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("toast-container"))).getText();
				 System.out.println(successmessage1);
				 
		
		  if(successmessage1.contains("Updated")) {
		  System.out.println("LoanAppForm Successfully Updated");
		  System.out.println("Test Passed:::::::::::");
		  
		  } else {
		  
		  System.out.println("LoanAppForm NotUpdated");
		  System.out.println("Test Failed");
		  }
		 
				    Thread.sleep(7000);
				    driver.findElement(By.xpath("//zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/span[2]/a[1]")).click();
			 }
			 
			 public static void Security() throws Throwable {
				 
				 
				 System.out.println("user in security form");
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//div[1]/form[1]/formly-form[1]/formly-field[1]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-input[1]/div[1]/input[1]")).sendKeys("seshu");
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//div[1]/form[1]/formly-form[1]/formly-field[2]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-input[1]/div[1]/input[1]")).sendKeys("cool");
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[3]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-input[1]/div[1]/input[1]")).sendKeys("friend");
				 Thread.sleep(2000);
				 Actions d = new Actions(driver);
				 d.sendKeys(Keys.PAGE_DOWN);
				 d.build().perform();
				 Thread.sleep(7000);
				 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[5]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-input[1]/div[1]/input[1]")).sendKeys("normal");
				 Thread.sleep(2000);
				 
				 driver.findElement(By.xpath("//*[@id=\"secu_guar_col_prop@description\"]")).sendKeys("ok");
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//*[@id=\"secu_guar_col_prop@collateral_value\"]")).sendKeys("10000000");
				 Thread.sleep(3000);
				 System.out.println("clicking save btn");
				 driver.findElement(By.xpath("//div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]"));
				 Thread.sleep(3000);
				 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/span[1]/a[1]")).click();
				 
				 driver.findElement(By.xpath("//div[@class='breadcrumb-widget']//a[@class='icon-bars sidebar-toggle']")).click();
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//app-com-render[1]/div[1]/app-side-menu[1]/ul[1]/li[2]/a[1]/span[1]")).click();
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-data-list[1]/div[1]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]")).click();
				 Thread.sleep(2000);
					
				 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[1]/i[1]")).click();

				 Thread.sleep(2000);
				 
				 driver.findElement(By.xpath("//div[2]/div[2]/ul[1]/li[1]/ul[1]/li[4]/div[1]/span[2]")).click();
				 Thread.sleep(7000);
					
				// driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/button[2]")).click();

				 driver.findElement(By.xpath("//div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
				 Thread.sleep(2000);
				// driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/zc-stage-view[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[3]/a[1]")).click();
                 driver.findElement(By.xpath("//div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/button[2]")).click();
                 System.out.println("After clicking review button");
            	 Thread.sleep(2000);
                String text=driver.findElement(By.xpath("//div[1]/div[2]/div[2]/div[1]")).getText();
                System.out.println("text if we click on Review button "+text);
                
					
           	 Thread.sleep(2000);
                 
                 driver.findElement(By.xpath("/html/body/app-root/app-page-layout/div[2]/div[3]/div/app-page/div/zc-page-render/zc-block-tree-node/zc-block-tree-node/app-com-render/div/zc-widget-stage-form/zc-stage-form/zc-stage-view/div/div[2]/div[1]/button")).click();
            	 Thread.sleep(2000);
                 driver.findElement(By.xpath("//*[@id=\"approvalActionComment\"]")).sendKeys("ok");
                String text1= driver.findElement(By.xpath("//div/zc-widget-stage-form/zc-stage-form/zc-stage-view/div/div[2]/div")).getText();
                System.out.println("After forwaring text :"+text1);
                 
           	 Thread.sleep(2000);
                 driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/div/zc-widget-form/div/div/div/form/formly-form/div/button")).click();

                 
                 String text2=driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div[2]/span[1]/span[1]")).getText();
               
				 System.out.println(text2);
				 if(text2.contains("Subm")) {
					 System.out.println(" Loan Applictaion Successfully Submitted");
					 System.out.println("Test Passed:::::::::::::");
					 
				 }
				 else {
					 
					 System.out.println(" Loan Applictaion Not Submitted");
					 System.out.println("Test Failed");
				 }
                 Thread.sleep(5000);
                
			 }
			 public static  void commonFields() throws InterruptedException {
				 driver.findElement(By.xpath(
						  "/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[1]/a[1]")).click(
						  ); Thread.sleep(3000); driver.findElement(By.xpath(
						  "/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[2]/app-com-render[1]/div[1]/app-side-menu[1]/ul[1]/li[2]/a[1]/span[1]"
						  )).click(); Thread.sleep(3000); driver.findElement(By.xpath(
						  "/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-data-list[1]/div[1]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/span[1]/span[1]"
						  )).click(); Thread.sleep(3000); driver.findElement(By.xpath(
						  "/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[1]"
						  )).click(); Thread.sleep(3000); 
						  //for sales 
						  //driver.findElement(By.xpath("//div[2]/ul[1]/li[2]/ul[1]/li[3]/div[1]/span[2]")).click();
						  
			 }
			 
			 public static void entrepreneurinfo() throws Throwable {
				 Thread.sleep(10000);
				 
		          // commonFields();
		 
				// whole app
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/zc-stage-view[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[3]/a[1]")).click();
				 
				 System.out.println("Entrepreneur information page");
				  Thread.sleep(2000);
				  //To scroll the page down
				  ((JavascriptExecutor)driver).executeScript("window.scrollBy(200,300)");
				  Thread.sleep(8000);
				driver.findElement(By.xpath("//zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/div[3]")).click();
				  Thread.sleep(1000);
				 Actions f = new Actions(driver);
				 f.sendKeys(Keys.ARROW_DOWN);
				 f.sendKeys(Keys.ARROW_DOWN);
				 f.sendKeys(Keys.ARROW_DOWN);
				 f.sendKeys(Keys.ARROW_DOWN);
				 f.sendKeys(Keys.ENTER);
				 f.build().perform();
				  Thread.sleep(2000);
				 // ((JavascriptExecutor)driver).executeScript("window.scrollBy(200,300)");
				 driver.findElement(By.xpath("//*[@id=\"entrepreneur@entre_proff_hist\"]")).clear();
				      driver.findElement(By.xpath("//*[@id=\"entrepreneur@entre_proff_hist\"]")).sendKeys("ok");
				      Thread.sleep(1000);

					 driver.findElement(By.xpath("//*[@id=\"entrepreneur@employer_name\"]")).clear();
					 driver.findElement(By.xpath("//*[@id=\"entrepreneur@employer_name\"]")).sendKeys("seshu");
				  
					  Thread.sleep(2000);
					 driver.findElement(By.xpath("//*[@id=\"entrepreneur@salary\"]")).clear();
					 driver.findElement(By.xpath("//*[@id=\"entrepreneur@salary\"]")).sendKeys("1200000");
					  Thread.sleep(2000);
					 driver.findElement(By.xpath("//*[@id=\"entrepreneur@employer_address\"]")).clear();
					 driver.findElement(By.xpath("//*[@id=\"entrepreneur@employer_address\"]")).sendKeys("ok");
					  Thread.sleep(2000);
					 driver.findElement(By.xpath("//div/div/button")).click();
					 String successmessage4 = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("toast-container"))).getText();
					 System.out.println(successmessage4);
					 
					 if(successmessage4.contains("Updated")) {
						 System.out.println("Entrepreneur Successfully Updated");
						 System.out.println("Test Passed::::::::::");
						 
					 }
					 else {
						 
						 System.out.println("Entrepreneur NotUpdated");
						 System.out.println("Test Failed");
					 }
					  Thread.sleep(2000);;
					
					 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/span[1]/a[1]")).click();
					  Thread.sleep(2000);
					
			 }
			 
				
				 public static void businessProfile() throws Throwable {
					 System.out.println("user in business profile page");
					 
						Thread.sleep(10000);
					 driver.findElement(By.xpath("//div[1]/zc-wrapper-validation-messages[1]/zc-file[1]/div[1]")).click();
						
						fileUpload();
					 System.out.println("done");
				
					 ((JavascriptExecutor)driver).executeScript("window.scrollBy(50,200)");
						Thread.sleep(6000);
						
				  
					 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[3]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/label[1]")).click();
					 Actions g = new Actions(driver);
					 g.sendKeys(Keys.ARROW_DOWN);
					 g.sendKeys(Keys.ENTER);
					 g.build().perform();
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[4]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/label[1]")).click();
					 g.sendKeys(Keys.ARROW_DOWN);
					 g.sendKeys(Keys.ENTER);
					 g.build().perform();
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[5]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/label[1]")).click();
					 g.sendKeys(Keys.ARROW_DOWN);
					 g.sendKeys(Keys.ENTER);
					 g.build().perform();
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[6]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/label[1]")).click();
					 g.sendKeys(Keys.ARROW_DOWN);
					 g.sendKeys(Keys.ENTER);
					 g.build().perform();
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("/html/body/app-root/app-page-layout/div[2]/div[3]/div/app-page/div/zc-page-render/zc-block-tree-node/zc-block-tree-node/app-com-render/div/zc-widget-stage-form/zc-stage-form/div[2]/div[3]/div/div[1]/div[2]/div/div/button")).click();
					 
					 
					 String successmessage5 = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("toast-container"))).getText();
					 System.out.println(successmessage5);
					 
					 if(successmessage5.contains("Updated")) {
						 System.out.println("BusinessProfile Successfully Updated");
						 System.out.println("Test Passed:::::::::");
						 
					 }
					 else {
						 
						 System.out.println("BusinessProfile NotUpdated");
						 System.out.println("Test Failed");
					 
					 }
				 }
				
				 
				 
				 
				//Monthly sales (daily estimation - current month)
				 public static void sundaytomonday() throws Throwable {
					 
					 Excel f = new Excel("C:\\Users\\PC\\Desktop\\appium1\\EFCwebapp\\Excelsheet\\EFC.xlsx");
					    String data=f.getCellData1("Sales", 0, 0);
					    String data1=f.getCellData1("Sales", 0, 1);
						//System.out.println(data);
						//System.out.println(data1);
						 Thread.sleep(1000);
					
						driver.findElement(By.xpath("//formly-field[2]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-select[1]/div[1]/p-dropdown[1]/div[1]/label[1]")).click();
						Actions act = new Actions(driver);
						act.sendKeys(Keys.ARROW_DOWN);
						act.sendKeys(Keys.ENTER);
						act.build().perform();
						 Thread.sleep(1000);
						driver.findElement(By.xpath("//div[1]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[3]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-currency-field[1]/div[1]/div[2]/div[1]/input[1]")).clear();
						driver.findElement(By.xpath("//div[1]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[3]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-currency-field[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys(data1);
						 Thread.sleep(1000);
						driver.findElement(By.xpath("//div[1]/div[1]/form[1]/formly-form[1]/div[1]/button[2]")).click();
			
					 
				 }
			
				      //Monthly sales records
					 public static  void salesmonthlycode() throws Throwable {
							Excel f = new Excel("C:\\Users\\PC\\Desktop\\appium1\\EFCwebapp\\Excelsheet\\EFC.xlsx");
						    String data=f.getCellData1("Sales", 0, 0);
						    String data1=f.getCellData1("Sales", 0, 1);
							//System.out.println(data);
							//System.out.println(data1);
							//Thread.sleep(10000);
							driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[2]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-currency-field[1]/div[1]/div[2]/div[1]/input[1]")).clear();
							 Thread.sleep(1000);
							driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[2]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-currency-field[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys(data1);
							 Thread.sleep(1000);
							driver.findElement(By.xpath("//div[1]/div[1]/form[1]/formly-form[1]/div[1]/button[2]")).click();
						
							
						}
					 
	/*
	 * //Monthly sales last week estimation public static void salesdays() { Actions
	 * act1 = new Actions(driver); act1.moveToElement(editbtn); act1.click();
	 * act1.build().perform();
	 * 
	 * salesmonthlycode();
	 * 
	 * 
	 * }
	 */
				 
				 
			public static void Sales() throws Throwable {
				commonFields();
				  Thread.sleep(2000);
				//driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/span[2]/a[1]")).click();
				Thread.sleep(7000);
				System.out.println("user in sales form");
				((JavascriptExecutor)driver).executeScript("window.scrollTo(document.body.scrollHeight,0)");
		     	 Thread.sleep(10000);
				
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[1]/td[4]/a[1]")).click();
		sundaytomonday();

		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[2]/td[4]/a[1]")).click();
		sundaytomonday();

		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[3]/td[4]/a[1]")).click();
		sundaytomonday();

		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[4]/td[4]/a[1]")).click();
		sundaytomonday();
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[5]/td[4]/a[1]")).click();
		sundaytomonday();

		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[6]/td[4]/a[1]")).click();
		sundaytomonday();

		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[7]/td[4]/a[1]")).click();
		sundaytomonday();

		((JavascriptExecutor) driver).executeScript("window.scrollBy(200,500)");

		// Thread.sleep(5000);
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[1]/td[3]/a[1]")).click();
		Thread.sleep(2000);

		salesmonthlycode();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[2]/td[3]/a[1]")).click();
		 Thread.sleep(2000);

		salesmonthlycode();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[3]/td[3]/a[1]")).click();
		Thread.sleep(2000);

		salesmonthlycode();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[4]/td[3]/a[1]")).click();
		Thread.sleep(2000);

		salesmonthlycode();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[5]/td[3]/a[1]")).click();
		Thread.sleep(2000);

		salesmonthlycode();

		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[6]/td[3]/a[1]")).click();
		Thread.sleep(2000);

		salesmonthlycode();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[7]/td[3]/a[1]")).click();
		Thread.sleep(2000);

		salesmonthlycode();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[8]/td[3]/a[1]")).click();
		Thread.sleep(2000);

		salesmonthlycode();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[9]/td[3]/a[1]")).click();
		Thread.sleep(2000);

		salesmonthlycode();

		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[10]/td[3]/a[1]")).click();
		 Thread.sleep(2000);

		salesmonthlycode();

		 Thread.sleep(2000);
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[11]/td[3]/a[1]")).click();
		  Thread.sleep(2000);

		salesmonthlycode();

		 Thread.sleep(2000);
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[12]/td[3]/a[1]")).click();
		Thread.sleep(2000);

		salesmonthlycode();
		System.out.println("compled");
		Thread.sleep(7000);

		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(200,400)");
		System.out.println("moved down");
     
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[7]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-table-field[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]"))
				.click();
		salesmonthlycode();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[7]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-table-field[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/a[1]"))
				.click();
		salesmonthlycode();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[7]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-table-field[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/a[1]"))
				.click();
		salesmonthlycode();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[7]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-table-field[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[3]/a[1]"))
				.click();
		salesmonthlycode();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[7]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-table-field[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[3]/a[1]"))
				.click();
		salesmonthlycode();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[7]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-table-field[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[3]/a[1]"))
				.click();
		salesmonthlycode();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[7]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-table-field[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[7]/td[3]/a[1]"))
				.click();
		salesmonthlycode();
		jse1.executeScript("window.scrollBy(200,400)");
		
	     Thread.sleep(3000);
		driver.findElement(By.xpath("//zc-table-field[1]/div[1]/div[1]/button[1]")).click();
		
		Excel f = new Excel("C:\\Users\\PC\\Desktop\\appium1\\EFCwebapp\\Excelsheet\\EFC.xlsx");
	   
	
	int  rowcount1  =	f.rowCount("Sales");
	System.out.println(rowcount1);

		String input = f.getCellData1("Sales", 0, 2);
		String input1 = f.getCellData1("Sales", 1, 2);
		String input2 = f.getCellData1("Sales", 2, 2);
		System.out.println(input);
	
		WebElement web =driver.findElement(By.xpath("//formly-form[1]/formly-field[1]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-input[1]/div[1]/input[1]"));
	    web.clear();
		web.sendKeys(input);
		
		WebElement web1 =driver.findElement(By.xpath("//div[1]/div[1]/form[1]/formly-form[1]/formly-field[2]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-field-input[1]/div[1]/input[1]"));
		web1.clear();
		web1.sendKeys(input1);
		WebElement web2 = driver.findElement(By.xpath("//div[1]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[3]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-currency-field[1]/div[1]/div[2]/div[1]/input[1]"));
		web2.clear();
		web2.sendKeys(input2);
		 WebElement web3 =driver.findElement(By.xpath("//div[1]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/formly-field[5]/zc-wrapper-label[1]/zc-wrapper-fieldset[1]/div[1]/zc-wrapper-validation-messages[1]/zc-currency-field[1]/div[1]/div[2]/div[1]/input[1]"));
		web3.clear();
		web3.sendKeys(input2);
		driver.findElement(By.xpath("//div[1]/div[1]/div[2]/zc-widget-form[1]/div[1]/div[1]/div[1]/form[1]/formly-form[1]/div[1]/button[2]")).click();
		jse1.executeScript("window.scrollBy(200,250)");
		
		String input4 = f.getCellData1("Sales", 0, 3);
		String input5 = f.getCellData1("Sales", 1, 3);
		WebElement w = driver.findElement(By.id("other_total_margin_sales"));
		w.clear();
		w.sendKeys(input4);
		WebElement w1 =driver.findElement(By.id("other_total_margin_purchases"));
		w1.clear();
		w1.sendKeys(input4);
		WebElement w2 =driver.findElement(By.id("other_total_profit_margin"));
		w2.clear();
		w2.sendKeys(input4);
		WebElement w3 =	driver.findElement(By.id("other_total_margin"));
		w3.clear();
		w3.sendKeys(input5);
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
		
		String successmessage6 = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("toast-container"))).getText();
		 System.out.println(successmessage6);
		 
		 if(successmessage6.contains("Updated")) {
			 System.out.println("BusinessProfile Successfully Updated");
			 System.out.println("Test Passed:::::::::");
			 
		 }
		 else {
			 
			String data0= driver.findElement(By.id("formly_2_currency_monthly_purchases_total_1-message")).getText();
		
			 System.out.println("BusinessProfile NotUpdated");
			 System.out.println("Test Failed  "+data0);
		 
		 }
		
		
		
	 }
			
			public static void Purchases() throws Throwable {
				
				
				commonFields();
				driver.findElement(By.xpath("//div[2]/ul[1]/li[2]/ul[1]/li[4]/div[1]/span[2]")).click();
				Excel f = new Excel("C:\\Users\\PC\\Desktop\\appium1\\EFCwebapp\\Excelsheet\\EFC.xlsx");
			    String a=f.getCellData1("Sales", 0, 4);
			    String b=f.getCellData1("Sales", 1, 4);
			    String c=f.getCellData1("Sales", 2, 4);
			    String d=f.getCellData1("Sales", 3, 4);
			    String e = f.getCellData1("sales", 0, 5);
			    String g = f.getCellData1("sales", 1, 5);
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//driver.findElement(By.xpath("//div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/span[2]/a[1]")).click();
				
			//Thread.sleep(2000);
				driver.findElement(By.xpath("//zc-table-field[1]/div[1]/div[1]/button[1]")).click();
				//Thread.sleep(1000);
		WebElement wb = driver.findElement(By.id("supplier"));
		wb.clear();
		wb.sendKeys(a);
		//Thread.sleep(1000);
		WebElement wb1 = driver.findElement(By.id("frequency"));
		wb1.clear();
		wb1.sendKeys(b);
		//Thread.sleep(1000);
		WebElement wb2 = driver.findElement(By.id("amount"));
		wb2.clear();
		wb2.sendKeys(c);
		//Thread.sleep(1000);
		WebElement wb3 = driver.findElement(By.id("credit_cash"));
		wb3.clear();
		wb3.sendKeys(d);
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//div[1]/div[1]/form[1]/formly-form[1]/div[1]/button[2]")).click();
				Thread.sleep(7000);
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("window.scrollBy(200,410)");
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[1]/td[3]/a[1]")).click();
		//Thread.sleep(2000);

		salesmonthlycode();

		//Thread.sleep(2000);
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[2]/td[3]/a[1]")).click();
		 //Thread.sleep(2000);

		salesmonthlycode();

		//Thread.sleep(2000);
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[3]/td[3]/a[1]")).click();
		//Thread.sleep(2000);

		salesmonthlycode();

		//Thread.sleep(2000);
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[4]/td[3]/a[1]")).click();
		//Thread.sleep(2000);

		salesmonthlycode();

		//Thread.sleep(1000);
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[5]/td[3]/a[1]")).click();
		//Thread.sleep(1000);

		salesmonthlycode();

		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[6]/td[3]/a[1]")).click();
		//Thread.sleep(1000);

		salesmonthlycode();

		//Thread.sleep(1000);
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[7]/td[3]/a[1]")).click();
		//Thread.sleep(1000);

		salesmonthlycode();

		//Thread.sleep(1000);
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[8]/td[3]/a[1]")).click();
		//Thread.sleep(1000);

		salesmonthlycode();

		//Thread.sleep(1000);
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[9]/td[3]/a[1]")).click();
		//Thread.sleep(1000);

		salesmonthlycode();

		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[10]/td[3]/a[1]")).click();
		//Thread.sleep(1000);

		salesmonthlycode();

	
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[11]/td[3]/a[1]")).click();
		//Thread.sleep(1000);

		salesmonthlycode();

		//Thread.sleep(1000);
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[12]/td[3]/a[1]")).click();
		salesmonthlycode();
		//Thread.sleep(1000);
	
	WebElement input=	driver.findElement(By.xpath("//zc-formly-field-date[1]/p-calendar[1]/span[1]/input[1]"));
	input.clear();
	input.sendKeys(e);
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[8]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")).click();
	WebElement input1 =driver.findElement(By.id("amount_last_purchase"));
	input1.clear();
	input1.sendKeys(g);
	driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[1]/button[1]")).click();
	

	String successmessage7 = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("toast-container"))).getText();
	 System.out.println(successmessage7);
	 
	
	 if(successmessage7.contains("Updated")) {
		 System.out.println("BusinessProfile Successfully Updated");
		 System.out.println("Test Passed:::::::::");
		 
	 }
	 else {
		 
		String data1= driver.findElement(By.id("formly_2_currency_monthly_purchases_total_1-message")).getText();
	
		 System.out.println("BusinessProfile NotUpdated");
		 System.out.println("Test Failed  "+data1);
	 
	 }
	
			}
			
			public static void Operationexpenses() throws Throwable {
				
				commonFields();
				Waits();
				driver.findElement(By.xpath("//ul[1]/li[2]/ul[1]/li[5]/div[1]/span[2]")).click();
				//Rightarrow();
				Excel excel = new Excel("C:\\Users\\PC\\Desktop\\appium1\\EFCwebapp\\Excelsheet\\EFC.xlsx");
				
				for(int i=0;i<excel.rowCount("Sales");i++) {
				String op=	excel.getCellData1("Sales", i, 6);
				
			WebElement  wb=	driver.findElement(By.id("operation_exp@facilities_rent"));
			wb.clear();
			wb.sendKeys(op);
			WebElement  wb1=	driver.findElement(By.id("operation_exp@facil_maint_repair"));
			wb1.clear();
			wb1.sendKeys(op);
			WebElement  wb2=	driver.findElement(By.id("operation_exp@facilities_others"));
			wb2.clear();
			wb2.sendKeys(op);
			WebElement  wb3=	driver.findElement(By.id("operation_exp@trans_staff_transport"));
			wb3.clear();
			wb3.sendKeys(op);
			WebElement  wb4=	driver.findElement(By.id("operation_exp@transport_material_transport"));
			wb4.clear();
			wb4.sendKeys(op);
			WebElement  wb5=	driver.findElement(By.id("operation_exp@transport_fuel"));
			wb5.clear();
			wb5.sendKeys(op);
			WebElement  wb6=	driver.findElement(By.id("operation_exp@emp_permant_emp"));
			wb6.clear();
			wb6.sendKeys(op);
			WebElement  wb7=	driver.findElement(By.id("operation_exp@empl_temp_emp"));
			wb7.clear();
			wb7.sendKeys(op);
					
			WebElement  wb8=	driver.findElement(By.id("operation_exp@comments_on_emp"));
			wb8.clear();
			wb8.sendKeys("good");
				
				
					
					
				}
			
				
				
				
				
				
				
				
			}

		
	}
				
				
			
				 
			 
		

	
		
	


