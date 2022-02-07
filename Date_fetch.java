package selenium_testing;
import java.util.Date;


public class Date_fetch {
	public static void main(String[] args) {
		Date date=new Date();
		//String Date_str = date.toString();
		//System.out.println(date);
		String current_date = date.toString().replaceAll(":","-");
		System.out.println(current_date);
	}

}
