package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Notifications extends Base_methods
{
	@Test
	public void notification() throws InterruptedException, AWTException
	   {
		   driver.findElement(By.linkText("Notifications")).click();
		   System.out.println("Notifications Button is clicked");
		   driver.findElement(By.id("browNotButton")).click();
		   Thread.sleep(2000);
		   Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			rbt.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			rbt.keyPress(KeyEvent.VK_ENTER);
			rbt.keyRelease(KeyEvent.VK_TAB);
			rbt.keyRelease(KeyEvent.VK_ENTER);
	   }
}
