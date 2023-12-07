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
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static WebDriverWait wait ;
	
	By byUsername = By.id("username");
	By byPassword = By.id("password");
	By byClickLogin = By.className("login_submit");
	
	@BeforeClass(groups = {"AllTest","SendDocket","CreateTemplate","LibrarySection","TopMenuItems","ArchiveDocket"})
	public void setup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.apps.signitonline.co.uk/");
		Utilities.hardWait(3);
		
		Reporter.log("Browser session started", true);
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byUsername));
		WebElement user = driver.findElement(byUsername);
		user.sendKeys("DEMadmin");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byPassword));
		WebElement pass = driver.findElement(byPassword);
		pass.sendKeys("G33con@0404");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byClickLogin));
		driver.findElement(byClickLogin).click();
		
		System.out.println("Successfully Login");
		
	}
	
	@AfterClass(groups = {"AllTest","SendDocket","CreateTemplate","LibrarySection","TopMenuItems","ArchiveDocket"})
	public void tearDown() throws InterruptedException
	{
		Utilities.hardWait(3);
		Reporter.log("Browser session ended", true);
		driver.quit();
	}
	
}
