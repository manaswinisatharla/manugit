package com.Vtiger.generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelutilityTest {
	public String readDatafromExcel(String sheetname,int rownum,int cellnum) throws Throwable
	{
	FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\Desktop\\Sdet.xlsx");
	return WorkbookFactory.create(fis).getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	
	}
	
	public int readNumericDatafromExcel(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, InvalidFormatException, IOException  
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\Desktop\\Sdet.xlsx");
		int value=(int)WorkbookFactory.create(fis).getSheet(sheetname).getRow(rownum).getCell(cellnum).getNumericCellValue();
		return value;
	}
	public int getLastRow(String sheetname) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\Desktop\\Sdet.xlsx");
		int lastrow=WorkbookFactory.create(fis).getSheet(sheetname).getLastRowNum();
		return lastrow;
	}

	
	
		

}
