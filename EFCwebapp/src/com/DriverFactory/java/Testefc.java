package com.DriverFactory.java;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Functionlib.java.Functions;
import com.Utilities.java.Excel;
import com.Utilities.java.Listeners1;
@Listeners(Listeners1.class)
public class Testefc extends Functions {
	 
	
	@Test
	public static void AppTest() throws Throwable {
		Login();
		//clientCreation();
		//womenLoan();
		//smeLoan();
		//homeLoan();
	   //clientInfoandbusiness();
		//loanApp();
		//Security();
		//entrepreneurinfo();
		//businessProfile();
		//Sales();
		//Purchases();
		Operationexpenses();
		
		
	}
	
	

}
