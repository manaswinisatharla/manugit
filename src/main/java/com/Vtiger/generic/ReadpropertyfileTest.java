package com.Vtiger.generic;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadpropertyfileTest {
	
	public String readDatafrompropertyfile(String key) throws IOException {
	//	FileInputStream fis = new FileInputStream("D:\\Selenium\\TYSS_SAINADH2\\SDET_06.properties");
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Desktop\\testyantra\\TYSS_Manu\\Sdt.properties");

		Properties prop = new Properties();
		prop.load(fis);

		String value=	prop.getProperty(key);
		return value;

	}

	
}