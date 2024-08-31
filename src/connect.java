import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class connect {
    
    Connection con=null;   
    public static Connection ConnectDB(){
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String jdbcUrl = "jdbc:mysql://localhost:3306/hospital";
            //table name
            String username = "root";
            String password = "computer";

            // Establish a connection
            Connection con = DriverManager.getConnection(jdbcUrl, username, password);
            return con;
        }catch(ClassNotFoundException |SQLException e){
        JOptionPane.showMessageDialog(null, e);
        return null;
        }
    }
}
     