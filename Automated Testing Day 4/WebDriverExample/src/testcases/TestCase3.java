package testcases;

import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/jessi/Desktop/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
		/*//get the table
		WebElement table = driver.findElement(By.tagName("table"));
		//get a list of all of the <tr> elements in the table
		List<WebElement> tr = table.findElements(By.tagName("tr"));
		List<WebElement> tableData = null;
		
		for(WebElement t : tr){
			tableData = t.findElements(By.tagName("th"));
			if(tableData.size() == 0){
				tableData = t.findElements(By.tagName("td"));
			}
			for(WebElement d : tableData)
				System.out.print(d.getText() + "\t");
			System.out.println();
		}
		
		List<WebElement> th = table.findElements(By.tagName("th"));
		List<WebElement> td = table.findElements(By.tagName("td"));
		List<WebElement> tableData = new ArrayList<WebElement>(th);
		tableData.addAll(td);
		
		for(WebElement t : th)
			System.out.print(t.getText() + "\t");
		System.out.println();
		for(WebElement t : td)
			System.out.print(t.getText() + "\t");*/	
		
		driver.findElement(By.linkText("Calculator")).click();
		
		Set<String> hwnd = driver.getWindowHandles();
		Object[] ids = hwnd.toArray();
		driver.switchTo().window(ids[1].toString());
				
		driver.findElement(By.linkText("Loan")).click();
		driver.close();
		driver.switchTo().window(ids[0].toString());
	}

}
