/*package com.sepm.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

import com.google.common.collect.Iterators;

public class ExcelReadUtil {
	
	String name;
	String address;
	Iterator rows;
	HSSFSheet sheet;
	public void getRows() {
		InputStream ExcelFileToRead;
		try {
			ExcelFileToRead = new FileInputStream("C:\\Users\\SESA430059\\eclipse-workspace\\OCP-Demo\\src\\main\\resources\\excelFile\\ExportExcel.xls");
			HSSFWorkbook wb = new HSSFWorkbook(ExcelFileToRead);
			sheet=wb.getSheetAt(0);
			rows = sheet.rowIterator();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	 }
	 public void getName() {
		getRows();
		String cellName = "name";
		HSSFRow firstrow = sheet.getRow(0);
		int size = Iterators.size(firstrow.iterator());
		int cellIndex = -1;
		for(int i=0;i<size;i++) {
			cellIndex++;
			if(cellName.equalsIgnoreCase(firstrow.getCell(i).getStringCellValue())) {
				break;
			} 
		}
		int noOfRows = Iterators.size(rows);
		for(int i=1;i<noOfRows;i++) {
			HSSFCell cell = sheet.getRow(i).getCell(cellIndex);
			System.out.println(getCellValue(cell));
		}
	}
	public void getAddress() {
		getRows();
		String cellName = "address";
		HSSFRow firstrow = sheet.getRow(0);
		int size = Iterators.size(firstrow.iterator());
		int cellIndex = -1;
		for(int i=0;i<size;i++) {
			cellIndex++;
			if(cellName.equalsIgnoreCase(firstrow.getCell(i).getStringCellValue())) {
				break;
			} 
		}
		int noOfRows = Iterators.size(rows);
		for(int i=1;i<noOfRows;i++) {
			HSSFCell cell = sheet.getRow(i).getCell(cellIndex);
			System.out.println(getCellValue(cell));
		}
	}
	
	public void getsesaid() {
		getRows();
		String cellName = "sesaid";
		HSSFRow firstrow = sheet.getRow(0);
		int size = Iterators.size(firstrow.iterator());
		int cellIndex = -1;
		for(int i=0;i<size;i++) {
			cellIndex++;
			if(cellName.equalsIgnoreCase(firstrow.getCell(i).getStringCellValue())) {
				break;
			} 
		}
		int noOfRows = Iterators.size(rows);
		for(int i=1;i<noOfRows;i++) {
			HSSFCell cell = sheet.getRow(i).getCell(cellIndex);
			System.out.println(getCellValue(cell));
		}
	}
	
	private String getCellValue(HSSFCell cell) {
		switch (cell.getCellType()) {
	        case HSSFCell.CELL_TYPE_STRING:
	            return cell.getRichStringCellValue().getString();
	        case HSSFCell.CELL_TYPE_NUMERIC:
	        	return Double.toString(cell.getNumericCellValue());
	        case HSSFCell.CELL_TYPE_BOOLEAN:
	        	return Boolean.toString(cell.getBooleanCellValue());
	        case HSSFCell.CELL_TYPE_FORMULA:
	        	return cell.getCellFormula();
	        default:
	        	return "";
	    }
	}
}
*/