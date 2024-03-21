package A_WebElement;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import DragAndDrop.BaseClass;

public class DynamicWebTable extends BaseClass {
	String dynamic_table_givenurl ="https://demoapps.qspiders.com/ui/table/dynamicTable";
@Test
public void main() {
	driver.navigate().to("https://demoapps.qspiders.com/ui/alert?sublist=0");
	driver.findElement(By.xpath("//section[text()='Web Table']")).click();
//Verify the WebTable
	driver.findElement(By.xpath("//a[text()='Dynamic Web Table']")).click();
	String dynamic_table_currenturl = driver.getCurrentUrl();
	assertEquals(dynamic_table_givenurl,dynamic_table_currenturl);
	System.out.println("dynamic web table page is opened"); 
// Get a text of the cell
	WebElement cell = driver.findElement(By.xpath("//tbody[@class='w-full']/../tbody/tr/td[1]"));
	String cellValue = cell.getText();
	System.out.println(cellValue);
	// Get all the rows in the table body
	List<WebElement> rows = driver.findElements(By.xpath("//tbody[@class='w-full']/../tbody/tr"));
		
	    for (WebElement row : rows) {
	       
	        System.out.println(row.getText());
	    }

}
}
