package Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class REC_19_DataBaseConn {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql cj.jdbc Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
        System.out.println("Connection Created !");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("Select * from employes");
        while (rs.next()){
            String id = rs.getString("id");
            String name = rs.getString("name");
            String design = rs.getString("design");
            String dept = rs.getString("dept");

            System.out.println("*  *  *  * \n");
            System.out.println("ID :: " + id);
            System.out.println("Name :: " + name);
            System.out.println("Designation :: " + design);
            System.out.println("Department :: " + dept);
        }
        
    }
}