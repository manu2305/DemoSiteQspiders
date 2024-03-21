package A_WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import DragAndDrop.BaseClass;

public class DisableToggleSelect extends BaseClass {
	@Test
	public void main() {
		driver.get("https://demoapps.qspiders.com/ui/toggle/disabled?sublist=1");
		List<WebElement> check_box = driver.findElements(By.xpath("//input[@type='checkbox']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for (WebElement web : check_box) {
			js.executeScript("arguments[0].click();", web);
		}
		driver.findElement(By.id("togglers")).click();
	}
}
