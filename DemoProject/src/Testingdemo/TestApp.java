package Testingdemo;



import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
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
		String atualresult = "http://v3demo.zeroco.de/#/zcbase/account/app-selection";
		staticwait(driver);
		String expectedresult = driver.getCurrentUrl();

	  if(atualresult.equalsIgnoreCase(expectedresult)) {
		  
		  System.out.println("Test Passed   "+expectedresult);
	  }
	  else {
     toastMessages();
		
		  System.out.println("Test Failed");  
	  }
		staticwait(driver);
		//clicking on demo
		clickonButton(driver, "id", p.getkeyvalue("demoid"));
		for(int i=1;i<=1;i++) {
		sendingData(driver, "id", p.getkeyvalue("textboxid"), p.getkeyvalue("textboxvalue"));
		sendingData(driver, "id", p.getkeyvalue("textboxemailid"), p.getkeyvalue("textboxemailvalue"));
		clickonButton(driver, "id", p.getkeyvalue("savebtnid"));
		staticwait(driver);
		toastMessages();
		staticwait(driver);
		clearingData(driver, "id",  p.getkeyvalue("textboxid"));
		clearingData(driver, "id",  p.getkeyvalue("textboxemailid"));
		clickonButton(driver, "id", p.getkeyvalue("savebtnid"));
		staticwait(driver);
		alertsHandle();
		staticwait(driver);
		textofElement(driver, "xpath", p.getkeyvalue("nulltextboxxpath"));
		
		
		
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

		}
		
	  
	
	
		
		
		
	
	




	

}
