package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Xpath\\Driver\\chromedriver.exe");
		WebDriver WD = new ChromeDriver();
		WD.get("https://www.flipkart.com/");
		WD.manage().window().maximize();
		WebElement name = WD.findElement(By.xpath("(//input[@type='text'])[2]"));
		name.sendKeys("9994112884");
		WebElement pass = WD.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("12345678");
		WebElement lgnbtn = WD.findElement(By.xpath("(//button[@type='submit'])[2]"));
		lgnbtn.click();
	}

}
