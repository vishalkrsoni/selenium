package selenium_testing;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Only_parent_close {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
			driver.get("https://www.naukri.com/");
			String parent = driver.getWindowHandle();
			Set<String> all_handles = driver.getWindowHandles();
			int count=all_handles.size();
			System.out.println("Total browsers are: "+count);
			
			for (String string : all_handles) {
				driver.switchTo().window(string);
				String title = driver.getTitle();
				if(string.equals(parent)){
					driver.close();
					System.out.println("Closed---> "+title);
				}
			}
		}
	}

