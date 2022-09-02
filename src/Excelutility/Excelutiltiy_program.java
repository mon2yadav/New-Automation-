package Excelutility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutiltiy_program {
	
	public String excelutility( int rownum, int columnum) {
		String path="\"C:\\Users\\Agio13\\AppData\\Local\\Kingsoft\\WPS Office\\\"";
		String value="";
		try {
			FileInputStream fis=new FileInputStream(path);
			XSSFWorkbook wb=new XSSFWorkbook();
			XSSFSheet sheet=wb.getSheetAt(0);
			value=sheet.getRow(rownum).getCell(columnum).getStringCellValue();
		} catch (Exception e) {
			System.out.println("Issue in get read data from excel sheet "+e);
		}
		return value;
	}
	public static int rowcount() {
		String path="\"C:\\Users\\Agio13\\AppData\\Local\\Kingsoft\\WPS Office\\\"";
		int lastrowCount=0;
		try {
			FileInputStream fis=new FileInputStream(path);
			XSSFWorkbook wb=new XSSFWorkbook();
			XSSFSheet sheet=wb.getSheetAt(0);
			lastrowCount=sheet.getLastRowNum();
		} catch (Exception e) {
		     System.out.println("Issue in get last row count from excel sheet "+e);
		}
		return lastrowCount;
	}

}
