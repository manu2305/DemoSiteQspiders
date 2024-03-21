package A_WebElement;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import DragAndDrop.BaseClass;

public class TableWithPagination extends BaseClass {
	String table_pagination_givenurl ="https://demoapps.qspiders.com/ui/table/tablePagination";
@Test
public void main() {
	driver.navigate().to("https://demoapps.qspiders.com/ui/alert?sublist=0");
	driver.findElement(By.xpath("//section[text()='Web Table']")).click();
//Verify the WebTable
	driver.findElement(By.xpath("//a[text()='Table Pagination']")).click();
	String table_pagination_currenturl = driver.getCurrentUrl();
	assertEquals(table_pagination_givenurl,table_pagination_currenturl);
	System.out.println("table_pagination page is opened"); 


//get the data of the cell from 3rd page 
	List<WebElement> page=driver.findElements(By.xpath("//li[text()='1']/../li"));
for (WebElement web : page) {
	web.click();
}
	String data = driver.findElement(By.xpath("//th[text()='Denim']")).getText();
System.out.println(data);
// Get all the rows in the table body
	List<WebElement> rows = driver.findElements(By.xpath("//tr/../tr"));
		
	    for (WebElement row : rows) {
	       
	        System.out.println(row.getText());
	    }

}
}
