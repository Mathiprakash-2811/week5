package testngassignment;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class EditLead extends BaseClass {
	
	 @DataProvider(name="getnewValue")
	    
	 public String[][] fetchdata() throws IOException  {
		 
	  return PhnoExcel.readExcel();
		

	 }
	
				
      @Test(dataProvider ="getnewValue")

		
		public  void editLead(String Phno) throws InterruptedException {
	
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(Phno);
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			driver.findElement(By.linkText("Edit")).click();
			WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
			companyName.clear();
			companyName.sendKeys("TCS");
			driver.findElement(By.name("submitButton")).click();
			String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
			if (text.contains("TCS")) {
				System.out.println("Lead is editted successfully");
			}
			else {
				System.out.println("Lead is not editted");
			}
			


	}

}
