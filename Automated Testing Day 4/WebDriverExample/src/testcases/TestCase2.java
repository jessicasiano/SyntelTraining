package testcases;

import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.calculator.net");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
				
		//get the current URL
		String url = driver.getCurrentUrl();
		System.out.println("Current URL: " + url);
		
		//get the current title
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		//navigate to a different URL in the same window
		driver.navigate().to("http://www.google.com");
		
		//go back to the previous page
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		
		//get all of the links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement a : links){
			//System.out.println(a.getText() + "\t" + a.getAttribute("href"));
			if(a.getText().equalsIgnoreCase("Loan")){
				a.click();
				break;
			}
		}
		
		driver.close();


	}

}
