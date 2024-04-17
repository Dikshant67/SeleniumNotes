package com.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoonOrangeHrm {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver =new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     Thread.sleep(3000);
     WebElement webEdtUsername=driver.findElement(By.name("username"));
  
     WebElement webEdtUsernameElement=driver.findElement(By.xpath("//input[@name='username']"));
     WebElement webEdtPassword=driver.findElement(By.name("password"));
     WebElement webBtnSubmit=driver.findElement(By.xpath("//button[@type='submit']"));
     webEdtUsername.sendKeys("Admin");
     webEdtPassword.sendKeys("admin123");
     webBtnSubmit.click();
     Thread.sleep(3000);
     WebElement webBtnApplyLeave=driver.findElement(By.xpath("//button[@title='Apply Leave']"));
     webBtnApplyLeave.click(); 
}
}
