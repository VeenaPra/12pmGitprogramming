package org.data;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazonsign {
	//nav-link-accountList-nav-line-1
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Alert\\Driver\\chromedriver.exe");
		WebDriver D = new ChromeDriver();
		//To launch the URL
		D.get("https://www.amazon.in/");
		D.manage().window().maximize();
		WebElement user = D.findElement(By.id("nav-link-accountList-nav-line-1"));
		user.click();
		WebElement mail = D.findElement(By.name("email"));
		mail.sendKeys("1234567");
		Actions a = new Actions(D);
		a.doubleClick(mail).contextClick().build().perform();
		Robot r =new Robot();
		for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}		

}
