package com.Efc.Driverfactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Efc.Functionlib.Testcases;
import com.Efc.Utilities.Listeners1;
import com.Efc.commonlibs.Commonmethods;
@Listeners(Listeners1.class)
public class Testrun extends Commonmethods {
 static Testcases tc;

	@Test
	public static void AppTesting() throws Throwable {
		tc = new Testcases();
	    tc. Login();
	    tc.navigatesToclientcreation();
		tc.clientCreation();
		
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
