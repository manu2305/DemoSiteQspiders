package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import DragAndDrop.BaseClass;

public class SwitchTheControllerTodefault extends BaseClass {
	@Test
	public void main() {
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(frame);
		WebElement data = driver.findElement(By.id("username"));	
		data.sendKeys("manikandan");
		driver.switchTo().defaultContent();
	}
}
