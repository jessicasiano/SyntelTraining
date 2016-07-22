package testcases;
import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver firefox = new FirefoxDriver();
		firefox.get("http://www.calculator.net");
		firefox.manage().window().maximize();
		//locator
		//sync
		firefox.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		//click on loan calculator link
		firefox.findElement(By.xpath("//*[@id='hl1']/li[2]/a")).click();
		//write data
		firefox.findElement(By.xpath("//*[@id='cloanamount']")).clear();
		firefox.findElement(By.xpath("//*[@id='cloanamount']")).sendKeys("50000");
		
		firefox.findElement(By.xpath("//*[@id='cloanterm']")).clear();
		firefox.findElement(By.xpath("//*[@id='cloanterm']")).sendKeys("5");
		
		firefox.findElement(By.xpath("//*[@id='cloantermmonth']")).clear();
		firefox.findElement(By.xpath("//*[@id='cloantermmonth']")).sendKeys("0");
		
		firefox.findElement(By.xpath("//*[@id='cinterestrate']")).clear();
		firefox.findElement(By.xpath("//*[@id='cinterestrate']")).sendKeys("6");
		//change the values of the dropdowns
		WebElement compoundDropdown = firefox.findElement(By.xpath("//*[@id='ccompound']"));
		Select comp = new Select(compoundDropdown);
		comp.selectByValue("quarterly");
		
		WebElement paybackDropdown = firefox.findElement(By.xpath("//*[@id='cpayback']"));
		Select payback = new Select(paybackDropdown);
		payback.selectByValue("quarter");
		
		//click on the button
		firefox.findElement(By.xpath("//*[@id='calinputtable']/tbody/tr[7]/td/input")).click();
		
		
		firefox.close();
	}

}
