package Testingdemo;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListernersHelper.class)
public class TestApp extends Commonfunctions {
	
    
	@SuppressWarnings("static-access")
	@Test
	public void Login() throws Throwable {

	Propertiesdata1 p = new Propertiesdata1();
		
		startBrowser();
		//waitforelement
		implicitWait1(driver);
		urlHitting(p.getkeyvalue("URL"));
		//This method will used as sendkeys
		sendingData(driver, "id", p.getkeyvalue("userid"), p.getkeyvalue("username"));
		sendingData(driver, "id", p.getkeyvalue("passwordid"), p.getkeyvalue("password"));
		//This method will used as click method
		clickonButton(driver, "id", p.getkeyvalue("loginid"));
		staticwait(driver);
		String atualUrl = p.getkeyvalue("Urlafterlogin");
		String expectedUrl =driver.getCurrentUrl();
		staticwait(driver);
	   if(atualUrl.equalsIgnoreCase(expectedUrl)) {
		  System.out.println("Login Test Passed:  "+expectedUrl);  
	  }
	  else {
		  toastMessages();
		  System.out.println("Login Test Failed: ");
	  }
		staticwait(driver);
		//clicking on demo
		clickonButton(driver, "id", p.getkeyvalue("demoid"));
		
		for(int i=1;i<=1;i++) {
		//entering valid data and clicking on save btn	
		sendingData(driver, "id", p.getkeyvalue("textboxid"), p.getkeyvalue("textboxvalue"));
		sendingData(driver, "id", p.getkeyvalue("textboxemailid"), p.getkeyvalue("textboxemailvalue"));
		clickonButton(driver, "id", p.getkeyvalue("savebtnid"));
		toastMessages();
		
		  WebElement table=driver.findElement(By.xpath(p.getkeyvalue("tablexpath")));
		  List<WebElement>rows=table.findElements(By.tagName(p.getkeyvalue("tablerow")));
		 //System.out.println("no of rows are::"+rows.size());
		  List<WebElement>cols=rows.get(1).findElements(By.tagName(p.getkeyvalue("tablecolumn")));
		 //System.out.println("no of columns are::"+cols.size());
		  for(int j=1;j<=cols.size();j++) {
			String dataoftable =cols.get(i).getText(); 
			 //System.out.println(dataoftable);	 
		  
		   if(dataoftable.equals(p.getkeyvalue("textboxemailvalue"))){
				  
				System.out.println("Test Passed: "+dataoftable);
				 break;
			  }
		   else if(dataoftable.equalsIgnoreCase(p.getkeyvalue("textboxemailvalue"))){
					  System.out.println("Test Passed : Data found in Table :"+dataoftable);
				  }
			  else {
				  System.out.println("Test Failed: Data Notfound in Table : ");
				  
			  }
		  }
		//data entering with Null clicking on save btn directly
		clickonButton(driver, "id", p.getkeyvalue("savebtnid"));
		staticwait(driver);
		//handling alert
		alertsHandle();
		staticwait(driver);
		//To  get text from particular element
		String textfoname =driver.findElement(By.id(p.getkeyvalue("errormessagefortextbox"))).getText();
		String textofemail =driver.findElement(By.id(p.getkeyvalue("errormessageforemail"))).getText();
	    System.out.println("Null data"+textfoname+" "+textofemail);
	    
	    if(textfoname.contains(p.getkeyvalue("Textboxerror"))) {
	    	System.out.println("Test passed:Text field with Null: "+textfoname);
	    }else {
	    	System.out.println("Test Failed:Text field with Null: ");
	    	
	    }
		clickonButton(driver, "id", p.getkeyvalue("resetbtnid"));
		staticwait(driver);
		clickonButton(driver, "id", p.getkeyvalue("resetpopupokbtn"));
		staticwait(driver);
		if(driver.findElement(By.id(p.getkeyvalue("resetbtnid"))).isDisplayed()) {
			System.out.println("Test Passed: for Reset Button:  ");
		}else {
			System.out.println("Test Failed: for Reset Button:  ");
		}
		
		sendingData(driver, "id", p.getkeyvalue("textboxid"), p.getkeyvalue("textboxvalue"));
		sendingData(driver, "id", p.getkeyvalue("textboxemailid"), p.getkeyvalue("textboxemailvalue"));
		clickonButton(driver, "id", p.getkeyvalue("savebtnid"));
		toastMessages(); 
		}	
}
}



		
		
		
				
		
		
		
	



	


