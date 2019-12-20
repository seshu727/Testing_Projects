package com.Efc.Functionlib;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Efc.Browser.Open_closebrowser;
import com.Efc.Utilities.Get_excel_data;
import com.Efc.Utilities.Get_property_data;
import com.Efc.Utilities.Listerners_Test;
@Listeners(Listerners_Test.class)
public class Testcases extends Open_closebrowser {
	 static Get_property_data p1;
	 static common_fun_lib co;
	

	@SuppressWarnings("static-access")
	@Test(priority = 0)
	public static void Login() throws Throwable {
		co.implicitWait1(driver);
		System.out.println("Application started");
		co.sendingData(driver, "xpath", p1.getkeyvalue("userid"), p1.getkeyvalue("username"));
		co.sendingData(driver, "xpath", p1.getkeyvalue("passwordid"),p1.getkeyvalue("password"));
	    co.clickonButton(driver, "xpath", p1.getkeyvalue("loginbtnid")); 
			    String actualUrl="http://efcdev.firstaccess.co/#/loan/dashboard/dashboard";
			    co.staticwait(driver);
		        String expectedUrl= driver.getCurrentUrl();
		        System.out.println(expectedUrl); 
		     if(actualUrl.equalsIgnoreCase(expectedUrl)) {
		    	 System.out.println("Test Passed");
		     }
		     else {
		    	 co.toastMessages();
		    	 System.out.println("Test Failed");
		     }}
		       
			 @SuppressWarnings("static-access")
			 @Test(priority = 1)
			 public static void clientCreation() throws Throwable {
				
					 navigatesToclientcreation();
		/*
		 * co.implicitWait1(driver); System.out.println("Client creation started");
		 * co.sendingData(driver, "id",
		 * p1.getkeyvalue("clientnameid"),p1.getkeyvalue("clientnamevalue"));
		 * co.sendingData(driver, "id",
		 * p1.getkeyvalue("clientnumberid"),p1.getkeyvalue("clientnumbervalue"));
		 * co.clickonButton(driver, "xpath", p1.getkeyvalue("repeatid"));
		 * co.clickonButton(driver, "id", p1.getkeyvalue("clientTypeid")); keyActions();
		 * co.clickonButton(driver, "id", p1.getkeyvalue("typeofid")); keyActions();
		 * co.sendingData(driver, "id", p1.getkeyvalue("numberid"),
		 * p1.getkeyvalue("numbervalue")); //co.clickonButton(driver, "xpath",
		 * p1.getkeyvalue("documentid")); //System.out.println("note1"); //uploading
		 * file //co.fileUpload(); co.sendingData(driver, "id",
		 * p1.getkeyvalue("efchearid"), p1.getkeyvalue("efchearvalue"));
		 * scrollpagedown(); //male co.clickonButton(driver,
		 * "xpath",p1.getkeyvalue("gendermaleid")); //female //co.clickonButton(driver,
		 * "xpath",p1.getkeyvalue("genderfemaleid")); co.clickonButton(driver,"xpath",
		 * p1.getkeyvalue("maritalstatusid")); co.sendingData(driver, "xpath",
		 * p1.getkeyvalue("dobid"),p1.getkeyvalue("dobvalue")); co.clickonButton(driver,
		 * "LinkText", p1.getkeyvalue("dobdateid")); co.sendingData(driver, "id",
		 * p1.getkeyvalue("placeofbirthid"), p1.getkeyvalue("placeofbirthvalue"));
		 * co.sendingData(driver, "id", p1.getkeyvalue("clientaddressid"),
		 * p1.getkeyvalue("clientaddressvalue")); co.sendingData(driver, "id",
		 * p1.getkeyvalue("emailid"), p1.getkeyvalue("emailvalue"));
		 * co.sendingData(driver, "id", p1.getkeyvalue("phoneid1"),
		 * p1.getkeyvalue("phoneidvalue1")); co.sendingData(driver, "id",
		 * p1.getkeyvalue("phoneid2"), p1.getkeyvalue("phoneidvalue2"));
		 * co.clickonButton(driver, "css", p1.getkeyvalue("submitbtnid"));
		 */
					List<WebElement> rows = driver.findElements(By.tagName("tr"));
				    System.out.println(rows.size());
				    for(int i=1;i<rows.size();i++){
				    	 String row=rows.get(i).getText();
				    	 System.out.println(row);
				    	 List<WebElement> col = driver.findElements(By.tagName("td"));
				      	 //System.out.println(col.size());
				      	
				    	 for(int j=1;j<col.size();j++){
				    		 String cols =col.get(j).getText();
				 	    	System.out.println(cols);
				    	 
						
				    	   if(cols.equalsIgnoreCase(p1.getkeyvalue("nameinifcondition"))) {
				    		   System.out.println(p1.getkeyvalue("nameinifcondi tion"));
				    		   System.out.println("Client creation success");
				    		   System.out.println("Test passed:::::::::::");
				    		   
				    		   
				    	   }else {
				    		   System.out.println("Client creation failed");
				    		   System.out.println("Test failed");
				    	   }
			 }
		     }
			 }
			 
			    @SuppressWarnings("static-access")
		     	public static void navigatesTonewAppraisal() throws Throwable {
				
				co.clickonButton(driver, "xpath", (p1.getkeyvalue("menuid")));
				co.clickonButton(driver, "xpath", (p1.getkeyvalue("appraisalid")));
				co.clickonButton(driver, "xpath", (p1.getkeyvalue("Appraisalbtnid")));	
			}
			 
			 public static void keyActions() {
					Actions act = new Actions(driver);
			        act.sendKeys(Keys.ARROW_DOWN);
			        act.sendKeys(Keys.ENTER);
			        act.build().perform();
				}
				public static void scrollpagedown() {
					JavascriptExecutor jse1 = (JavascriptExecutor) driver;
					jse1.executeScript("window.scrollBy(300,600)");
				}
				
				   @SuppressWarnings("static-access")
				   public static void navigatesToclientcreation() throws Throwable {
			        //this method is to click on element
					co.clickonButton(driver, "xpath", (p1.getkeyvalue("menuid")));
					co.clickonButton(driver, "xpath", (p1.getkeyvalue("clientid")));
					//co.clickonButton(driver, "xpath", (p1.getkeyvalue("Addclientbtnid")));	
				}
				
					 	
			 public static void  womenLoan() throws Throwable {
			
				 System.out.println("New appraisal creation started");
				 
				Thread.sleep(10000);
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
			

				Thread.sleep(1000);
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
				 
					 Thread.sleep(10000);
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
				 Thread.sleep(6000);
				 
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
					
				 Thread.sleep(1000);
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
			   
				
				 Thread.sleep(6000);
				 driver.findElement(By.id("business_information_no_of_yrs_in_bus")).clear();
				driver.findElement(By.id("business_information_no_of_yrs_in_bus")).sendKeys("12");		
				 Thread.sleep(2000);
				driver.findElement(By.xpath("//div[1]/form[1]/formly-form[1]/div[1]/button[2]")).click();
				 
				 
			 }
			 
			 public static void clientInfoandbusiness() throws InterruptedException {
				 Thread.sleep(6000);
				 System.out.println("user in client info form");
			
				 driver.findElement(By.xpath("//div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
				 Thread.sleep(3000);
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
				 Thread.sleep(4000);
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
				   Thread.sleep(4000);
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
				 
				 driver.findElement(By.xpath("//input[@type='button']")).click();
				 Thread.sleep(7000);
					
				// driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/button[2]")).click();

				// driver.findElement(By.xpath("//button[@class='btn btn-success ng-star-inserted']")).click();
				 Thread.sleep(4000);
				 System.out.println("security");
				// driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/zc-stage-view[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[3]/a[1]")).click();
                 driver.findElement(By.xpath("//div[@class='main-content']//li[3]//a[1]")).click();
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
                 Thread.sleep(1000);
                
			 }
			 public static  void commonFields() throws InterruptedException {
	
				 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[1]/a[1]")).click(); 
				 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[2]/app-com-render[1]/div[1]/app-side-menu[1]/ul[1]/li[2]/a[1]/span[1]")).click(); 
				 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-data-list[1]/div[1]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/span[1]/span[1]")).click(); 
				 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-page-layout[1]/div[2]/div[3]/div[1]/app-page[1]/div[1]/zc-page-render[1]/zc-block-tree-node[1]/zc-block-tree-node[1]/app-com-render[1]/div[1]/zc-widget-stage-form[1]/zc-stage-form[1]/div[2]/div[1]")).click(); 
						  //driver.findElement(By.xpath("//div[2]/ul[1]/li[2]/ul[1]/li[3]/div[1]/span[2]")).click();
						  
			 }
			 
			 public static void entrepreneurinfo() throws Throwable {
			
				 
		          commonFields();
		 
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
						
						co.fileUpload();
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
			
					 Get_excel_data f = new Get_excel_data("C:\\Users\\PC\\Desktop\\appium1\\EFCwebapp\\Excelsheet\\EFC.xlsx");
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
			
							Get_excel_data f = new Get_excel_data("C:\\Users\\PC\\Desktop\\appium1\\EFCwebapp\\Excelsheet\\EFC.xlsx");
						    String data=f.getCellData1("Sales", 0, 0);
						    String data1=f.getCellData1("Sales", 0, 1);
							//System.out.println(data);
							//System.out.println(data1);
							////Thread.sleep(10000);
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

		Thread.sleep(1000);
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
		//Thread.sleep(7000);

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
		
		Get_excel_data f = new Get_excel_data("C:\\Users\\PC\\Desktop\\appium1\\EFCwebapp\\Excelsheet\\EFC.xlsx");
	   
	
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
				  
				
			//	commonFields();
				driver.findElement(By.xpath("//div[2]/ul[1]/li[2]/ul[1]/li[4]/div[1]/span[2]")).click();
				Get_excel_data f = new Get_excel_data("C:\\Users\\PC\\Desktop\\appium1\\EFCwebapp\\Excelsheet\\EFC.xlsx");
			    String a=f.getCellData1("Sales", 0, 4);
			    String b=f.getCellData1("Sales", 1, 4);
			    String c=f.getCellData1("Sales", 2, 4);
			    String d=f.getCellData1("Sales", 3, 4);
			    String e = f.getCellData1("sales", 0, 5);
			    String g = f.getCellData1("sales", 1, 5);
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//driver.findElement(By.xpath("//div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/span[2]/a[1]")).click();
				
			Thread.sleep(2000);
				driver.findElement(By.xpath("//zc-table-field[1]/div[1]/div[1]/button[1]")).click();
				Thread.sleep(1000);
		WebElement wb = driver.findElement(By.id("supplier"));
		wb.clear();
		wb.sendKeys(a);
		Thread.sleep(1000);
		WebElement wb1 = driver.findElement(By.id("frequency"));
		wb1.clear();
		wb1.sendKeys(b);
		Thread.sleep(1000);
		WebElement wb2 = driver.findElement(By.id("amount"));
		wb2.clear();
		wb2.sendKeys(c);
		Thread.sleep(1000);
		WebElement wb3 = driver.findElement(By.id("credit_cash"));
		wb3.clear();
		wb3.sendKeys(d);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[1]/div[1]/form[1]/formly-form[1]/div[1]/button[2]")).click();
				//Thread.sleep(7000);
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("window.scrollBy(200,410)");
		Thread.sleep(7000);
		
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

		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[5]/td[3]/a[1]")).click();
		Thread.sleep(1000);

		salesmonthlycode();

		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[6]/td[3]/a[1]")).click();
		Thread.sleep(1000);

		salesmonthlycode();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[7]/td[3]/a[1]")).click();
		Thread.sleep(1000);

		salesmonthlycode();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[8]/td[3]/a[1]")).click();
		Thread.sleep(1000);

		salesmonthlycode();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[9]/td[3]/a[1]")).click();
		Thread.sleep(1000);

		salesmonthlycode();

		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[10]/td[3]/a[1]")).click();
		Thread.sleep(1000);

		salesmonthlycode();

	
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[11]/td[3]/a[1]")).click();
		Thread.sleep(1000);

		salesmonthlycode();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[1]/tbody[1]/tr[12]/td[3]/a[1]")).click();
		salesmonthlycode();
		Thread.sleep(1000);
	
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
				
				//commonFields();
				  
				driver.findElement(By.xpath("//ul[1]/li[2]/ul[1]/li[5]/div[1]/span[2]")).click();
				//Rightarrow();
				Get_excel_data excel = new Get_excel_data("C:\\Users\\PC\\Desktop\\appium1\\EFCwebapp\\Excelsheet\\EFC.xlsx");
				
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
				
				
			
				 
			 
		

	
		
	


