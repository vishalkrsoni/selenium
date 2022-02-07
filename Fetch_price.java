package selenium_testing;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fetch_price {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91701/OneDrive/Desktop/vishal/18th_dec.html");		
		WebElement val=driver.findElement(By.id("hotel"));
		ArrayList<Integer> list = new ArrayList<Integer>();
		TreeSet<Integer> Tree = new TreeSet<Integer>();
		Select s=new Select(val); // ref. var. of Select class  
		List<WebElement> options=s.getOptions();
		//s.selectByValue(arg0);
		
		for(WebElement option : options)
		{
			String cost= option.getAttribute("price"); // fetch each cost
			int c= Integer.parseInt(cost);
			list.add(c); //Add cost to list 
			Tree.add(c); //Add cost to TreeSet
		}
		
		System.out.println("Values using list:");
		for(Integer text : list)
		{
			System.out.println(text);	
		}
		
		Collections.sort(list); //Sorting the list
		System.out.println("\nSorted Values using list:");
		for(Integer text : list)
		{
			System.out.println(text);	
		}
	
		Collections.sort(list,Collections.reverseOrder()); //Sort n reverse the values in list
		System.out.println("\nReverse_Sorted Values using list:");
		for(Integer text : list) //fetch each value from list
		{
			System.out.println(text);	
		}
		
		System.out.println("\nValues using Tree(sorted):");
		for(Integer text : Tree) //fetch each value from TreeSet
		{
			System.out.println(text);	
		}	
		
		Thread.sleep(6000);
		driver.close();
	}
}