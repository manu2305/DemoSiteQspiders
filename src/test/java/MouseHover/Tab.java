package MouseHover;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import DragAndDrop.BaseClass;

public class Tab extends BaseClass {

	//mouse mover to Product links
	@Test
	public void main() throws InterruptedException {
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();	
		driver.findElement(By.xpath("//section[text()='Mouse Hover']")).click();
		driver.findElement(By.xpath("//a[text()='Tab']")).click();
		 List<WebElement> products = driver.findElements(By.xpath("//div[@class='bg-slate-800 h-10']/ul/li"));
		Actions act = new Actions(driver);
		for (WebElement web : products) {
			act.moveToElement(web).build().perform();
		}
	}
}

