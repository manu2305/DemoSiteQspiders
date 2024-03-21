package DragAndDrop;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	 public WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));	
@BeforeClass
public void preCondition() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}
@BeforeMethod
public void beforeMethod() {
	driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
	System.out.println("welcome to Demo Site Qspiders.....");
}
@AfterMethod
public void afterMethod() {
System.out.println("Thank you for using Demo site Qspiders....");	
}
@AfterClass
public void afterClass() {
	//driver.quit();
}
}


















