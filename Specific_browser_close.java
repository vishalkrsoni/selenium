package selenium_testing;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Specific_browser_close {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);

		Set<String> all_handles = driver.getWindowHandles();

		int count=all_handles.size();
		System.out.println("Total browsers are: "+count);

		for (String string : all_handles) {
			driver.switchTo().window(string);
			String title = driver.getTitle();
			Thread.sleep(3000);

			if(title.equals("ICICI")){
				driver.close();
				System.out.println("Closed---> "+title);
			}
		}
	}
}