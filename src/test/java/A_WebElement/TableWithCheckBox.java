package A_WebElement;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import DragAndDrop.BaseClass;

public class TableWithCheckBox extends BaseClass {
	String tableWithCheck_givenurl ="https://demoapps.qspiders.com/ui/table/tableWithCheck";
@Test
public void main() {
	driver.navigate().to("https://demoapps.qspiders.com/ui/alert?sublist=0");
	driver.findElement(By.xpath("//section[text()='Web Table']")).click();
//Verify the WebTable
	driver.findElement(By.xpath("//a[text()='Table With Checkbox']")).click();
	String tableWithCheck_currenturl = driver.getCurrentUrl();
	assertEquals(tableWithCheck_givenurl,tableWithCheck_currenturl);
	System.out.println("table with checkbox page is opened");

//get the data of the cell
	String data = driver.findElement(By.xpath("//td[text()='HP Envy']")).getText();
System.out.println(data);
// select checkbox hp envy and verify that it is selected
WebElement hp_envy = driver.findElement(By.xpath("//td[@class='px-4']/../../tr[4]/td/input"));
hp_envy.click();
assertTrue(hp_envy.isSelected());
System.out.println("hp envy is selected");
//verify that "remove checked rows"button is enable after select the checkbox
WebElement remove_checked_button = driver.findElement(By.xpath("//button[text()='Remove Checked Rows']"));
assertTrue(remove_checked_button.isEnabled());
System.out.println("remove checked row button is enabled");
// Get all the rows in the table body
	List<WebElement> rows = driver.findElements(By.xpath("//tr/../tr"));
		
	    for (WebElement row : rows) {
	       
	        System.out.println(row.getText());
	    }

}
}
