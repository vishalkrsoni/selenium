package selenium_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class PopUp_HiddenDivision {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		
		Thread.sleep(2000);	
		driver.findElement(By.xpath("(//div[.='Tue, Dec 21'])[2]")).click();;
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='24'])[2]")).click();
	
	
	}
}
