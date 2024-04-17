package com.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFunction {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	driver.findElement(By.xpath("//*[@id=\"HTML47\"]/div[1]/button")).click();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	 WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("dte")));
	 button.click();
}
}
