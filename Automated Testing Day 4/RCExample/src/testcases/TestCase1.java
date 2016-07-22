package testcases;

import org.testng.annotations.*;

import com.thoughtworks.selenium.DefaultSelenium;

public class TestCase1 {

	static void pause(long t){
		try {
			Thread.sleep(t);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	DefaultSelenium sel = null;
	
	@BeforeClass
	public void createInstance(){
		String ip = "localhost";
		int port = 4444;
		String browser = "*firefox";
		String url = "http://www.calculator.net";
		sel = new DefaultSelenium(ip, port, browser, url);
		sel.start();
		sel.open("/");
		sel.windowMaximize();
		sel.windowFocus();
	}
	@Test
	public void testCalc(){
		pause(5000L);
		sel.click("xpath=.//*[@id='hl1']/li[2]/a");
		sel.type("xpath=.//*[@id='cloanamount']", "50000");
		sel.type("xpath=.//*[@id='cloanterm']", "5");
		sel.type("xpath=.//*[@id='cloantermmonth']", "0");
		sel.type("xpath=.//*[@id='cinterestrate']", "6");
		sel.type("xpath=.//*[@id='ccompound']", "Quarterly");
		sel.type("xpath=.//*[@id='cpayback']", "Eery Quarter");
		sel.click("xpath=.//*[@id='calinputtable']/tbody/tr[7]/td/input");
		
		pause(100000L);
		
		String pe = sel.getText("xpath=.//*[@id='content']/div[3]/table/tbody/tr[1]/td[2]/b)");
		String totPayment = sel.getText("xpath=.//*[@id='content']/div[3]/table/tbody/tr[2]/td[2]/b");
		String totInterest = sel.getText("xpath=.//*[@id='content']/div[3]/table/tbody/tr[3]/td[2]/b");
		
		System.out.println("Monthly payment = " + pe);
		System.out.println("Total amount paid = " + totPayment);
		System.out.println("Total interest paid = " + totInterest);
	}
	
	@AfterClass
	public void stop(){
		sel.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}

}
