package Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class ExcelUpdate1 {
@Test
public void updateSheetDetails() throws IOException {
	// Create instance of FileInputStream class and pass the required excel file location to its constructor
	FileInputStream fis = new FileInputStream("D:\\eclepse java\\MavenBasicProject\\AppData\\AppTestData.xlsx");
	// create an instance of required workbook class and pass FileInputStream instance to its constructor
	Workbook workbook = new XSSFWorkbook(fis);
	  // Create a blank sheet
    Sheet sheet = workbook.createSheet("Employee Data");

    // This data needs to be written (Object[])
    Map< String, Object[]> data = new TreeMap< String, Object[]>();
    data.put("1", new Object[] { "ID", "NAME", "LASTNAME" });
    data.put("2", new Object[] { 1, "yugandhar", "barhate" });
    data.put("3", new Object[] { 2, "vishal", "wani" });
    data.put("4", new Object[] { 3, "sam", "test" });
    data.put("5", new Object[] { 4, "java", "good" });
    
    // Iterate over data and write to sheet 
    Set< String> keyset =  data.keySet(); 
    int rownum = 0;
    for (String key : keyset) {
       Row row = sheet.createRow(rownum++); 
       Object[] objArr = data.get(key);
       int cellnum = 0;
       for (Object obj : objArr) {
       Cell cell = row.createCell(cellnum++); 
       if (obj instanceof String) 
       cell.setCellValue((String) obj);
       else if (obj instanceof Integer)
       cell.setCellValue((Integer) obj);
       }
    }
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
	/**
	  try {
         // Write the workbook in file system
         FileOutputStream fos =	new FileOutputStream("D:\\eclepse java\\MavenBasicProject\\AppData\\AppTestData.xlsx");
         workbook.write(fos);
         out.close();
         System.out.println("File Updated...");
     } catch (Exception e) {
           e.printStackTrace();
          }
	 */
}}