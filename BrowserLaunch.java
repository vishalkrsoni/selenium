package selenium_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch{
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://facebook.com/");
			driver.findElement(By.cssSelector("input[id='email']")).sendKeys("vishal.sony1@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("ghfvjtyc");
			driver.findElement(By.cssSelector("button[value='1']")).click();
			
			
	}
}

