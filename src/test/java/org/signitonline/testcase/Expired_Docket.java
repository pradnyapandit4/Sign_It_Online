package org.signitonline.testcase;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Expired_Docket extends BaseClass{

	By byLibs = By.xpath("//div[1]/div[1]/ul[1]/li[2]/a[1]/img[1]");
	By byDSDrp = By.xpath("//span[contains(text(),'Docket Status')]");
	By byIPD = By.xpath("//li[contains(text(),'InProgress')]");
	By byEDB = By.xpath("//div[1]/div[3]/div[2]/div[6]/a[3]/img[1]");
	By bySED = By.name("expire_day");
	By byESB = By.xpath("//button[@class='btn btn-sm btn-primary setExpire']");
	
	@Test
	public void expired_docket_Setbutton()
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
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(bySED));    // Set Expire Date
		driver.findElement(bySED).click();
		
		//month and year selection
		Select month_drp = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		month_drp.selectByVisibleText("Oct");
		
		Select year_drp = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		year_drp.selectByVisibleText("2023");
		
		String date = "20";
		
		//Date Selection
		List <WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele:allDates)
		{
			String dt = ele.getText();
			//System.out.println(dt);
			
			if(dt.equals(date))
			{
				ele.click();
				break;
			}
		}
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byESB));    //Expire Set button
		driver.findElement(byESB).click();
		
		System.out.println("Date has been Set!!");
		
	}
	
}
