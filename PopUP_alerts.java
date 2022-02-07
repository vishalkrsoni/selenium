package selenium_testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUP_alerts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);	
		driver.findElement(By.name("cusid")).sendKeys("admin");
		Thread.sleep(4000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(4000);
		Alert a=driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.accept();
		
	}

}
