package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resume {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Xpath\\Driver\\chromedriver.exe");
		WebDriver WD = new ChromeDriver();
		WD.get("http://greenstech.in/selenium-course-content.html");
		WD.manage().window().maximize();
		WebElement iq = WD.findElement(By.id("heading201"));
		iq.click();
		for (int i = 0; i < 0; i++) {
					
		}
		WebElement re = WD.findElement(By.xpath("(//a[@title='Model Resume training in chennai'])[1]"));
		re.click();
	}
		
	}
	



