package Scroll;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import DragAndDrop.BaseClass;

public class HorizontalScroll extends BaseClass {
	@Test
	public void main() {
		driver.get("https://demoapps.qspiders.com/ui/scroll/newHorizontal");
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		Set<String> child = driver.getWindowHandles();
		child.remove(parent);
		for (String str : child) {
			driver.switchTo().window(str);
		}
		Actions act=new Actions(driver);
		act.scrollByAmount(500, 0).build().perform();
	}
}
