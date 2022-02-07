	package selenium_testing;
	import java.util.*;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class dropdown_collections {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:\\Users\\vishal\\Desktop\\vishal\\18th_dec.html");
			
			WebElement val=driver.findElement(By.id("hotel"));
		
			ArrayList<String> list = new ArrayList<String>();
			TreeSet<String> Tree = new TreeSet<String>();
			Select s=new Select(val); // ref. var. of Select class  
			List<WebElement> options=s.getOptions();
			//s.selectByValue(arg0);
			
			for(WebElement option : options)
			{
				String text_value= option.getAttribute("value"); // fetch each text_value
				list.add(text_value); //Add text_value to list 
				Tree.add(text_value); //Add text_value to TreeSet
			}
			
			System.out.println("Values using list:");
			for(String text : list)
			{
				System.out.println(text);	
			}
			
			
			Collections.sort(list); //Sorting the list
			
			System.out.println("\nSorted Values using list:");
			for(String text : list)
			{
				System.out.println(text);	
			}
		
			
			Collections.sort(list,Collections.reverseOrder()); //Sort n reverse the values in list
			
			System.out.println("\nReverse_Sorted Values using list:");
			for(String text : list) //fetch each value from list
			{
				System.out.println(text);	
			}
		
			
			System.out.println("\nValues using Tree(sorted):");
			for(String text : Tree) //fetch each value from TreeSet
			{
				System.out.println(text);	
			}	
			
			
			Thread.sleep(6000);
			driver.close();
		}
	}

