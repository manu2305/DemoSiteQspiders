package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class javaScript extends Base_methods 
{
   @Test
   public void javaS()
   {
	   driver.findElement(By.linkText("Javascript")).click();
	   System.out.println("javaScript Button is clicked");
	   WebElement alert_button = wait.until(ExpectedConditions.elementToBeClickable(By.id("buttonAlert2")));
	   alert_button.click();
	   System.out.println("Alert Button is clicked");
	   Alert alert_popup = driver.switchTo().alert();
	   alert_popup.accept();
	   System.out.println("Alert popup is handled");
	   driver.findElement(By.linkText("Confirm")).click();
	   wait.until(ExpectedConditions.elementToBeClickable(By.id("buttonAlert5"))).click();
	   Alert confirm_box_popup = driver.switchTo().alert();
	   confirm_box_popup.accept();
	   driver.findElement(By.linkText("Prompt")).click();
	   wait.until(ExpectedConditions.elementToBeClickable(By.id("buttonAlert1"))).click();
	   Alert prompt_checkbox_popup = driver.switchTo().alert();
	   prompt_checkbox_popup.sendKeys("yes");
	   prompt_checkbox_popup.accept();
   }
}
