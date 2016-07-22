package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLoanCalc {
	public POMLoanCalc(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='cloanamount']")
	public WebElement loanAmount;
	
	@FindBy(xpath="//*[@id='cloanterm']")
	public WebElement loanTerm;
	
	@FindBy(xpath="//*[@id='cloantermmonth']")
	public WebElement loanMonths;
	
	@FindBy(xpath="//*[@id='cinterestrate']")
	public WebElement interestRate;
	
	@FindBy(xpath="//*[@id='ccompound']")
	public WebElement interestCompound;
	
	@FindBy(xpath="//*[@id='cpayback']")
	public WebElement interestPayback;
	
	@FindBy(xpath="//*[@id='calinputtable']/tbody/tr[7]/td/input")
	public WebElement calcButton;
}
