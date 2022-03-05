package org.data;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Product {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Alert\\Driver\\chromedriver.exe");
		WebDriver D = new ChromeDriver();
		//To launch the URL
		D.get("https://www.flipkart.com/");
		D.manage().window().maximize();
	    WebElement search = D.findElement(By.name("q"));
	    search.sendKeys("Mobiles");
	    D.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	   
		
		Actions a = new Actions(D);
		a.contextClick().perform();
		Robot r =new Robot();
		for (int i = 0; i < 6; i++) {
		
		r.keyPress(KeyEvent.VK_ENTER);	
		r.keyRelease(KeyEvent.VK_ENTER);	
		}
	}
}
			
		
		
		
		