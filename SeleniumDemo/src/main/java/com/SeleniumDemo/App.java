package com.SeleniumDemo;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException, IOException
    {
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize(); //1 .for maximizing the window 
      driver.get("https://omayo.blogspot.com/");
   
//      driver.manage().window().fullscreen(); //2. for fullscreen window
      //3.Setting size of the window.
      //for this we need to create a Dimension class object
//      Dimension d=new Dimension(300,530);
//      driver.manage().window().setSize(d);
//      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));

      // Perform actions on the button
//      button.click();
        WebElement radio =driver.findElement(By.xpath("//input[@id='radio1']"));
        WebElement link= driver.findElement(By.xpath("//a[normalize-space()='Posts (Atom)']"));
//        radio.click();
//        link.click();
        WebElement textarea=driver.findElement(By.xpath("//textarea[@id='ta1']"));
        textarea.sendKeys("Hi ");
        textarea.sendKeys(Keys.ENTER);
        textarea.sendKeys("I am Learning Selenium Webdriver");
//        driver.findElement(By.className("post-body entry-content"));
//        driver.findElement(By.linkText("compendiumdev")).click();
//        driver.findElement(By.xpath("//input[@id='textbox1']")).clear();
        String textonbutton=driver.findElement(By.xpath("//input[@value='Search']")).getAttribute("type");
        System.out.println(textonbutton);
        Thread.sleep(3000);
        //4.command to capture Screenshot of the specific web element 
//       
//        File srcScreenShot=driver.findElement(By.xpath("//div[@id='sidebar-right-1']")).getScreenshotAs(OutputType.FILE);
//        FileHandler.copy(srcScreenShot, new File(System.getProperty("user.dir")+"\\ss.png"));
        //5.To get the page source i.e html css and scipt we user getPageSource command 
//        System.out.println(driver.getPageSource());
        driver.navigate().to("http://www.google.co.in");
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        
//        driver.quit();
        
        
        
        
        
        
        
    }
}
