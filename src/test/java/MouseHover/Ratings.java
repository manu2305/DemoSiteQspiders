package MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import DragAndDrop.BaseClass;

public class Ratings extends BaseClass {
	//mouse mover to the Ratings
	@Test
	public void main() {
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();	
		driver.findElement(By.xpath("//section[text()='Mouse Hover']")).click();
		driver.findElement(By.xpath("//a[text()='Ratings']")).click();
		WebElement rating = driver.findElement(By.xpath("//div[@class='flex justify-center pt-2']/label[5]"));
		Actions act = new Actions(driver);
		act.moveToElement(rating).build().perform();
	}
}
