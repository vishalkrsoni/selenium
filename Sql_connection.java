package selenium_testing;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class Sql_connection {	
	static Connection conn=null;
	static String db_name="my_db";
	static String url="jdbc:mysql://localhost:3306/"+db_name;
	static String username="root";
	static String password="Vish1234";
	static String driver_name="com.mysql.cj.jdbc.Driver";

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException,SQLSyntaxErrorException {	
		Class.forName(driver_name);//.newInstance();

		conn=DriverManager.getConnection(url,username,password);
		if (conn!=null){
			System.out.println("Connected successfully");
		}
		else{
			System.out.println("Some trouble");
		}	

		Scanner s=new Scanner(System.in);

		while (true) {

			System.out.print("Enter your choice:\n1.Display Tables List \n2.See Table Description\n3.Run a query\n4.insert/update\n5.Exit\n");
			int choice = s.nextInt();
			s.nextLine();

			Statement statement= conn.createStatement();
			int count;

			switch (choice) {
			case 1:	           			
				ResultSet rs1=statement.executeQuery("show tables;");
				System.out.println("Tables Present in the Database:");
				count=1;
				while(rs1.next())
				{
					System.out.println(count+". "+rs1.getString(1));
					count++;
				}
				System.out.println();
				break;
			case 2:	           			
				System.out.println("Enter Table Name:");
				String t_name = s.nextLine();
				ResultSet rs2=statement.executeQuery("desc"+" "+t_name);
				System.out.println("Table attributes are:");
				while(rs2.next())
				{
					System.out.println(rs2.getString(1)+"\t\t"+rs2.getString(2));
				}
				System.out.println();
				break;
			case 3:		            
				System.out.println("Enter your query:");
				String query = s.nextLine();
				ResultSet rs=statement.executeQuery(query);
				ResultSetMetaData rsmd=rs.getMetaData();
				int column_count=rsmd.getColumnCount();

				System.out.println("Total Columns Present: "+column_count+"\n");
				while(rs.next())
				{
					String outputs="";
					for(int i=1;i<=column_count;i++)
					{
						outputs+=rs.getString(i)+"\t\t";
					}
					System.out.println(outputs);
				}
				System.out.println();
				break;
			case 4:		            	
				System.out.println("Enter the statement:");
				String stat = s.nextLine();
				statement.executeUpdate(stat);
				System.out.println("Success:");
				break;
			case 5:
				s.close();
				System.out.println("Good-Bye ");
				return;
			default:
				System.out.println("Invalid Choice\n");
			}
		}
	}
}

