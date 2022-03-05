package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Xpath\\Driver\\chromedriver.exe");
		WebDriver Dr = new ChromeDriver();
		Dr.get("https://www.amazon.in/");
		Dr.manage().window().maximize();
		WebElement search = Dr.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone");
		WebElement butn = Dr.findElement(By.xpath("//input[@type='submit']"));
		butn.click();
		
		
	}
	

}
