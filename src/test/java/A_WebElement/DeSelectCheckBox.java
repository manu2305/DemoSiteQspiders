package A_WebElement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import DragAndDrop.BaseClass;

public class DeSelectCheckBox extends BaseClass {
	@Test
	public void main() {
		driver.get("https://demoapps.qspiders.com/ui/checkbox/selected?sublist=1");
		WebElement email = driver.findElement(By.id("domain1"));
		email.click();

	}
}
