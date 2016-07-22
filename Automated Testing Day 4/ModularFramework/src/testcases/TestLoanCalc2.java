package testcases;
import modules.SeleniumFunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pom.POMLoanCalc;

public class TestLoanCalc2 {

	public static void testLoanCalc(WebDriver d) {
		// TODO Auto-generated method stub
		POMLoanCalc c = new POMLoanCalc(d);
		String url = "http://www.calculator.net/loan-calculator.html";
		SeleniumFunction.openApp(d, url);
		SeleniumFunction.sync(d, 5000L);
		
		c.loanAmount.clear();
		c.loanAmount.sendKeys("50000");
		
		c.loanTerm.clear();
		c.loanTerm.sendKeys("5");
		
		c.interestRate.clear();
		c.interestRate.sendKeys("7");
		
		Select comp = new Select(c.interestCompound);
		comp.selectByValue("quarterly");
		
		Select payback = new Select(c.interestPayback);
		payback.selectByValue("quarter");
		
		c.calcButton.click();
	}

}
