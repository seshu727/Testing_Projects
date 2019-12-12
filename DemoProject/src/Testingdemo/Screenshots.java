package Testingdemo;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshots extends Commonfunctions {
public  void takeScreenshot() throws Throwable {
		
		SimpleDateFormat date = new SimpleDateFormat("dd_yy_mm hh_ss_mm");
		Date d = new Date();
		String d1= date.format(d)	;	
	         File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       	FileUtils.copyFile(file, new File("./screenshotss/screen+"+d1+".png"));
	 	
}

}
