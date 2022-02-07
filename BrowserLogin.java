package selenium_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BrowserLogin{
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			WebDriver driver1 = new ChromeDriver();
			driver.get("https://instagram.com/");
			driver1.get("https://facebook.com/");
			driver.findElement(By.cssSelector("input[name='username']")).sendKeys("vishal.sony1");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys("ghfvjtyc");
			driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
}