package ClickAndHold;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import DragAndDrop.BaseClass;

public class CLickAndHold extends BaseClass {
	//click and hold the circle
	@Test
	public void main() throws InterruptedException {
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();	
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		 WebElement circle = driver.findElement(By.id("circle"));
		Actions act = new Actions(driver);
		act.clickAndHold(circle);
		
	}
}

