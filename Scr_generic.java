package selenium_testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Scr_generic {
	public static void ScreenShot(WebDriver driver) throws IOException{
		String path="./screenshots/";
		Date date= new Date();
		String curr_date=date.toString().replaceAll(":", "-");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		
		File hdd = new File(path+curr_date+".jpeg");
		FileUtils.copyFile(temp, hdd);
	
		
	}

}
