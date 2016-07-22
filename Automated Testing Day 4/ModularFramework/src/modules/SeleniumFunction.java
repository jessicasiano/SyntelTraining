package modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SeleniumFunction {
	
	public static void openApp(WebDriver driver, String url){
		driver.get(url);
	}
	
	public static void click(WebDriver driver, String locator){
		driver.findElement(By.xpath(locator)).click();
	}
	
	public static void clickAt(WebDriver driver, String coord){
		
	}
	
	public static void type(WebDriver driver, String locator, String data){
		driver.findElement(By.xpath(locator)).sendKeys(data);
	}
	
	public static void select(WebDriver driver, String locator, String data){
		WebElement dropdown = driver.findElement(By.xpath(locator));
		Select comp = new Select(dropdown);
		comp.selectByVisibleText(data);
	}
	
	public static void sync(WebDriver driver, long timeout){
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.MILLISECONDS);
	}
	
	public static void clear(WebDriver driver, String locator){
		driver.findElement(By.xpath(locator)).clear();
	}

}
