package org.signitonline.testcase;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ArchiveDocket extends BaseClass  {

	By byLibs = By.xpath("//div[1]/div[1]/ul[1]/li[2]/a[1]/img[1]");
	By byDSDrp = By.xpath("//span[contains(text(),'Docket Status')]");
	By bySiD = By.xpath("//li[contains(text(),'Signed')]");
	By byArDk = By.xpath("//div[1]/div[3]/div[2]/div[6]/a[5]/img[1]");
	By byArMo = By.xpath("//div[1]/div[1]/ul[1]/li[3]/a[1]/img[1]");
	
	@Test(groups = {"AllTest","ArchiveDocket"})
	public void archiveDocket() throws InterruptedException
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byLibs));
		driver.findElement(byLibs).click();
		
		//Docket Status 
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byDSDrp));
		driver.findElement(byDSDrp).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(bySiD));    //Signed Docket
		driver.findElement(bySiD).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byArDk));   //Archive Docket
		driver.findElement(byArDk).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byArMo));    //Archived Module
		driver.findElement(byArMo).click();
		
		System.out.println("Docket Archived Successfully!!");
		
	}
}
