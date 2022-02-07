package selenium_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Text_func {
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vishal.sony1");
			//Thread.sleep(2000);
			//driver.findElement(By.xpath("//input[@id='pass' type='Password']")).sendKeys("nothing else");
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(.,'Log In')]")).click();			
	}
}
