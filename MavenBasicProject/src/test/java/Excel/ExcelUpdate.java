package Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelUpdate {

	@Test
	public void updateCellDetails() throws IOException {
		// Create instance of FileInputStream class and pass the required excel file location to its constructor
		FileInputStream fis = new FileInputStream("D:\\eclepse java\\MavenBasicProject\\AppData\\AppTestData.xlsx");
		// create an instance of required workbook class and pass FileInputStream instance to its constructor
		Workbook workbook = new XSSFWorkbook(fis);
		// get the required sheet from excel
		Sheet sheet = workbook.getSheet("Sheet1");
		// get specific row from the sheet
		Row row=sheet.getRow(1);
		//create cell to update the data
		Cell cell=row.createCell(3);
		cell.setCellValue("Passed");
		
		//to store the update data find the location to save the file
		FileOutputStream fos=new FileOutputStream("D:\\eclepse java\\MavenBasicProject\\AppData\\AppTestData.xlsx");
		//write the content in to the required file
		workbook.write(fos);
		//close the connection
		fos.close();		
		System.out.println("File Updated...");
	}
	
	@Test
	public void updateSheetDetails() throws IOException {
		// Create instance of FileInputStream class and pass the required excel file location to its constructor
		FileInputStream fis = new FileInputStream("D:\\eclepse java\\MavenBasicProject\\AppData\\AppTestData.xlsx");
		// create an instance of required workbook class and pass FileInputStream instance to its constructor
		Workbook workbook = new XSSFWorkbook(fis);
		//TODO: create new sheet
		//TODO: create multiple rows(3)
		//TODO: create 3 cell in each row
		//TODO: add different type of values
		
		//to store the update data find the location to save the file
		FileOutputStream fos=new FileOutputStream("D:\\eclepse java\\MavenBasicProject\\AppData\\AppTestData.xlsx");
		//write the content in to the required file
		workbook.write(fos);
		//close the connection
		fos.close();		
		System.out.println("File Updated...");
	}
}