package Testingdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class TestApp extends Commonfunctions {
	
    
	@SuppressWarnings("static-access")
	@Test
	public void Login() throws Throwable {

	Propertiesdata1 p = new Propertiesdata1();
		
		startBrowser();
		// waitforelement
		implicitWait1(driver);
		urlHitting(p.getkeyvalue("URL"));
		//This method will used as sendkeys
		sendingData(driver, "id", p.getkeyvalue("userid"), p.getkeyvalue("username"));
		sendingData(driver, "id", p.getkeyvalue("passwordid"), p.getkeyvalue("password"));
		//This method will used as click method
		clickonButton(driver, "id", p.getkeyvalue("loginid"));
		String atualresult = "https://v3demo.zeroco.de/#/zcbase/account/app-selection";
		staticwait(driver);
		String expectedresult = driver.getCurrentUrl();

	  if(atualresult.equalsIgnoreCase(expectedresult)) {
		  System.out.println("Test Passed   "+expectedresult);
	  }
	  else {
     toastMessages();
		  System.out.println("Test Failed");  
	  }
	
		//clicking on demo
		clickonButton(driver, "id", p.getkeyvalue("demoid"));
		for(int i=1;i<=1;i++) {
		sendingData(driver, "id", p.getkeyvalue("textboxid"), p.getkeyvalue("textboxvalue"));
		sendingData(driver, "id", p.getkeyvalue("textboxemailid"), p.getkeyvalue("textboxemailvalue"));
		System.out.println(p.getkeyvalue("textboxemailvalue"));
		clickonButton(driver, "id", p.getkeyvalue("savebtnid"));
		staticwait(driver);
		toastMessages();
		staticwait(driver);
			/*
			 * WebElement
			 * table=driver.findElement(By.xpath("//table[@class='table-view']"));
			 * List<WebElement>rows=table.findElements(By.tagName(p.getkeyvalue("tablerow"))
			 * ); System.out.println("no of rows are::"+rows.size());
			 * List<WebElement>cols=rows.get(1).findElements(By.tagName(p.getkeyvalue(
			 * "tablecolumn"))); System.out.println("no of columns are::"+cols.size());
			 * String dataoftable =cols.get(0).getText(); System.out.println(dataoftable);
			 */
		staticwait(driver);
		clearingData(driver, "id",  p.getkeyvalue("textboxid"));
		clearingData(driver, "id",  p.getkeyvalue("textboxemailid"));
		clickonButton(driver, "id", p.getkeyvalue("savebtnid"));
	
		staticwait(driver);
		alertsHandle();
		staticwait(driver);
		
		String withid=	driver.findElement((By.id("field-error-field_3611"))).getText();
		System.out.println(withid);
	    String with=	driver.findElement(By.id(p.getkeyvalue("errormessagefortextbox"))).getText();
	    System.out.println(with);
	    System.out.println(":..:"+p.getkeyvalue("errormessagefortextbox")+":..:");
		
	
		
		}
		}
}
	  
	
	
		
		
		
	
    /*
	 * staticwait(driver); clickonButton(driver, "id", p.getkeyvalue("resetbtnid"));
	 * staticwait(driver); Actions act = new Actions(driver);
	 * act.sendKeys(Keys.ENTER); act.build().perform();
	 */
	 
	/*
	 * clearingData(driver, "id", p.getkeyvalue("textboxid")); clearingData(driver,
	 * "id", p.getkeyvalue("textboxemailid")); clickonButton(driver, "id",
	 * p.getkeyvalue("savebtnid")); explicitwait(driver, "id",
	 * p.getkeyvalue("savebtnid"), p.getkeyvalue("explicitwaits")); alertsHandle();
	 */




	


