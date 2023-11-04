package org.signitonline.testcase;

import java.time.Duration;
import java.util.List;
import org.testng.annotations.Test;
import org.signitonline.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Users extends BaseClass {

	By byusers = By.xpath("//div[1]/div[1]/ul[1]/li[6]/a[1]/img[1]");
	By byANUM = By.xpath("//a[@tooltip='Add New User Master']/i[@class='fa fa-plus-circle fa-fw']");
	By byFName = By.id("FullName");
	By byUName = By.id("UserName");
	By byEmail = By.id("RegEmail");
	By byPass = By.id("Password");
	By bySaveB = By.id("main");
	By bySAA = By.xpath("//button[contains(text(),'Save And Add')]");
	By byCancel = By.xpath("//a[contains(text(),'Cancel')]");
	
	@Test
	public void User_Master()
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byusers));    //Users section
		driver.findElement(byusers).click();
		
		//Add New User Master
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byANUM));    
		driver.findElement(byANUM).click();
		
		//Full Name
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byFName));    
		driver.findElement(byFName).sendKeys("Pradnya Pandit");
		
		//User Name
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byUName));    
		driver.findElement(byUName).sendKeys("PPradnya");
		
		//Email
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byEmail));    
		driver.findElement(byEmail).sendKeys("pradnyapandit4@gmail.com");
		
		//Password
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byPass));    
		driver.findElement(byPass).sendKeys("pradnya@123");
		
		//Save button
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(bySaveB));    
		driver.findElement(bySaveB).click();
		
		//Save and add button
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(bySAA));    
//		driver.findElement(bySAA).click();
		
		//Cancel button
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byCancel));    
//		driver.findElement(byCancel).click();
		
		System.out.println("Success! Successfully Added User Master");
		
		//Activate Suspended User
		List<WebElement> tableData = driver.findElements(By.xpath("//tbody/tr/td[@class=' select-checkbox']"));
		
		int size = tableData.size();
		Utilities.hardWait(5);
		
		for(int i = 0; i<size;)
		{
				tableData.get(i).click();
				Utilities.hardWait(5);
				driver.findElement(By.xpath("//button[1]/i[@class='fa fa-check fa-fw']")).click();
				Utilities.hardWait(4);
				break;
			
		}
		System.out.println("Success! Activated Suspended User(s)");
		
		//Activate User
		List<WebElement> tableData2 = driver.findElements(By.xpath("//tbody/tr/td[@class=' select-checkbox']"));
		
		int size2 = tableData2.size();
		Utilities.hardWait(5);
		
		for(int i = 0; i<size2;)
		{
				tableData2.get(i).click();
				Utilities.hardWait(5);
				driver.findElement(By.xpath("//button[2]/i[@class='fa fa-thumbs-o-up fa-fw']")).click();
				Utilities.hardWait(4);
				break;
			
		}
		System.out.println("Success! Successfully Activate User(s)");
		
		//Deactivate User
		List<WebElement> tableData3 = driver.findElements(By.xpath("//tbody/tr/td[@class=' select-checkbox']"));
		
		int size3 = tableData3.size();
		Utilities.hardWait(5);
		
		for(int i = 0; i<size3;)
		{
				tableData3.get(i).click();
				Utilities.hardWait(5);
				driver.findElement(By.xpath("//button[3]/i[@class='fa fa-thumbs-o-down fa-fw']")).click();
				Utilities.hardWait(4);
				break;
			
		}
		System.out.println("Success! Successfully Deactivate User(s)");
		
		//Delete Selected
		List<WebElement> tableData4 = driver.findElements(By.xpath("//tbody/tr/td[@class=' select-checkbox']"));
		
		int size4 = tableData4.size();
		Utilities.hardWait(5);
		
		for(int i = 0; i<size4;)
		{
				tableData4.get(i).click();
				Utilities.hardWait(5);
				driver.findElement(By.xpath("//button[4]/i[@class='fa fa-trash fa-fw']")).click();
				Utilities.hardWait(4);
				break;
			
		}
		
		System.out.println("Record deleted successfully...");
		
	}
	
}
