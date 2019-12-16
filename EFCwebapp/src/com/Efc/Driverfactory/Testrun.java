package com.Efc.Driverfactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.Efc.Functionlib.Testcases;
import com.Efc.Utilities.Listeners1;
@Listeners(Listeners1.class)
public class Testrun extends Testcases {
	@Test
	public static void AppTesting() throws Throwable {
		Login();
		navigatesToclientcreation();
		clientCreation();
		//womenLoan();
		//smeLoan();
		//homeLoan();
		//clientInfoandbusiness();
		//loanApp();
		//Security();
		//entrepreneurinfo();
	    // businessProfile();
		//Sales();
		//Purchases();
		//Operationexpenses();
		
	}
	
	

}
