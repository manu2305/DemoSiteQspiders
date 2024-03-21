package A_WebElement;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DragAndDrop.BaseClass;

public class TableWithSort1 extends BaseClass {
	String tablewithsort_givenurl ="https://demoapps.qspiders.com/ui/table/tableSort";
	@Test
	public void ExecuteWebTable() { 
				driver.navigate().to("https://demoapps.qspiders.com/ui/alert?sublist=0");
				driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		//Verify the WebTable
				driver.findElement(By.xpath("//a[text()='Table With Sort']")).click();
				String tablewithsort_currenturl = driver.getCurrentUrl();
				assertEquals(tablewithsort_givenurl,tablewithsort_currenturl);
				System.out.println("table with sort page is opened"); 
		// sort the table by clicking of item name
			driver.findElement(By.xpath("//section[text()='Item Name']")).click();
			//get the data of the cell
			String data = driver.findElement(By.xpath("//th[text()='APPLEIPhone']")).getText();
			System.out.println(data);
		// Get all the rows in the table body
				List<WebElement> rows = driver.findElements(By.xpath("//tr/../tr"));
					
				    for (WebElement row : rows) {
				       
				        System.out.println(row.getText());
				    }	
}
}
