package driver;
import testcases.TestCalcLoan;
import testcases.TestLoanCalc2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		TestLoanCalc2.testLoanCalc(driver);
		
		//TestCalcLoan t = new TestCalcLoan();
		//t.testLoanCalc(driver);
		//t.closeDriver(driver);
		
		/*System.setProperty("webdriver.opera.driver", "C:\\Users\\jessi\\Desktop\\operadriver.exe");
		WebDriver driver2 = new OperaDriver();
		driver2.manage().window().maximize();
		
		t.testLoanCalc(driver2);
		t.closeDriver(driver2);*/
	}

}
