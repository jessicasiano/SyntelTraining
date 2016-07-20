package utility;
import java.util.ArrayList;

import modules.Calculator;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestExcel1 {
	
	Calculator calc = null;
	ArrayList<String> results = new ArrayList<String>();
	
	@BeforeClass
	public void initCalc(){
		calc = new Calculator();
	}
	
	@Test(dataProvider="dpAddValid")
	public void testAdd(int a, int b, int expected){
		int actual = calc.add(a, b);
		if(actual == expected){
			results.add("Add method passed test");
		}
		else{
			results.add("Add method failed test");
			Assert.fail("Actual is not equal to expected");
		}
	}
	
	@DataProvider(name="dpAddValid")
	public Object[][] getData(){
		return ExcelUtility.readDataFromExcel();
	}
	
	@AfterClass
	public void destroyCalc(){
		calc = null;
		ExcelUtility.writeData(results);
	}
}
