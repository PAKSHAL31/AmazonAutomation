package com.amazon;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest extends AmazonTestCase{
	
	@Test
	public void loginFunction() {
		Actions mouseHover = new Actions(driver);
		WebElement accountList = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		WebElement signInBtn = driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a"));
		mouseHover.moveToElement(accountList).perform();
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(signInBtn)).click(); // implicit wait
		WebElement emailText = driver.findElement(By.xpath("//input[@name='email']"));
		emailText.sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		WebElement passwordText = driver.findElement(By.xpath("//input[@name='password']"));
		passwordText.sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	}
}
