package com.Vtiger.repo;



	
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	public class PropertiesFiles 
	{
		public static String readDatafrompropertyfile(String key) throws IOException {
			FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Desktop\\testyantra\\TYSS_Manu\\browser.Properties");

			Properties prop = new Properties();
			prop.load(fis);

			return	prop.getProperty(key);

		}

		public CharSequence readDatafrompropertyfi(String string) {
			// TODO Auto-generated method stub
			return null;
		}
	}