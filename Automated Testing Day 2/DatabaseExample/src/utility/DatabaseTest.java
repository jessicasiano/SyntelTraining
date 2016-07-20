package utility;
import modules.Calculator;

import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.*;

public class DatabaseTest {
	Connection con = null;
	Statement stmt = null;
	ResultSet rset1 = null;
	Calculator calc;
	@BeforeClass
	public void setup(){
		try {
			calc = new Calculator();
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			con = DriverManager.getConnection("jdbc:derby://localhost:1527/InsertData", "id", "id");
			stmt = con.createStatement();
			rset1 = stmt.executeQuery("select * from InsertData");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@AfterClass
	public void teardown(){
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(dataProvider="dpAddValid")
	public void testAdd(int a, int b, int expected){
		int actual = calc.add(a, b);
		if(actual == expected){
			System.out.println("Add method passed test");
		}
		else{
			System.out.println("Add method failed test");
			Assert.fail("Actual is not equal to expected");
		}
	}
	
	@DataProvider(name="dpAddValid")
	public Object[][] getData(){
		int rows = 0;
		Object[][] d = null;
		try {
			while(rset1.next())
				rows++;
	        ResultSetMetaData resultSet = rset1.getMetaData();
			d = new Object[rows][resultSet.getColumnCount()];
			int r  = 0;
				while(rset1.next()){
	                int a = rset1.getInt(2);
	                int b = rset1.getInt(3);
	                int e = rset1.getInt(4);
	                d[r][0] = a;
	                d[r][1] = b;
	                d[r][2] = e;
	                r++;             
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return d;

	}
  
  	
  	
}
