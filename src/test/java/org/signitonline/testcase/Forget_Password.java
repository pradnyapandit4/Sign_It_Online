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

public class Forget_Password {

	public static WebDriver driver;
	public static WebDriverWait wait ;
	
	By byforpass = By.xpath("//a[contains(text(),'Forget password?')]");
	By byEREmail = By.id("txtuseremail");
	By byRNPass = By.xpath("//div[2]/div[1]/input[@name='submit']");
	
	@Test
	public void forgetPassword ()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.mydevsystems.com/dev/signIt/index.php/login/login");
		Utilities.hardWait(3);
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		
		//Click on forget Password
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byforpass));
		driver.findElement(byforpass).click();
		
		//Please enter your registered email id
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byEREmail));
		WebElement enterregmail = driver.findElement(byEREmail);
		enterregmail.sendKeys("yelmkarr174@gmail.com");
		
		//Request New Password button
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byRNPass));
		driver.findElement(byRNPass).click();
		
	}
	
}
