package selenium_testing;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);

		driver.get("file:///C:\\Users\\vishal\\Desktop\\vishal\\19th_dec.html");
		
		
		WebElement val=driver.findElement(By.id("fr1"));
		
		driver.switchTo().frame(val);
		driver.findElement(By.xpath("//input[@id='a1']")).sendKeys("abc");
	
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='a3']")).sendKeys("xyz");
	
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='a2']")).sendKeys("123");
	
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@id='a4']")).sendKeys("777");
	}
}