package excelutility_new;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import baseliberary.Baseliberary;

public class Excel_Utility extends Baseliberary {
	
	public String excelutility(String path, int rownum ,int columnum)
	{
		String value="";
		try {
			FileInputStream fis=new FileInputStream(path);
			XSSFWorkbook wb=new XSSFWorkbook();
			XSSFSheet sheet=wb.getSheetAt(0);
			value=sheet.getRow(rownum).getCell(columnum).getStringCellValue();
//			value=sheet.getRow(rownum).getCell(columnum).getNumericCellValue();
		} catch (Exception e) {
			System.out.println("Issue in get read data from excel sheet "+e);
		}
		return value;
	}
	public int rowcount(String path) {
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
	
	// 

}
