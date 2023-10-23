package org.signitonline.testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TopMenuItems extends BaseClass {

	By byAdSign = By.id("adapt_sign");
	By byANS = By.xpath("//button[contains(text(),'Adopt New Sign')]");
	By byEFN = By.id("partyFullName");
	By byCSign = By.xpath("//div[1]/div[1]/div[1]/label[1]/span[1]");
	By bySSign = By.xpath("//div[3]/button[3]");
	By byCB = By.id("wallet");
	By byCloseb = By.xpath("//button[@class='close']");
	By byDEM = By.xpath("//b[contains(text(),'DEM')]");
	By byProfile = By.linkText("View Company Info");
	By byCancel = By.xpath("//a[contains(text(),'Cancel')]");
	By byLogout = By.linkText("Logout");
	
	@Test(groups = {"AllTest","TopMenuItems"})
	public void topMenuItems() throws InterruptedException
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		
		//Adopt Sign
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byAdSign));
		driver.findElement(byAdSign).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byANS));
		driver.findElement(byANS).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byEFN));
		WebElement enterpartyN = driver.findElement(byEFN);
		enterpartyN.sendKeys("Pragya Pandit");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byCSign));   //Choose Sign
		driver.findElement(byCSign).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(bySSign));    //Save Sign
		driver.findElement(bySSign).click();
		
		//Notification
//		Thread.sleep(2000);
//		driver.findElement(By.id("notification")).click();
		
		//Credit Balance
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byCB));
		driver.findElement(byCB).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byCloseb));
		driver.findElement(byCloseb).click();
		
		//Support
		jsclick(driver.findElement(By.xpath("//div[@id='help']")));
		Thread.sleep(5000);
		
		//Profile
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byDEM));
		driver.findElement(byDEM).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byProfile));
		driver.findElement(byProfile).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byCancel));
		driver.findElement(byCancel).click();
		
		//logout
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byDEM));
		driver.findElement(byDEM).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byLogout));
		driver.findElement(byLogout).click();
		
	}
	
	public void jsclick(WebElement element) {
		JavascriptExecutor executors=(JavascriptExecutor)driver;
		executors.executeScript("arguments[0].click()",element);
	}
	
}
