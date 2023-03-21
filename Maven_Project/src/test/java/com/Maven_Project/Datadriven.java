package com.Maven_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {
	public static void particularData() throws IOException {
		
		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Maven_Project\\Excel\\Excel Datadriven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheet("sheet1");
		Row row = sheetAt.getRow(2);
		Cell cel = row.getCell(2);
		CellType cType = cel.getCellType();
		
		if (cType.equals(CellType.STRING)) {
			String StringCellValue = cel.getStringCellValue();
			System.out.println(StringCellValue);	
		}
		else if (cType.equals(CellType.NUMERIC)) {
			double numericCelValue = cel.getNumericCellValue();
			int value = (int) numericCelValue;
			System.out.println(value);
			
		}
	}
	
	public static void allData() throws IOException {
		
		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Maven_Project\\Excel\\Excel Datadriven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook worbk = new XSSFWorkbook(fis);
		Sheet sheetAt = worbk.getSheet("sheet1");
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell cel = row.getCell(j);
				
			CellType cType = cel.getCellType();	
			
			if (cType.equals(CellType.STRING)) {
				String StringCellValue = cel.getStringCellValue();
				System.out.println(StringCellValue);	
			}
			else if (cType.equals(CellType.NUMERIC)) {
				double numericCelValue = cel.getNumericCellValue();
				int value = (int) numericCelValue;
				System.out.println(value);
			}	
		}
	}
}

	public static void main(String[] args) throws IOException {
		allData();
		
	}
}
