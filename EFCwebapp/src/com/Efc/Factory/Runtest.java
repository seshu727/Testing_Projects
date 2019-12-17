package com.Efc.Factory;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Efc.Functionlib.Testcases;
import com.Efc.Utilities.Listerners_Test;
@Listeners(Listerners_Test.class)
public class Runtest extends Testcases {
	@Test
	public static void AppTesting() throws Throwable {
		Login();
		//navigatesToclientcreation();
		//navigatesTonewAppraisal();
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
