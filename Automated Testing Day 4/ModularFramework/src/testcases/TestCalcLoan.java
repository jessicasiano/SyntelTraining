package testcases;
import org.openqa.selenium.WebDriver;
import modules.SeleniumFunction;

public class TestCalcLoan {
	public void testLoanCalc(WebDriver driver){
				
		String url = "http://www.calculator.net/loan-calculator.html";
		SeleniumFunction.openApp(driver, url);
		SeleniumFunction.sync(driver, 5000L);
		
		SeleniumFunction.clear(driver, "//*[@id='cloanamount']");
		SeleniumFunction.type(driver, "//*[@id='cloanamount']" , "50000");
		
		SeleniumFunction.clear(driver, "//*[@id='cloanterm']");
		SeleniumFunction.type(driver, "//*[@id='cloanterm']" , "5");
		
		SeleniumFunction.clear(driver, "//*[@id='cinterestrate']");
		SeleniumFunction.type(driver, "//*[@id='cinterestrate']" , "6");
		
		SeleniumFunction.select(driver, "//*[@id='ccompound']", "Quarterly");
		
		SeleniumFunction.select(driver, "//*[@id='cpayback']", "Every Quarter");
		
		SeleniumFunction.click(driver, "calinputtable");
	}
	
	public void closeDriver(WebDriver driver){
		driver.close();
	}
	
	public void quitDriver(WebDriver driver){
		driver.quit();
	}
}
