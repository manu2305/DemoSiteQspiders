package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base_methods 
{
	 WebDriver driver=new ChromeDriver();
	 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
	   @BeforeSuite
	   public void beforeSuite() {
		   System.out.println("Before Suite");
	   }
	  @BeforeTest 
	   public void beforeTest() {
		   System.out.println("Before Test");
	   }
	   @BeforeClass
	   public void beforeClass() {
		   System.out.println("Before Class");
		      driver.manage().window().maximize();
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		      driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		      Reporter.log("i am in Qspiders app");
	   }
	   @BeforeMethod
	   public void beforeMethod() 
	   {
		 WebElement popUp = driver.findElement(By.xpath("//section[contains(text(),'Popups')]"));
	     popUp.click();
	   }
	  
	   
	   @AfterMethod
	   public void afterMethod()
	   {
		   System.out.println("After method");
		   driver.navigate().back();
	   }
	   @AfterClass
	   public void afterClass()
	   {
		   System.out.println("after class");
		   driver.close();
	   }
	   @AfterTest
	   public void afterTest()
	   {
		   System.out.println("after test");
	   }
	   @AfterSuite
	   public void afterSuite()
	   {
		   System.out.println("Aftersuite");
	   }
}
