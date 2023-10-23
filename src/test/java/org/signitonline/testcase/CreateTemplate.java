package org.signitonline.testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CreateTemplate extends BaseClass {

	By byCT = By.xpath("//span[contains(text(),'Create Template')]");
	By byFU = By.id("userfile");
	By byNB = By.id("nextBtn");
	By byEPN = By.id("partyName");
	By bySign = By.xpath("//div[@class='side-controls signature_attr' and @tooltip='Signature']");
	By bypdf = By.xpath("//img[@class='current-img']");
	By bySB = By.name("save");
	
	@Test(groups = {"AllTest","CreateTemplate"})
	public void createTemplate() throws InterruptedException
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byCT));
		driver.findElement(byCT).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byFU));
		WebElement fileupload = driver.findElement(byFU);
		fileupload.sendKeys("C:/Users/NILESH PANDIT/Dropbox/PC/Desktop/Internship/Sign it Online/PDF4.pdf");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byNB));
		driver.findElement(byNB).click();
		
		System.out.println("Successfully Uploaded Document!!");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byEPN));
		WebElement enterpartyN = driver.findElement(byEPN);
		enterpartyN.sendKeys("Pradnya");
		
		jsclick(driver.findElement(By.xpath("//div[3]/div[2]/button[1]")));
		Thread.sleep(5000);
		
		System.out.println("Successfully Updated Party Details!!");
		
		//Signature
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(bySign));
		driver.findElement(bySign).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(bypdf));
		driver.findElement(bypdf).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(bySB));   //Save button
		driver.findElement(bySB).click();
		
		System.out.println("Template Created Successfully!!");
	}
	
	public void jsclick(WebElement element) {
		JavascriptExecutor executors=(JavascriptExecutor)driver;
		executors.executeScript("arguments[0].click()",element);
	}
}
