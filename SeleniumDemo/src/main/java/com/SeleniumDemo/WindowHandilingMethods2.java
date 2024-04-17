package com.SeleniumDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandilingMethods2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	WebElement element = driver.findElement(By.xpath("//a[text()='Open a popup window']"));
	element.click();
	Set<String> handles = driver.getWindowHandles();
	Iterator<String> iterator = handles.iterator();
	String id="";
	while(iterator.hasNext())
	{
		 id=iterator.next();
	     System.out.println(id);
	}
	driver.switchTo().window(id);
	System.out.println(driver.getWindowHandle());
}
}
