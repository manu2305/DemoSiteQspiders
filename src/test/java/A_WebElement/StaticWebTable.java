package A_WebElement;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import DragAndDrop.BaseClass;

public class StaticWebTable extends BaseClass {
	String table_givenurl = "https://demoapps.qspiders.com/ui/table";
@Test
public void main() {
	driver.navigate().to("https://demoapps.qspiders.com/ui/alert?sublist=0");
	driver.findElement(By.xpath("//section[text()='Web Table']")).click();
	// Verify the WebTable
	String table_currenturl = driver.getCurrentUrl();
	assertEquals(table_givenurl, table_currenturl);
	System.out.println("web table page is opened");
	// Get the text of the cell
	WebElement cell = driver.findElement(By.xpath("//th[contains(text(),'Levis Shirt')]"));
	String cellValue = cell.getText();
	System.out.println(cellValue);
	// Get All data from the columns
	List<WebElement> rows = driver.findElements(By.xpath("//tr/../tr"));
	for (WebElement row : rows) {
		System.out.println(row.getText());
	}
}
}
