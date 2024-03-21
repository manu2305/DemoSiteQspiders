package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Modal extends Base_methods 
{
	@Test
	public void modal()
	   {
		   driver.findElement(By.linkText("Modal")).click();
		   System.out.println("modal Button is clicked");
		   
		   wait.until(ExpectedConditions.elementToBeClickable(By.id("modal1"))).click();
		   WebElement close =wait.until(ExpectedConditions.elementToBeClickable(By.id("closeModal")));
		   close.click();
		   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Multiple Modal')]"))).click();
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("multiModalButton"))).click();
		   wait.until(ExpectedConditions.elementToBeClickable(By.id("multiClosemodal"))).click();
		   WebElement secondary_popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'secondary Modal')]")));
		   if(secondary_popup.isDisplayed())
		   {
			   System.out.println("secondary modal popup is displayed");
			   driver.findElement(By.xpath("//button[text()='close']")).click();
		   }
		   else
			   System.out.println("secondary modal popup is not displayed");
		  
	   }
}
