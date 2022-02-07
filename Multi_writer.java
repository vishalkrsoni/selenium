	package selenium_testing;
	
	//import java.awt.Window;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.List;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class Multi_writer {
		public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
			//C:\Users\91701\OneDrive\Desktop
		File new_file = new File("C://Users//91701//OneDrive//Desktop//new2.xlsx");
			
			boolean created = new_file.createNewFile();
			
			if(created) {
				System.out.println("file created successfully");
			}
			else{
				System.out.println("Already Exists:");
			}
	
			 
	        String path=new_file.getAbsoluteFile().toString().replaceAll("'\'", "//");
	   
	        System.out.println(path);
	        
	        System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.amazon.in/");
	        Thread.sleep(2000);
	        driver.manage().window().maximize();
	        Thread.sleep(5000);
	        
	        List<WebElement> links = driver.findElements(By.xpath("//a"));
	        System.out.println("total links found: "+links.size());
	        driver.close();
	   
			FileInputStream f=new FileInputStream(path);
		
			Workbook book = WorkbookFactory.create(f);
			
		
			Sheet sht = book.getSheet("Sheet1");
	        
	        for(int i = 0; i < links.size(); i++)
	        {
	            Row rw =sht.createRow(i);
			    Cell cl = rw.createCell(0);
	            cl.setCellValue(links.get(i).getAttribute("href"));

	        }
	        
	        FileOutputStream f1 = new FileOutputStream(path);
	        book.write(f1);
		}
	}
