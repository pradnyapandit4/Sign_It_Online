package org.signitonline.testcase;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.signitonline.utilities.Utilities;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LibrarySection extends BaseClass {

	By byLibs = By.xpath("//div[1]/div[1]/ul[1]/li[2]/a[1]/img[1]");
	By byDSDrp = By.xpath("//span[contains(text(),'Docket Status')]");
	By byDraD = By.xpath("//span[contains(text(),'Draft')]");
	By byIPD = By.xpath("//li[contains(text(),'InProgress')]");
	By bySiD = By.xpath("//li[contains(text(),'Signed')]");
	By byCanD = By.xpath("//li[contains(text(),'Cancelled')]");
	By byExpD = By.xpath("//li[contains(text(),'Expired')]");
	By bySFS = By.xpath("//li[contains(text(),'Sent for signing')]");
	By byRej = By.xpath("//li[contains(text(),'Rejected')]");
	By byFBN = By.name("namefilter");
	By byFBE = By.id("emailfilter");
	By byFD = By.id("fromdate");
	By byFDS = By.xpath("//a[contains(text(),'21')]");
	By byTD = By.id("todate");
	By byTDS = By.xpath("//a[contains(text(),'30')]");
	By byDS = By.id("docket_search");
	By byDSB = By.id("docket_search_btn");
	By byCFB = By.id("btn-filter");
	
	@Test(groups = {"AllTest","LibrarySection"})
	public void librarySection() throws InterruptedException
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		
		Reporter.log("Land on SignIt Online Dashboard", true);
		
		Utilities.hardWait(3);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byLibs));  //Library Section
		driver.findElement(byLibs).click();
		
		Utilities.hardWait(3);
		
		//Docket Status 
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byDSDrp));
		driver.findElement(byDSDrp).click();
		
		Utilities.hardWait(3);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byDraD));  //Draft
		driver.findElement(byDraD).click();
		
		Utilities.hardWait(3);
		
		driver.navigate().to("https://www.apps.signitonline.co.uk/index.php/signIt/library");
		Thread.sleep(4000);
		
		//Docket Status 
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byDSDrp));
		driver.findElement(byDSDrp).click();
		
		Utilities.hardWait(3);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byIPD));    //Inprogress Docket
		driver.findElement(byIPD).click();
		
		Utilities.hardWait(3);
		
		driver.navigate().to("https://www.apps.signitonline.co.uk/index.php/signIt/library");
		Thread.sleep(4000);
		
		//Docket Status 
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byDSDrp));
		driver.findElement(byDSDrp).click();
		
		Utilities.hardWait(3);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(bySiD));    //Signed Docket
		driver.findElement(bySiD).click();
		
		Utilities.hardWait(3);
		
		driver.navigate().to("https://www.apps.signitonline.co.uk/index.php/signIt/library");
		Thread.sleep(4000);
		
		//Docket Status 
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byDSDrp));
		driver.findElement(byDSDrp).click();
		
		Utilities.hardWait(3);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byCanD));    //Cancelled Docket
		driver.findElement(byCanD).click();
		
		Utilities.hardWait(3);
		
		driver.navigate().to("https://www.apps.signitonline.co.uk/index.php/signIt/library");
		Thread.sleep(4000);
		
		//Docket Status 
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byDSDrp));
		driver.findElement(byDSDrp).click();
		
		Utilities.hardWait(3);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byExpD));    //Expired Docket
		driver.findElement(byExpD).click();
		
		Utilities.hardWait(3);
		
		driver.navigate().to("https://www.apps.signitonline.co.uk/index.php/signIt/library");
		Thread.sleep(4000);
		
		//Docket Status 
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byDSDrp));
		driver.findElement(byDSDrp).click();
		
		Utilities.hardWait(3);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(bySFS));    //Sent for Signing
		driver.findElement(bySFS).click();
		
		Utilities.hardWait(3);
		
		driver.navigate().to("https://www.apps.signitonline.co.uk/index.php/signIt/library");
		Thread.sleep(4000);
		
		//Docket Status 
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byDSDrp));
		driver.findElement(byDSDrp).click();
		
		Utilities.hardWait(3);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byRej));    //Rejected
		driver.findElement(byRej).click();
		
		Utilities.hardWait(3);
		
		//Filter by Name
		driver.navigate().to("https://www.apps.signitonline.co.uk/index.php/signIt/library");
		Thread.sleep(4000);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byFBN));
		driver.findElement(byFBN).sendKeys("Pradnya");
		
		Utilities.hardWait(3);
		
		//Filter by Email
		driver.navigate().to("https://www.apps.signitonline.co.uk/index.php/signIt/library");
		Thread.sleep(4000);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byFBE));
		driver.findElement(byFBE).sendKeys("pradnyapandit4@gmail.com");
		
		Utilities.hardWait(3);
		
		//From Date
		driver.navigate().to("https://www.apps.signitonline.co.uk/index.php/signIt/library");
		Thread.sleep(4000);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byFD));
		driver.findElement(byFD).click();
		
		Utilities.hardWait(3);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byFDS));
		driver.findElement(byFDS).click();
		
		Utilities.hardWait(3);
		
		//To Date
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byTD));
		driver.findElement(byTD).click();
		
		Utilities.hardWait(3);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byTDS));
		driver.findElement(byTDS).click();
		
		Utilities.hardWait(3);
		
		//Docket Search
		driver.navigate().to("https://www.apps.signitonline.co.uk/index.php/signIt/library");
		Thread.sleep(4000);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byDS));
		driver.findElement(byDS).sendKeys("pdf1");
		
		Utilities.hardWait(3);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byDSB));
		driver.findElement(byDSB).click();
		
		Utilities.hardWait(3);
		
		//clear filter
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byCFB));
		driver.findElement(byCFB).click();

	}
	
}
