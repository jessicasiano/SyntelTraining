
package jdbcexample;

import java.sql.*;



public class JDBCExample {

  
    public static void main(String[] args) {
        //Load driver
        try{
            String select = "select * from EmployeeInfo";
            String insert = "insert into EmployeeInfo values(104, 'Nicole', 'Nashville')";
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            //Create Connection
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Employee", "Emp", "emp");
            //Create statements
            Statement stmt = con.createStatement();
            ResultSet rset1 = stmt.executeQuery(select);
            while(rset1.next()){
                int id = rset1.getInt(1);
                String name = rset1.getString(2);
                String address = rset1.getString(3);
                
                System.out.println("ID: " + id + "\tName: " + name + "\tCity: " + address);
            }
            
            con.close();
        } 
        catch(ClassNotFoundException ce){System.out.println(ce);}
        catch(SQLException se){System.out.println(se);}
        
        
        //Create statements
        //Execute
        //result set
        //Close connection
    }
    
}
