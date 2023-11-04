package org.signitonline.testcase;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ReminderDocket extends BaseClass {

	By byLibs = By.xpath("//div[1]/div[1]/ul[1]/li[2]/a[1]/img[1]");
	By byDSDrp = By.xpath("//span[contains(text(),'Docket Status')]");
	By byIPD = By.xpath("//li[contains(text(),'InProgress')]");
	By byRDB = By.xpath("//div[1]/div[3]/div[2]/div[6]/a[4]/img[1]");
	By byTEC = By.name("daily");
	By byCDD = By.name("custom");
	By byRSB = By.xpath("//button[contains(text(),'Set')]");
	By byRNB = By.xpath("//button[contains(text(),'Remind Now')]");
	
	@Test
	public void reminder_docket_Setbutton()
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byLibs));    //library section
		driver.findElement(byLibs).click();
		
		//Docket Status Dropdown
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byDSDrp));
		driver.findElement(byDSDrp).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byIPD));    //Inprogress Docket
		driver.findElement(byIPD).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byRDB));    //Reminder Docket button
		driver.findElement(byRDB).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byTEC));    // Everyday CheckBox
		driver.findElement(byTEC).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byCDD));    // Custom Days Dropdown
		driver.findElement(byCDD).sendKeys("3");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byRSB));    //Reminder Set button
		driver.findElement(byRSB).click();
		
		System.out.println("Reminder Set Successfully!!");
	
	}
	
	@Test
	public void reminder_docket_RemindNowbutton()
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byLibs));    //library section
		driver.findElement(byLibs).click();
		
		//Docket Status Dropdown
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byDSDrp));
		driver.findElement(byDSDrp).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byIPD));    //Inprogress Docket
		driver.findElement(byIPD).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byRDB));    //Reminder Docket icon
		driver.findElement(byRDB).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byRNB));    //Remind Now button
		driver.findElement(byRNB).click();
		
		System.out.println("Reminder Set Successfully!!");
		
	}
	
}
