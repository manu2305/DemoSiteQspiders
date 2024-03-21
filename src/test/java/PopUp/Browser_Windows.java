package PopUp;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Browser_Windows extends Base_methods
{
	@Test(priority = 0)
	   public void browser() throws InterruptedException
	   {
	       
		   driver.findElement(By.partialLinkText("Browser")).click();
		   System.out.println("Browser_windows Button is clicked");
		   String parent = driver.getWindowHandle();
		   WebElement open_button = wait.until(ExpectedConditions.elementToBeClickable(By.id("browserLink1")));
		   open_button.click();
		   System.out.println("new window is opened");
		   
		   Set<String> handles = driver.getWindowHandles();
		   handles.remove(parent);
		   for (String str : handles) 
		   {
			driver.switchTo().window(str);
			WebElement signup_title = driver.findElement(By.xpath("//h2[contains(text(),'Sign Up')]"));
			if(signup_title.isDisplayed())
			{
				System.out.println("handle is swithced");
				driver.findElement(By.id("email")).sendKeys("harman1999@gmail.com");
				driver.findElement(By.id("password")).sendKeys("harman@123");
				driver.findElement(By.id("confirm-password")).sendKeys("harman@123");
	         
			}
		   }
	   }
	    @Test(priority = 1)
	    public void newTab()
	    {
	    	wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Browser"))).click();
			   System.out.println("Browser_windows Button is clicked");
	    	String parent = driver.getWindowHandle();
	    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'New Tab')]"))).click();
	    	wait.until(ExpectedConditions.elementToBeClickable(By.id("browserButton4"))).click();
		   Set<String> handless = driver.getWindowHandles();
		   handless.remove(parent);
		   for (String str : handless) 
		   {
			driver.switchTo().window(str);
			WebElement signup_title = driver.findElement(By.xpath("//h2[contains(text(),'Sign Up')]"));
			if(signup_title.isDisplayed())
			{
				System.out.println("handle is swithced");
				driver.findElement(By.id("email")).sendKeys("harman1999@gmail.com");
				driver.findElement(By.id("password")).sendKeys("harman@123");
				driver.findElement(By.id("confirm-password")).sendKeys("harman@123");
				driver.findElement(By.cssSelector("button[type='submit']")).click();
			}
			
			else
				System.out.println("handle is not swithced");
		   }
		   
		   
		   
	   }
}

