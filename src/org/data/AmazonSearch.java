package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Xpath\\Driver\\chromedriver.exe");
		WebDriver Dr = new ChromeDriver();
		Dr.get("https://www.amazon.in/");
		Dr.manage().window().maximize();
		WebElement elec = Dr.findElement(By.xpath("(//a[@class='nav-a  '])[5]"));
		elec.click();
		for (int i = 0; i < 5; i++) {
			
		}
		WebElement camra = Dr.findElement(By.xpath("(//span[@class='nav-a-content'])[6]"));
		camra.click();
		
		
	}

}
