package com.SeleniumDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingMethods3 {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	WebElement element = driver.findElement(By.linkText("Open a popup window"));
	element.click();
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> itr=windows.iterator();
	while(itr.hasNext())
	{
		String windowid=itr.next();
		driver.switchTo().window(windowid);
		if(driver.getTitle().equalsIgnoreCase("New Window"))
		{
			String name = driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
			System.out.println(name);
		}
	}
	
}
}
