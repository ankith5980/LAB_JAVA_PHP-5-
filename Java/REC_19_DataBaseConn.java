package Java;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class REC_19_DataBaseConn {



		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			// register the database
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2 - Establish the connection 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
			System.out.println("connection created");
			//step 3- create statement
			Statement stmt=con.createStatement();
			
			//step 4- execute query
			ResultSet rs= stmt.executeQuery("select *from students;");
			
			while(rs.next())
			{
				int id =rs.getInt("id");
				String name=rs.getString("name");

				
				System.out.println("**************\n");
				System.out.println("ID:\n"+id);
				System.out.println("Name:\n"+name);

			}
			
		}

	}
