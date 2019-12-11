package Testingdemo;
import java.io.FileInputStream;
import java.util.Properties;

public class Propertiesdata1 {	
	public static   String getkeyvalue(String key) throws Throwable{
		Properties po = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PC\\git\\repository5\\DemoProject\\DataEfc\\E.properties");
		po.load(fis);
		return po.getProperty(key);
		
	}

}

				
							

		






