
package database_console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DBConnect {

    
    
    
    
    public static void main(String[] args) {
        
        
        try {
        String host = "jdbc:derby://localhost:1527/Employees";
        String uName = "Dimi";
        String uPass = "Dimin";
        Connection con = DriverManager.getConnection(host,uName, uPass);
        
        Statement stmt = con.createStatement();
        String SQL = "SELECT * FROM WORKERS";
        ResultSet rs = stmt.executeQuery(SQL);
        
        rs.next();
        int id_col = rs.getInt("ID");
        String First_Name = rs.getString("First_Name");
        String Last_Name = rs.getString("Last_Name");
        String Job_Title = rs.getString("Job_Title");
        
        String p = id_col + " " + First_Name + " " + Last_Name + " " + Job_Title;
        System.out.println(p);
    }
        
        catch (SQLException err) {
            System.out.println(err.getMessage());
        }
            
            
            
        }
    
}
