package selenium_testing;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {

	public static void main(String[] args) throws InterruptedException, Throwable {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
	
		WebElement rClick = driver.findElement(By.xpath("//a[.='తెలుగు']"));
		Actions act = new Actions(driver);
		act.contextClick(rClick).perform();
		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);

		Set<String> address = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(address);
		
		Thread.sleep(4000);
		driver.switchTo().window(list.get(1));

	}
}