package com.vedha.test;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumDemo {
	
	WebDriver driver;
	
	@BeforeMethod
	public void SetUp() {
		driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	
	@Test
	public void act() {
		Actions act = new Actions(driver);
		
		String src = "C:\\Users\\Sriva\\OneDrive\\Pictures\\Screenshots";
		WebElement choose = driver.findElement(By.xpath("//input[@id=\"file-upload\"]"));
		choose.sendKeys(src);
		
		driver.findElement(By.xpath("//input[@id=\"file-submit\"]")).click();
		
		try {
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file,  new File("./Screnshot/img2.png"));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
//	
	@Test
	public void amaZon() {
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("twotabsearchtextbox")));
	
	search.sendKeys("Books");
	
	assertTrue(search.isEnabled(), "not enabled");
	driver.findElement(By.id("nav-search-submit-button")).click();

	
	}
	
	@Test
	public void aleRts() {
		driver.findElement(By.xpath("//button[@id=\"alertBox\"]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@id=\"confirmBox\"]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[@id=\"promptBox\"]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().accept();
	}
	
	@Test
	public void frames() {
		driver.navigate().to("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.switchTo().frame("frm1");
		WebElement drop = driver.findElement(By.xpath("//select[@id=\"course\"]"));
		Select select = new Select(drop);
		select.selectByIndex(1);
		select.selectByVisibleText("Python");
		select.selectByValue("net");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@class=\"frmTextBox\"]")).sendKeys("Success");
		
	}

}
