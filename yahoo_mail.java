package selenium_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahoo_mail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.get("https://in.mail.yahoo.com/");

		//Login
		driver.findElement(By.xpath("//a[@class='fuji-button-link fuji-button-inverted signin' and @alt='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login-username' and @name='username']")).sendKeys("vishalkrsoni");
		driver.findElement(By.xpath("//input[@id='login-signin' and @class='pure-button puree-button-primary challenge-button']")).click();
		driver.findElement(By.xpath("//input[@id='login-passwd' and @name='password']")).sendKeys("Noobmonkey12345");
		driver.findElement(By.xpath("//button[@type='submit' and @name='verifyPassword' and @value='Next']")).click();

		//send Mail
		driver.findElement(By.xpath("//a[@data-test-id='compose-button' and @aria-label='Compose']")).click();
		driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("manjunath153397@yahoo.com");
		driver.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("Selenium_test_case");
		driver.findElement(By.xpath("//div[@data-test-id='rte']")).sendKeys("Hello!, How is life.");
		driver.findElement(By.xpath("//span[contains(text(),'Send')]")).click();


		//logout
		driver.findElement(By.xpath("//label[@id='ybarAccountMenuOpener']")).click();
		driver.findElement(By.xpath("//span[.='Sign out']")).click();

		//login again
		driver.findElement(By.xpath("//a[@id='ysignin']")).click();
		driver.findElement(By.xpath("//a[@class='pure-button puree-button-link add-account page-button-link']")).click();



		driver.findElement(By.xpath("//input[@id='login-username' and @name='username']")).sendKeys("manjunath153397");
		driver.findElement(By.xpath("//input[@id='login-signin' and @class='pure-button puree-button-primary challenge-button']")).click();
		driver.findElement(By.xpath("//input[@id='login-passwd' and @name='password']")).sendKeys("Naguanna1533@");
		driver.findElement(By.xpath("//button[@type='submit' and @name='verifyPassword' and @value='Next']")).click();


		driver.findElement(By.xpath("//a[@id='ymail']")).click();

		//Check_inbox
		driver.findElement(By.xpath("//span[@id='darlaFocusPlaceholder'and @tabindex='-1']")).click();


		//driver.findElement(By.xpath("//a[@data-test-id='message-list-item' and @data-test-starred='true']")).click();





		//logout
		driver.findElement(By.xpath("//label[@id='ybarAccountMenuOpener']")).click();
		driver.findElement(By.xpath("//span[.='Sign out']")).click();


		/*
			driver.get("https://in.mail.yahoo.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='fuji-button-link fuji-button-inverted signin' and @alt='Sign in']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@id='login-username' and @name='username']")).sendKeys("vishalkrsoni1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='login-signin' and @class='pure-button puree-button-primary challenge-button']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='login-passwd' and @name='password']")).sendKeys("Noobmonkey12345");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit' and @name='verifyPassword' and @value='Next']")).click();
			Thread.sleep(2000);
		 */
	}
}
