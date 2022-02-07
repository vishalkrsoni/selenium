package selenium_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys {
	
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/91701/OneDrive/Desktop/vishal/14th_dec.html");
			WebElement e1,e2,e3;
			Thread.sleep(2000);
			e1 = driver.findElement(By.xpath("//input[@value='Hello']"));
			e2 = driver.findElement(By.xpath("//input[@value='World']"));
			e3 = driver.findElement(By.xpath("//a[.='Gmail']"));
			Thread.sleep(2000);
			e1.sendKeys(org.openqa.selenium.Keys.CONTROL+"ac");
			Thread.sleep(2000);
			e2.sendKeys(org.openqa.selenium.Keys.CONTROL+"av");
			Thread.sleep(2000);
			e3.sendKeys(org.openqa.selenium.Keys.ENTER);			
	}
}