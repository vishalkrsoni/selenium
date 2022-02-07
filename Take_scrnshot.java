package selenium_testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Take_scrnshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File temp=ts.getScreenshotAs(OutputType.FILE);
	
		File new_file = new File("C:\\Users\\91701\\OneDrive\\Desktop\\Screenshots\\image.jpeg");
		
		/*boolean created = new_file.createNewFile();
		
		if(created) {
			System.out.println("file created successfully");
		}
		else{
			System.out.println("Already Exists:");
		}*/
		
		FileUtils.copyFile(temp, new_file);
		
		driver.close();
			
		
	}

}
