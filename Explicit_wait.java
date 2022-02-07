package selenium_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.prepleaf.com/");
        driver.findElement(By.xpath("//a[.='Success Stories']")).click();;
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.titleContains("Success"));
    }
}
