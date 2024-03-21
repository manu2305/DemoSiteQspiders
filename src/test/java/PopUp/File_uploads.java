package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class File_uploads extends Base_methods
{
	@Test
	public void Default()
	   {
		   driver.findElement(By.partialLinkText("File")).click();
		   System.out.println("file uploads Button is clicked");
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fileInput"))).sendKeys("C:\\Users\\Compaq\\Documents\\Data.xlsx");
		    System.out.println("File is uploaded");
		   }
	
}
