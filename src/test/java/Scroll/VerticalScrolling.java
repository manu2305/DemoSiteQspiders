package Scroll;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import DragAndDrop.BaseClass;

public class VerticalScrolling extends BaseClass {
	@Test
	public void main() {
		driver.get("https://demoapps.qspiders.com/ui/scroll");
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		Set<String> child = driver.getWindowHandles();
		child.remove(parent);
		for (String str : child) {
			driver.switchTo().window(str);
		}
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 1000).build().perform();
	}
}
