package selenium_testing;
import java.util.List;
//import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Multi_write {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		File new_file = new File("./Excel_files/read1.xlsx");
		
		boolean created = new_file.createNewFile();
		if(created) {
			System.out.println("file created successfully");
		}
		else{
			System.out.println("Already Exists:");
		}


		//specify the excel path
		FileInputStream f=new FileInputStream("./Excel_files/read1.xlsx");
		
		// Open Excel
		Workbook book = WorkbookFactory.create(f);
		
		//specify sheet name
		Sheet s = book.getSheet("Sheet1");
        
        System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(5000);
        
        List<WebElement> links = driver.findElements(By.xpath("/a"));

        for(int i = 0; i < links.size(); i++)
        {
            Row rw =s.createRow(i);
		    Cell c = rw.createCell(0);
            c.setCellValue(links.get(i).getAttribute("href"));

        }
        
        FileOutputStream f1 = new FileOutputStream("./Excel_files/read1.xlsx");
        book.write(f1);
	}
}
