	package selenium_testing;
	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class for_each_loop {
	public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
			WebDriver d= new ChromeDriver();
			d.get("https://www.amazon.in");
			Thread.sleep(2000);
			List<WebElement> link = d.findElements(By.xpath("//a"));
			int count = link.size();
			System.out.println(count);
			Thread.sleep(2000);
			for (WebElement m : link) {
				WebElement w = m;
				String text = w.getText();
				System.out.println(text);
			}
			d.quit();
		}

	}
