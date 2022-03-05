package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Train {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver Ch = new ChromeDriver();
		//To get the URL
		Ch.get("https://www.cleartrip.com/trains");
		//To max. the Window
		Ch.manage().window().maximize();
		//To get the title
		String title = Ch.getTitle();
		System.out.println(title);
		// To locate the text user and pass the value
		WebElement from = Ch.findElement(By.id("from_station"));
		from.sendKeys("Chennai");
		WebElement to = Ch.findElement(By.name("to_station"));
		to.sendKeys("Kovai");
		WebElement sbtn = Ch.findElement(By.id("trainFormButton"));
		sbtn.click();
		
		
		
				
	}

}
