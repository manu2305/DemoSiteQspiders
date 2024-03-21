package DragAndDrop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ClickAndHold extends BaseClass {
@Test
public void clickAndHold() {
	driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
	driver.findElement(By.xpath("//a[text()='Drag Position']"));
	List<WebElement> accessories = driver.findElements(By.xpath("//div[@class='draggable']"));
	WebElement target1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
	WebElement target2 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
	Actions act = new Actions(driver);
	int i=0;
	for (WebElement web : accessories) {
		if(i%2==0) {
			act.clickAndHold(web).moveToElement(target1).release().build().perform();
		}
		else {
			act.clickAndHold(web).moveToElement(target2).release().build().perform();
		}
		i++;
	}
}
}
