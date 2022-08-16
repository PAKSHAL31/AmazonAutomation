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
		WebElement accountlist = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		WebElement signinbtn = driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a"));
		mouseHover.moveToElement(accountlist).perform();
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(signinbtn)).click(); // implicit wait
	}
}
