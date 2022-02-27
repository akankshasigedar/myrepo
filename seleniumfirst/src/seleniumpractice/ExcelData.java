package seleniumpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static void main(String[] args) throws IOException {
		File path = new File("F:\\velocity-software testing\\Book1.xlsx");// we give path of the excel sheet

		FileInputStream fileread = new FileInputStream(path);// to read the file we use file input stream

		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fileread);// to read the work book in xlsx format
		// HSSFWorkbook wb2= new HSSFWorkbook(fileread); // to read the work book in xls
		// format
		XSSFSheet sheet = workbook.getSheetAt(0);

		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum(); // To get the total rows in the excel sheet
		System.out.println("Total rows in excel sheet:" + rowCount);

		// For loop for reading the data from the excel sheet
		for (int i = 0; i < rowCount + 1; i++) { // run the loop till the end of the rows

			Row row = sheet.getRow(i); // read the data in the rows

			int cellNumber = row.getLastCellNum(); // to get the cell numbers in the sheet

			// System.out.println("The cells in excel are:" + cellNumber);

			for (int j = 0; j < cellNumber; j++) { // run the loop till end of the cells

				System.out.print(row.getCell(j).getStringCellValue() + " - "); // read the data from the rows and
																				// columns and print the data of one
																				// cell in one line.
			}
			System.out.println();
		}
	}

}