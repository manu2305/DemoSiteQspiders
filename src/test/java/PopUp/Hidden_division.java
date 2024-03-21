package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Hidden_division extends Base_methods
{    
	@Test
	public void hidden() throws InterruptedException
	   {
		   driver.findElement(By.partialLinkText("Hidden")).click();
		   System.out.println("Hidden Button is clicked");
		 
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='text']"))).sendKeys("Harman");
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='email']"))).sendKeys("harman28@gmail.com");
		   WebElement product_dropdown =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Product']/../div/select")));
		   Select slt= new Select(product_dropdown);
		   slt.selectByIndex(1);
		   driver.findElement(By.xpath("//label[text()='Message']/../div/textarea")).sendKeys("Hii, product is selected");
		   driver.findElement(By.xpath("//button[text()='Submit']")).click();
	   }
}
