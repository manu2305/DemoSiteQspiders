package KeyboardActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import DragAndDrop.BaseClass;

public class CopyPasswordValueAndPaste extends BaseClass {
	String value;
	@Test
	public void main() throws InterruptedException {
		
		driver.findElement(By.xpath("//section[text()='Keyboard Actions']")).click();	
		driver.findElement(By.xpath("//section[text()='Keyboard']")).click();
		 List<WebElement> fields = driver.findElements(By.xpath("//div[@class='mb-4']/input"));
		Actions act = new Actions(driver);
		int i=0;
		for (WebElement web : fields) {
			switch (i) {
			case 0:{
				act.sendKeys(web, "jmani@gmail.com").build().perform();
			}break; 
			case 1:{
				act.sendKeys(web, "Mantop@2305").build().perform();
				value=web.getAttribute("value");
			}break; 
			case 2:{
				act.sendKeys(web, value).build().perform();
			}break; 
			}
			i++;
		}
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
