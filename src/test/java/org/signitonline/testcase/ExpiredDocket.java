package org.signitonline.testcase;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExpiredDocket extends BaseClass {

	By byLibs = By.xpath("//div[1]/div[1]/ul[1]/li[2]/a[1]/img[1]");
	By byDSDrp = By.xpath("//span[contains(text(),'Docket Status')]");
	By byIPD = By.xpath("//li[contains(text(),'InProgress')]");
	By byEDB = By.xpath("//div[1]/div[3]/div[2]/div[6]/a[3]/img[1]");
	By byENB = By.xpath("//button[@class='btn btn-sm expireNow']");
	By byCF = By.id("btn-filter");
	By byED = By.xpath("//li[contains(text(),'Expired')]");
	
	@Test
	public void expired_docket_Expirenowbutton()
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byLibs));    //library section
		driver.findElement(byLibs).click();
		
		//Docket Status Dropdown
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byDSDrp));
		driver.findElement(byDSDrp).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byIPD));    //Inprogress Docket
		driver.findElement(byIPD).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byEDB));    //Expire Docket button
		driver.findElement(byEDB).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byENB));    //Expire Now button
		driver.findElement(byENB).click();
		
		System.out.println("Docket has been Expired!!");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byCF));    //Clear filter
		driver.findElement(byCF).click();
		
		//Docket Status Dropdown
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byDSDrp));
		driver.findElement(byDSDrp).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byED));    //Expire Docket 
		driver.findElement(byED).click();
		
	}
	
}
