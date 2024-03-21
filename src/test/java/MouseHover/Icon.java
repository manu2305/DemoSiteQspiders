package MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import DragAndDrop.BaseClass;

public class Icon extends BaseClass {
@Test
public void main() {
	driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();	
	driver.findElement(By.xpath("//section[text()='Mouse Hover']")).click();
	WebElement text_field = driver.findElement(By.xpath("//input[@type='password']"));
	Actions act = new Actions(driver);
	act.moveToElement(text_field).click().sendKeys("manikandan").build().perform();
}
}
