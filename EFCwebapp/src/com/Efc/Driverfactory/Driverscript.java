package com.Efc.Driverfactory;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Efc.Functionlib.Testcases;
import com.Efc.Utilities.Listeners1;
import com.Efc.commonlibs.Commonmethods;
@Listeners(Listeners1.class)
public class Driverscript extends Testcases {


	 
	
	@SuppressWarnings("static-access")
	@Test
	public static void AppTest() throws Throwable {
		
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
