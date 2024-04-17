package com.SeleniumDemo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotMethod {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	  File srcScreenShot=driver.findElement(By.xpath("//div[@id='sidebar-right-1']")).getScreenshotAs(OutputType.FILE);
//    FileHandler.copy(srcScreenShot, new File(System.getProperty("user.dir")+"\\ss.png"));
}
}
