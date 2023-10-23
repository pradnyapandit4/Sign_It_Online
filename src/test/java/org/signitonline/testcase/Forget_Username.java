package org.signitonline.testcase;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.signitonline.utilities.Utilities;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Forget_Username {

	public static WebDriver driver;
	public static WebDriverWait wait ;
	
	By byforuser = By.xpath("//a[contains(text(),'Forget Username?')]");
	By byEREmail = By.id("byforuser");
	By byMeword = By.id("txtmemorable");
	By bySubu = By.name("submit");
	
	@Test
	public void forgetUsername ()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.mydevsystems.com/dev/signIt/index.php/login/login");
		Utilities.hardWait(3);
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		
		//Click on forget Username
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byforuser));
		driver.findElement(byforuser).click();
		
		//Please enter your registered email id
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byEREmail));
		WebElement enterregmail = driver.findElement(byEREmail);
		enterregmail.sendKeys("yelmkarr174@gmail.com");
		
		//Enter Memorable word or pin
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byMeword));
		WebElement entermeword = driver.findElement(byMeword);
		entermeword.sendKeys("rohity1742000");
		
		//Click on Submit button
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(bySubu));
		driver.findElement(bySubu).click();
		
	}
	
}
