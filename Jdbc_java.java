package selenium_testing;

import java.io.IOException;
import java.sql.*;

import java.util.Scanner;

public class Jdbc_java {
	static Connection conn=null;
	static String db_name="jdbc_work";
	static String url="jdbc:mysql://localhost:3306/"+db_name;
	static String username="root";
	static String password="Vish@12345";
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException {
		
		Class.forName("com.mysql.jdbc.Driver");//.newInstance();
		conn = DriverManager.getConnection(url,username,password);
		if (conn!=null){
			System.out.println("Connected successfully");
		}
		else{
			System.out.println("Some trouble");
		}
		
		
		Scanner s=new Scanner(System.in);

		Statement statement= conn.createStatement(); // statement object
		//Scanner s=new Scanner(System.in);
		
		System.out.println("Enter table name: ");
		String tname=s.nextLine();
		String create_table="create table "+tname+ "(Empno integer(5) primary key,Ename varchar(20),sal integer(4))";//query for table creation
		
		int status = statement.executeUpdate(create_table); // query execution
		if(status==0){
			System.out.println("Table created Successfully");
		}
		else{
			System.out.println("Un-Succesful");
		}

		
		System.out.println("enter query:");
		String query = s.nextLine();
		ResultSet rs=statement.executeQuery(query);
		
		ResultSetMetaData rsmd=rs.getMetaData();
		int column_count=rsmd.getColumnCount();
		System.out.println("Total Columns Present: "+column_count);
		
		while(rs.next())
		{
			String outputs="";
		for(int i=1;i<=column_count;i++)
		{
			outputs= outputs+"\t\t"+rs.getString(i);
		}
		System.out.println(outputs);
		}
		s.close();

	}

}
