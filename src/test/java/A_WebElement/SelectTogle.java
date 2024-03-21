package A_WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import DragAndDrop.BaseClass;

public class SelectTogle extends BaseClass {
	@Test
	public void main() {
		driver.get("https://demoapps.qspiders.com/ui/toggle?sublist=0");
		List<WebElement> check_box = driver.findElements(By.xpath("//input[@type='checkbox']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for (WebElement web : check_box) {
			js.executeScript("arguments[0].click();", web);
		}
		driver.findElement(By.id("mode6")).click();
	}
}
