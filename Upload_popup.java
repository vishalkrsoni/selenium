package selenium_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_popup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gclid=Cj0KCQiAk4aOBhCTARIsAFWFP9FOtKo_y8DFxuSdnF2C9EzQg7MXZ3DDm4H_MuE9dyCUJJ-7UT16MGcaAgDlEALw_wcB&gclsrc=aw.ds");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//button[.='Upload Resume']")).click();
		//driver.findElement(By.xpath("//button[.='Upload Resume']")).sendKeys("C:\\Users\\91701\\OneDrive\\Desktop\\demo.java");
	}
}
