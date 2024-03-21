package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import DragAndDrop.BaseClass;

public class MutipleDataPassing extends BaseClass {
	//transfer control from one frame to another
	@Test
	public void execute() {
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		WebElement frame1 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
		driver.switchTo().frame(frame1);
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("manikandan");
	    driver.switchTo().parentFrame();
		WebElement frame2 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("lasan@gmail.com");
	}
}
