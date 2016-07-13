
package jdbcexample;

import java.sql.*;



public class JDBCExample2 {

  
    public static void main(String[] args) {
        //Load driver
        try{
            String insert = "insert into EmployeeInfo values(?, ?, ?)";
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            //Create Connection
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Employee", "Emp", "emp");
            //Create statements
            PreparedStatement pstmt = con.prepareStatement(insert);
            pstmt.setInt(1, 109);
            pstmt.setString(2, "James");
            pstmt.setString(3, "Delhi");
            
            int row = pstmt.executeUpdate();
            System.out.println(row + " affected in data");     
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
