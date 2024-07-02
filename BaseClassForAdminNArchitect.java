package testngassignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.sun.java.swing.plaf.windows.resources.windows;

import io.github.sukgu.Shadow;

public class BaseClassForAdminNArchitect {
	
	 public  RemoteWebDriver driver ;
	
	
	@BeforeMethod
    public void precondition() throws InterruptedException {

	
    driver = new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
    driver.get("https://login.salesforce.com");
    
    driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
    
    driver.findElement(By.id("password")).sendKeys("testleaf@2024");
    
    driver.findElement(By.id("Login")).click();
    
    driver.findElement(By.xpath("//span[text()='Learn More']")).click();
    
    Set<String> windowhandles = driver.getWindowHandles();
    
    List<String> windows = new ArrayList<String>(windowhandles);
    driver.switchTo().window(windows.get(1));
    
    WebElement confirm = driver.findElement(By.xpath("//button[text()='Confirm']"));
    confirm.click();
    
    Shadow dom = new Shadow(driver);
    
    Thread.sleep(3000);
    WebElement learning = dom.findElementByXPath("//span[text()='Learning']");
    learning.click();	
    
    Thread.sleep(3000);
    Actions act = new Actions(driver);
    WebElement lot = dom.findElementByXPath("//span[text()='Learning on Trailhead']");
    act.moveToElement(lot).perform();
    
    WebElement sales = dom.findElementByXPath("//a[text()='Salesforce Certification']");
    driver.executeScript("arguments[0].click();",sales);
	 }
	
    @AfterMethod
    public void postcondition() {
    	
    	  driver.close();
       

}
}
