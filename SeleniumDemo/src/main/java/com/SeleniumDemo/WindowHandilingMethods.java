package com.SeleniumDemo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandilingMethods {
public static void main(String[] args) {
	
	
	 WebDriver driver=new ChromeDriver();
	//1 .for maximizing the window 
//	 driver.manage().window().maximize(); 
//     driver.get("https://omayo.blogspot.com/");
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//   //2. for fullscreen window
//     driver.manage().window().fullscreen(); 
     //3.Setting size of the window.
     //for this we need to create a Dimension class object
     Dimension d=new Dimension(300,530);
     driver.manage().window().setSize(d);
}
}
