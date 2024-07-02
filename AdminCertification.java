package testngassignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class AdminCertification extends BaseClassForAdminNArchitect {

	@Test
	public  void admin() throws InterruptedException {

          
          driver.findElement(By.xpath("//a[text()='Administrator']")).click();
          
          List<WebElement> totalarchitect = driver.findElements(By.xpath("//div[text()='Certification']"));
          int totalcourses = totalarchitect.size();
          System.out.println("Total courses for admin : " + totalcourses);
          
          }

}
