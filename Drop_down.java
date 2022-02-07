package selenium_testing;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/r.php");
	WebElement mon,year;
	int count_year,count_month;
	
	Thread.sleep(2000);
	mon= driver.findElement(By.id("month"));
	Select s=new Select(mon);
	List<WebElement> options = s.getOptions();
	count_month= options.size();
	System.out.println("Total months: "+count_month);
	
	Thread.sleep(2000);
	year= driver.findElement(By.id("year"));
	Select s1=new Select(year);
	List<WebElement> options1 = s1.getOptions();
	count_year= options1.size();
	System.out.println("total years: "+count_year);
	
	Thread.sleep(2000);
	for (WebElement m : options1) {
		String text = m.getText();
		System.out.println(text);
	}
	}
}
