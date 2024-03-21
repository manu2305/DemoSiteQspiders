package KeyboardActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import DragAndDrop.BaseClass;

public class VirtualKeyElementPass extends BaseClass {
	//enter the password data by using virtual key
	@Test
	public void main() throws InterruptedException {
		String[]str= {"jmani@gmail.com","Mantop@2305","Mantop@2305"};
		driver.findElement(By.xpath("//section[text()='Keyboard Actions']")).click();	
		driver.findElement(By.xpath("//section[text()='Virtual Keyboard']")).click();
		driver.findElement(By.id("email")).sendKeys("jmani2305@gmail.com");
		driver.findElement(By.xpath("//div[@class='bg-blue-500 hover:bg-blue-700 text-white font-medium py-0.5 px-1 text-2xl rounded focus:outline-none focus:shadow-outline']")).click();
		List<WebElement> pass_data = driver.findElements(By.xpath("//div[@class='hg-row']/div"));
		WebElement password = driver.findElement(By.id("password"));
		password.click();
		int i=0;
		for (WebElement web : pass_data) {
			if(i>3) {
				break;
			}
			else {
			web.click();
			i++;}
		}
	}
}
