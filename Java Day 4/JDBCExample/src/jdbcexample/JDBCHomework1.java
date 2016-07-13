
package jdbcexample;

import java.sql.*;



public class JDBCHomework1 {

  
    public static void main(String[] args) {
        //Load driver
        try{
            //Insert
            String insert = "insert into EmployeeInfo values(?, ?, ?)";
            //update
            String update = "update EmployeeInfo set id = 201 where id = 102";
            String del = "delete from EmployeeInfo where id = 103";
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            //Create Connection
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Employee", "Emp", "emp");
            //Create statements
            PreparedStatement pstmt = con.prepareStatement(insert);
            Statement stmt = con.createStatement();
            pstmt.setInt(1, 100);
            pstmt.setString(2, "James");
            pstmt.setString(3, "Delhi");
            
            int row = pstmt.executeUpdate();
            System.out.println(row + " affected in data");    
            stmt.executeUpdate(update);
            stmt.executeUpdate(del);
            
            //get table info
             DatabaseMetaData metadata = con.getMetaData();
	     ResultSet resultSet = metadata.getColumns(null, null, "EmployeeInfo", null);
	     while (resultSet.next()) {
		String name = resultSet.getString("COLUMN_NAME");
		String type = resultSet.getString("TYPE_NAME");
		int size = resultSet.getInt("COLUMN_SIZE");
		
		System.out.println("Column name: [" + name + "]; type: [" + type 
		    + "]; size: [" + size + "]");
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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcexample;

/**
 *
 * @author Jessica
 */
public class JDBCEHomework1 {
    
}
