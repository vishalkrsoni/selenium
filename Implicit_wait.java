package selenium_testing;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait {
	public static void main(String[] args) throws InterruptedException {
		 
        System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);

        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        
       /* driver.findElement(By.xpath("//a[.=]"));
        driver.findElement(By.xpath());
        driver.findElement(By.xpath());
        driver.findElement(By.xpath());
        driver.findElement(By.xpath());        
	*/}
}
