package testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/jessi/Dropbox/Syntel/Frames/alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.xpath("html/body/input[1]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.id("t1")).sendKeys("Button was clicked");
	}

}
