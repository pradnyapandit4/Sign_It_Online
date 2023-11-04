package org.signitonline.testcase;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.signitonline.utilities.Utilities;
import org.testng.annotations.Test;

public class SendDocket extends BaseClass {
	
	By bySNDB = By.xpath("//div[@class='p-2']/a[@title='Send Docket']");
	By byFU = By.xpath("//input[@id='userfile']");    //input[@id='doc_name']  //button[@class='upload col-6 ml-auto mr-auto']
	By byNB = By.id("nextBtn");
	By byEPN = By.id("partyName");
	By byEPE = By.id("partyEmail");
	By byEM = By.xpath("//textarea[@class='form-control']");
	By byNB2 = By.id("next");
	By bySign = By.xpath("//div[@class='side-controls' and @tooltip='Signature']");
	By bypdf = By.xpath("//img[@class='current-img']");
	By bySDB = By.name("next");
	
	@Test(groups = {"AllTest","SendDocket"})
	public void sendDocket_usingPDF() throws InterruptedException 
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(bySNDB));
		driver.findElement(bySNDB).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(byFU));
		driver.findElement(byFU).sendKeys("C:/Users/NILESH PANDIT/Dropbox/PC/Desktop/Internship/Sign it Online/PDF2.pdf");
		
		Utilities.hardWait(5);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byNB));
		driver.findElement(byNB).click();
		
		System.out.println("Successfully Uploaded Document!!");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byEPN));
		WebElement enterpartyN = driver.findElement(byEPN);
		enterpartyN.sendKeys("Pradnya Pandit");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byEPE));
		WebElement enterpartyE = driver.findElement(byEPE);
		enterpartyE.sendKeys("pradnyapandit4@gmail.com");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byEM));
		WebElement entermsg = driver.findElement(byEM);
		entermsg.sendKeys("Hello");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byNB2));
		driver.findElement(byNB2).click();
		
		System.out.println("Successfully Updated Party Details!!");
		
		//Signature
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(bySign));
		driver.findElement(bySign).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(bypdf));
		driver.findElement(bypdf).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(bySDB));   //Send docket button
		driver.findElement(bySDB).click();
		
		System.out.println("Successfully Send Docket!!");
		
	}
}
