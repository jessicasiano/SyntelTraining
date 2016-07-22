package testcases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase4 {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/jessi/Dropbox/Syntel/Frames/frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		driver.switchTo().frame("l1");
		driver.findElement(By.linkText("Calculator")).click();
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("c1");
		driver.findElement(By.linkText("Loan")).click();

	}
}