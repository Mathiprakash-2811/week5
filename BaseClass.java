package testngassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {

	
	 public  ChromeDriver driver ;
	 
	 @Parameters({"url", "username", "password", "browser"}) 
		   
		   @BeforeMethod
		    public void preCondition(String url, String username, String password, String browser) {
		    driver  = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
		}
		   
		   @AfterMethod
		    public void postCondition() {
			driver.close();
		   }

}
