package selenium_testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();

		list.add("10");
		list.add("2");
		list.add("21");
		list.add("5");
		list.add("35");
		
		List<Integer> list1 = new ArrayList<Integer>();	
		list1.add(10);
		list1.add(2);
		list1.add(21);
		list1.add(5);
		list1.add(35);

		Collections.sort(list);
		System.out.println("As String: "+list);
		
		Collections.sort(list1);
		System.out.println("As Integer: "+list1);
		
	}
}
