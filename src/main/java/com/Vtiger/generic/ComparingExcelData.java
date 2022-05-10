package com.Vtiger.generic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class ComparingExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, Throwable {
	//	ArrayList<Integer>a1=new ArrayList<Integer>();
		ExcelutilityTest excelUtilitytest=new ExcelutilityTest();
	
		for (int i = 0; i <= excelUtilitytest.getLastRow("Sheet1"); i++)
		{
		int salary = excelUtilitytest.readNumericDatafromExcel("Sheet1", i, 1);
			
		if(salary>=15000) {
		System.out.println(	excelUtilitytest.readDatafromExcel("Sheet1", i, 0));
		}
		
		}
	}

}

