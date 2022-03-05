package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnology {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Xpath\\Driver\\chromedriver.exe");
		WebDriver WD = new ChromeDriver();
		WD.get("http://greenstech.in/selenium-course-content.html");
		WD.manage().window().maximize();
		WebElement iq = WD.findElement(By.xpath("//h2[@class='title mb-0 center']"));
		iq.click();
		for (int i = 0; i < 7; i++) {
					
		}
		WebElement cts = WD.findElement(By.xpath("(//a[@title='Interview Questions'])[6]"));
		cts.click();
	}

}
