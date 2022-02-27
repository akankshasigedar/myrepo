package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	public WebDriver driver;
	public static FileInputStream fileread;
	public static XSSFWorkbook workbook;
	String path = "F:\\velocity-software testing\\Book2.xlsx";
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public int getRowCount(String sheetName) throws IOException {
		fileread=new FileInputStream(path);
		workbook=new XSSFWorkbook(fileread);
		sheet=workbook.getSheet(sheetName);
		int rowCount=sheet.getLastRowNum();
		workbook.close();
		fileread.close();
		return rowCount;
	}
	
	public int getCellCount(String sheetName, int rownum) throws IOException {
		fileread=new FileInputStream(path);
		workbook=new XSSFWorkbook(fileread);
		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rownum);
		int cellcount=row.getLastCellNum();
		workbook.close();
		fileread.close();
		return cellcount;
	}
	
	public String getCellData(String sheetName, int rownum, int colnum) throws IOException {
		fileread=new FileInputStream(path);
		workbook=new XSSFWorkbook(fileread);
		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		
		DataFormatter formatter=new DataFormatter();
		String data;
		try {
			data=formatter.formatCellValue(cell);
		}catch(Exception e)
		{
			data="";
		}
		workbook.close();
		fileread.close();
		return data;
	}
	public static void getScreenshot(WebDriver driver, int testID) throws IOException {

		Date d = new Date();
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String FileName = d.toString().replace(":", "-").replace("", "-");
		File dest = new File("\"F:\\velocity-software testing\\screenshot" + " " + testID + "" + FileName);
		FileHandler.copy(source, dest);
	 }	
	  

}
