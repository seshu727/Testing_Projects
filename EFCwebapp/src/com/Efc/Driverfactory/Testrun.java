package com.Efc.Driverfactory;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Efc.Functionlib.Commonfun;
import com.Efc.Functionlib.Functions;
import com.Efc.Utilities.Excel;
import com.Efc.Utilities.Listeners1;
@Listeners(Listeners1.class)
public class Testrun extends Functions {
	 
	
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
