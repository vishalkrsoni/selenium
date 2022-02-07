package selenium_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_map {
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.google.com/maps/dir///@12.959744,77.5847936,12z");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @placeholder='Choose starting point, or click on the map...']")).sendKeys("Mumbai");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@id='sbse0x0' and class='ZHeE1b-LK5yu-eEDwDf']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @placeholder='Choose destination...' and @tooltip='Choose destination...']")).sendKeys("Delhi");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@aria-label='Search' and @data-tooltip='Search' and @class='nhb85d-BIqFsb']")).click();			
	}
}
