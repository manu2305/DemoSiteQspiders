package KeyboardActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import DragAndDrop.BaseClass;

public class EnterValueByActionsCLass extends BaseClass {
	@Test
	public void main() throws InterruptedException {
		String[]str= {"jmani@gmail.com","Mantop@2305","Mantop@2305"};
		driver.findElement(By.xpath("//section[text()='Keyboard Actions']")).click();	
		driver.findElement(By.xpath("//section[text()='Keyboard']")).click();
		 List<WebElement> fields = driver.findElements(By.xpath("//div[@class='mb-4']/input"));
		Actions act = new Actions(driver);
		int i=0;
		for (WebElement web : fields) {
			act.sendKeys(web, str[i++]).build().perform();
		}
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}

