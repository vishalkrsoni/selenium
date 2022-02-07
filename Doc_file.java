	package selenium_testing;	
	//import java.awt.Window;
	import java.io.File;
	
	import java.io.FileWriter;
	import java.io.IOException;
	//import java.io.PrintWriter;
	import java.util.List;

	import org.apache.poi.EncryptedDocumentException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Doc_file {
		
		public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
			
		File new_file = new File("C:\\Users\\vishal\\Desktop\\new1.txt");
			
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
	        Thread.sleep(1000);
	        
	        List<WebElement> links = driver.findElements(By.xpath("//a"));
	        System.out.println("total links found: "+links.size());
	       
	        FileWriter fw= new FileWriter(path);
	       // FileWriter fw= new FileWriter(new_file);
	        //PrintWriter pw= new PrintWriter(fw);
	       // pw.close();
	        
	        for (WebElement ele : links) {
	        	String link = ele.getAttribute("href");
	        	System.out.println(link);
	        	fw.write(link+System.lineSeparator());		
			}
	       fw.close();	        
	}
}
