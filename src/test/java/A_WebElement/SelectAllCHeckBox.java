package A_WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import DragAndDrop.BaseClass;

public class SelectAllCHeckBox extends BaseClass{
@Test
public void main() {
	driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
	List<WebElement> check_box = driver.findElements(By.xpath("//input[@type='checkbox']"));
	for (WebElement web : check_box) {
		web.click();
	}
	driver.findElement(By.id("mode6")).click();
}
}
