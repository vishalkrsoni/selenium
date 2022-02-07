package selenium_testing;

public class sampleCode {
	public static void main(String[] args) {
		String str = "My world is good ghjfhj hjgyu hgkuy gtyukf gyuf";
		
		String arr[]=str.split(" ");
		
		for(int i=arr.length-1;i>=1;i--)
		{
			System.out.print(arr[i]+".");
		}
		System.out.println(arr[0]);
		
				
	}

}
