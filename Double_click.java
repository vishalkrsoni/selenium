
package selenium_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Double_click {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement dClick,rClick;
		dClick=driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me')]"));
		rClick=driver.findElement(By.xpath("//span[.='right click me']"));
		Actions act=new Actions(driver);
		Thread.sleep(500);
		act.doubleClick(dClick).perform();
		Thread.sleep(4000);
		act.contextClick(rClick).perform();
		
		
}
}
