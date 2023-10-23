package org.signitonline.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LibrarySection extends BaseClass {

	@Test(groups = {"AllTest","LibrarySection"})
	public void librarySection() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[1]/div[1]/ul[1]/li[2]/a[1]/img[1]")).click();
		Thread.sleep(4000);
		
		//Docket Status 
		WebElement drp = driver.findElement(By.xpath("//span[contains(text(),'Docket Status')]"));
		drp.click();
		Thread.sleep(4000);
		
		WebElement dsts = driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]"));  //Draft
		Thread.sleep(4000);
		dsts.click();
		
		driver.navigate().to("https://www.apps.signitonline.co.uk/index.php/signIt/library");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Docket Status')]")).click();
		Thread.sleep(2000);
		
		WebElement dsts1 = driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]"));  //in progress
		Thread.sleep(4000);
		dsts1.click();
		
		driver.navigate().to("https://www.apps.signitonline.co.uk/index.php/signIt/library");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Docket Status')]")).click();
		Thread.sleep(2000);
		
		WebElement dsts2 = driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]"));  //Signed
		Thread.sleep(4000);
		dsts2.click();
		
		driver.navigate().to("https://www.apps.signitonline.co.uk/index.php/signIt/library");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Docket Status')]")).click();
		Thread.sleep(2000);
		
		WebElement dsts3 = driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]"));  //Cancelled
		Thread.sleep(4000);
		dsts3.click();
		
		driver.navigate().to("https://www.apps.signitonline.co.uk/index.php/signIt/library");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Docket Status')]")).click();
		Thread.sleep(2000);
		
		WebElement dsts4 = driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div[1]/ul[1]/li[6]"));  //Expired
		Thread.sleep(4000);
		dsts4.click();
		
		driver.navigate().to("https://www.apps.signitonline.co.uk/index.php/signIt/library");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Docket Status')]")).click();
		Thread.sleep(2000);
		
		WebElement dsts5 = driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div[1]/ul[1]/li[7]"));  //Sent for Signing
		Thread.sleep(4000);
		dsts5.click();
		
		driver.navigate().to("https://www.apps.signitonline.co.uk/index.php/signIt/library");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Docket Status')]")).click();
		Thread.sleep(2000);
		
		WebElement dsts6 = driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]"));  //Rejected
		Thread.sleep(4000);
		dsts6.click();
		
		//Filter by Name
		driver.navigate().to("https://www.apps.signitonline.co.uk/index.php/signIt/library");
		Thread.sleep(4000);
		
		driver.findElement(By.id("namefilter")).sendKeys("Pradnya");
		Thread.sleep(4000);
		
		//Filter by Email
		driver.navigate().to("https://www.apps.signitonline.co.uk/index.php/signIt/library");
		Thread.sleep(4000);
		
		driver.findElement(By.id("emailfilter")).sendKeys("pradnyapandit4@gmail.com");
		Thread.sleep(4000);
		
		//From Date
		driver.navigate().to("https://www.apps.signitonline.co.uk/index.php/signIt/library");
		Thread.sleep(4000);
		
		WebElement fdate = driver.findElement(By.id("fromdate"));
		fdate.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'21')]")).click();
		Thread.sleep(3000);
		
		//To Date
		WebElement tdate = driver.findElement(By.id("todate"));
		tdate.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'31')]")).click();
		Thread.sleep(5000);
		
		//Docket Search
		driver.navigate().to("https://www.apps.signitonline.co.uk/index.php/signIt/library");
		Thread.sleep(4000);
		
		driver.findElement(By.id("docket_search")).sendKeys("pdf1");
		driver.findElement(By.id("docket_search_btn")).click();
		Thread.sleep(2000);
		
		//clear filter
		driver.findElement(By.id("btn-filter")).click();
		Thread.sleep(2000);

	}
	
}
