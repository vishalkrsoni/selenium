package selenium_testing;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Only_child_close {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);
		String parent = driver.getWindowHandle();
		Set<String> all_handles = driver.getWindowHandles();
		all_handles.remove(parent);
		int count=all_handles.size();
		System.out.println("Total browsers are: "+count);

		for (String string : all_handles) {
			driver.switchTo().window(string);
			String title = driver.getTitle();
			Thread.sleep(3000);
			driver.close();
			System.out.println("Closed---> "+title);
		}
	}
}



