package A_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import DragAndDrop.BaseClass;

public class SelectCheckBox extends BaseClass {
@Test
public void main() {
	driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
	WebElement email = driver.findElement(By.id("domain1"));
	if(email.isEnabled()) {
		System.out.println("yes");
		if(email.isSelected()) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
			email.click();
		}
	}
	else {
		System.out.println("no");
	}

}
}
