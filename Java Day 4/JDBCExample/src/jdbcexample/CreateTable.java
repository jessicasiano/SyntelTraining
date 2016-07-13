
package jdbcexample;
import java.sql.*;

public class CreateTable {
    public static void main(String[] args) {
        //Load driver
        try{
            String sql = "CREATE TABLE REGISTRATION " +
                   "(id INT not NULL, " +
                   " name VARCHAR(255), " + 
                   " age INT, " + 
                   " PRIMARY KEY ( id ))"; 
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            //Create Connection
            Connectout.pion con = DriverManager.getConnection("jdbc:derby://localhost:1527/REGISTRATION;create=true", "root", "root");
            //Create statements
            Statement stmt = con.createStatement();
            stmt.execute(sql);
            System.println("Table created");
        }catch(ClassNotFoundException ce){System.out.println(ce);}
        catch(SQLException se){System.out.println(se);}
    }
}
