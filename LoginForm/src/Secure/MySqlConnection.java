
package Secure;
import java.sql.*;
import javax.swing.*;

public class MySqlConnection {
    Connection conn=null;
    public static Connection ConnectDB() throws SQLException, ClassNotFoundException{
        try{
            Class.forName("com.mysql.jdbd.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/"
                    + "technosoft","root","05121989");
            JOptionPane.showMessageDialog(null,"Connected to database");
            return conn;
        }
        catch(Exception e) {
    JOptionPane.showMessageDialog(null, e);
    return null;
    }
    }
}
