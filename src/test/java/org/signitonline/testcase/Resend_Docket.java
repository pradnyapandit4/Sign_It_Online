package org.signitonline.testcase;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Resend_Docket extends BaseClass {

	By byLibs = By.xpath("//div[1]/div[1]/ul[1]/li[2]/a[1]/img[1]");
	By byDSDrp = By.xpath("//span[contains(text(),'Docket Status')]");
	By byRejD = By.xpath("//li[contains(text(),'Rejected')]");
	By byRDB = By.xpath("//div[1]/div[3]/div[2]/div[6]/a[1]/img[1]");
	By byRSB = By.xpath("//button[contains(text(),'Resend')]");
	By byNxtB = By.id("nextBtn");
	By byNBtn = By.name("next");
	By bySign = By.xpath("//div[@class='side-controls' and @tooltip='Signature']");
	By bypdf = By.xpath("//img[@class='current-img']");
	By bySDB = By.xpath("//button[contains(text(),'Send Docket')]");
	
	public void resend_docket_fun()
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byLibs));    //library section
		driver.findElement(byLibs).click();
		
		//Docket Status Dropdown
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byDSDrp));
		driver.findElement(byDSDrp).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byRejD));    //Rejected Docket
		driver.findElement(byRejD).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byRDB));     //Resend Docket Button
		driver.findElement(byRDB).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byRSB));     //Resend Button
		driver.findElement(byRSB).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byNxtB));     //Next Button
		driver.findElement(byNxtB).click();
		
		System.out.println("Successfully Uploaded Document!!");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byNBtn));     //Next Button
		driver.findElement(byNBtn).click();
		
		System.out.println("Successfully Updated Party Details!!");
		
		//Signature
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(bySign));
		driver.findElement(bySign).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(bypdf));
		driver.findElement(bypdf).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(bySDB));   //Send docket button
		driver.findElement(bySDB).click();
		
		System.out.println("Docket Send Successfully!!");
		
	}
	
}
