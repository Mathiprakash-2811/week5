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

public class ArchitectCertification extends BaseClassForAdminNArchitect {

	@Test
	public  void architect() throws InterruptedException {

        
        Thread.sleep(3000);
        WebElement role = driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[2]"));
        driver.executeScript("arguments[0].click()", role);
        
        String summary = driver.findElement(By.xpath("//div[contains(text(),'Salesforce Architects are big-picture thinkers')]")).getText();
        System.out.println(summary);
        
        List<WebElement> totalarchitect = driver.findElements(By.xpath("//div[text()='Certification']"));
        int totalcourses = totalarchitect.size();
        System.out.println("Total courses for architect : " + totalcourses);
        
        driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
        
        List<WebElement> apparchitect = driver.findElements(By.xpath("//div[text()='Certification']"));
        int totalappcourses = apparchitect.size();
        System.out.println("Total courses for architect : " + totalappcourses);
        

	}

}
