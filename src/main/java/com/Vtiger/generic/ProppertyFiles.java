package com.Vtiger.generic;



	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	public class ProppertyFiles 
	{
		public static  String readDatafrompropertyfile(String key) throws IOException {
			FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Desktop\\Sdt.Properties");

			Properties prop = new Properties();
			prop.load(fis);

			return	prop.getProperty(key);

		}
	}