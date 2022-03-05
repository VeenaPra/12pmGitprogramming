package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Xpath\\Driver\\chromedriver.exe");
		WebDriver WD = new ChromeDriver();
		WD.get("https://www.redbus.in/\r\n");
		WD.manage().window().maximize();
		WebElement btn = WD.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
		btn.click();
		
		WebElement btn1 = WD.findElement(By.id("hc"));
		btn1.click();
		Thread.sleep(3000);
		WebElement mob = WD.findElement(By.id("mobileNoInp"));
	    mob.sendKeys("9994112884");
		WebElement ro = WD.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
		ro.click();
		WebElement otp = WD.findElement(By.xpath("//span[@class='f-w-b']"));
		otp.click();
	}

}
