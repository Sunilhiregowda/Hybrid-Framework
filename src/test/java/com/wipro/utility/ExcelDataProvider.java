package com.wipro.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	public XSSFWorkbook wb;
	
     public ExcelDataProvider() throws FileNotFoundException {
    	 
    	 File src = new File("C:\\Users\\Bhargav\\Documents\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\hybridFramework\\TestData\\TestData.xlsx");
    	 
    	 FileInputStream fis = new FileInputStream(src);
    	 
    	 wb= new XSSFWorkbook();
     }
     
     public String getStringData(String sheetName, int row, int column) {
    	 
    	return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
    	 
     }
     
     public String getStringData(int sheetIndex, int row, int column) {
    	 
     	return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
     	 
      }
     
     public double getNumericData(String sheetName, int row, int column) {
    	 
    	 return wb.getSheet("sheetName").getRow(row).getCell(column).getNumericCellValue();
    	 
     }

}
