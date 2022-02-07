package selenium_testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_handling {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File new_file = new File("./Excel_files/read1.xlsx");
		
		boolean created = new_file.createNewFile();
		
		if(created) {
			System.out.println("file created successfully");
		}
		else{
			System.out.println("Already Exists:");
		}


		//specify the excel path
		FileInputStream f=new FileInputStream(new_file);
		
		// Open Excel
		Workbook book = WorkbookFactory.create(f);
		
		//specify sheet name
		Sheet s = book.getSheet("Sheet1");
		//specify row
		Row rw =s.getRow(0);
		//specify column
		Cell c = rw.getCell(1);
		//fetch data
		String value = c.getStringCellValue();
		//String value = c.toString()
		System.out.println(value);
	}
}
