package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Xpath\\Driver\\chromedriver.exe");
		WebDriver WD = new ChromeDriver();
		WD.get("https://www.snapdeal.com/");
		WD.manage().window().maximize();
		WebElement sin = WD.findElement(By.xpath
				("//span[@class='accountUserName col-xs-12 reset-padding']"));
		sin.click();
		Thread.sleep(3000);
		WebElement reg = WD.findElement(By.xpath
				("//span[@class='newUserRegister']"));
		reg.click();
		
		WebElement con = WD.findElement(By.id("checkUser"));
		con.click();		
		
		
		
	}

}
