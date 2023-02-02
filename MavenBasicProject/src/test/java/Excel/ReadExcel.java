package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	/**
	 1. Excel file location with file name ---> FileInputStream
			1.1 Workbook ---> Define the excel type WorkBook ---> XSSFWorkbook
	2. Sheet name --> 						Sheet	 ---> XSSFSheet
	3. Row		  -->						Row		 ---> XSSFRow
	4. Coloun 	  --> 						Cell	 ---> XSSFCell
	 * @throws IOException 
	 */
  @Test
  public void sheetOps() throws IOException {
	  
	  FileInputStream fis=new FileInputStream("D:\\eclepse java\\MavenBasicProject\\AppData\\AppTestData.xlsx");
	 // XSSFWorkbook xworkbook=new XSSFWorkbook(fis);
	  				//or
	  Workbook workbook=new XSSFWorkbook(fis);
	  //after getting workbook you can perform any operation on Sheet
	 int sheetCt= workbook.getNumberOfSheets();
	 System.out.println("Sheet count is: "+sheetCt);
	 //print sheet names
	 for(int i=0;i<sheetCt;i++) {
//		Sheet sheet= workbook.getSheetAt(i);
//		String sheetName=sheet.getSheetName();
//		System.out.println("Sheet names: "+sheetName);
				//or
		System.out.println("Sheet names: "+workbook.getSheetAt(i).getSheetName());
	 }
	 //if you have to perform any operation on specific row dn use sheet object for that
	 Sheet sheet =workbook.getSheet("Sheet1");
  }
  @Test
  public void rowOps() {
	  
  }
  @Test
  public void cellOps() {
	  
  }
  @Test
  public void readDiffrenetTypeOfDataFromExcel() {
	  
  }
}