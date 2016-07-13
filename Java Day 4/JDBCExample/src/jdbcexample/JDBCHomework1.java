
package jdbcexample;

import java.sql.*;



public class JDBCHomework1 {

  
    public static void main(String[] args) {
        //Load driver
        try{
            //Insert
            String insert = "insert into EmployeeInfo values(?, ?, ?)";
            //update
            String update = "update EmployeeInfo set id = 211 where id = 111";
            String del = "delete from EmployeeInfo where id = 112";
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            //Create Connection
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Employee", "Emp", "emp");
            //Create statements
            PreparedStatement pstmt = con.prepareStatement(insert);
            Statement stmt = con.createStatement();
            pstmt.setInt(1, 116);
            pstmt.setString(2, "John");
            pstmt.setString(3, "Delhi");
            
            int row = pstmt.executeUpdate();
            System.out.println(row + " affected in data");    
            stmt.executeUpdate(update);
            stmt.executeUpdate(del);
            
            //get table info
            
                String select = "select * from EmployeeInfo";
                Statement stmt2 = con.createStatement();
                ResultSet rset1 = stmt2.executeQuery(select);
                while(rset1.next()){
                int id = rset1.getInt(1);
                String name = rset1.getString(2);
                String address = rset1.getString(3);
                
                System.out.println("ID: " + id + "\tName: " + name + "\tCity: " + address);
            }
                
                DatabaseMetaData metadata = con.getMetaData();
                ResultSetMetaData resultSet = rset1.getMetaData();
                int x = 1;
                System.out.println("Total column count: " + resultSet.getColumnCount());
	     while (x <= resultSet.getColumnCount()) {
		String name = resultSet.getColumnName(x);
                String type = resultSet.getColumnTypeName(x);
		System.out.println(name + " " + type);
                x++;
	    }
             System.out.println("");
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
