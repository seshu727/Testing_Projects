package com.Efc.Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listerners_Test  extends Get_screenshots implements ITestListener{
	

	@Override
	public void onFinish(ITestContext arg0) {

	}

	@Override
	public void onStart(ITestContext arg0) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		try {
			takeScreen();
		} catch (Throwable e) {
			e.printStackTrace();
	}
	}
	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		
	}
}
