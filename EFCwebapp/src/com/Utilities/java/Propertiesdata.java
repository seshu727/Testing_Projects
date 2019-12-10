package com.Utilities.java;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertiesdata {
	
		public static   String getkeyvalue(String key) throws Throwable{
			Properties po = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\PC\\git\\repository5\\EFCwebapp\\Staicdata\\data1.properties");
			po.load(fis);
			return po.getProperty(key);
			
		}
		

	}



