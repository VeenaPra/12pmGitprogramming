package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver Ch = new ChromeDriver();
		//To get the URL
		Ch.get("https://www.facebook.com/ ");
		//To max. the Window
		Ch.manage().window().maximize();
		//To get the title
		String title = Ch.getTitle();
		System.out.println(title);
		// To locate the text user and pass the value
		WebElement user = Ch.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		user.sendKeys("VeenaPradheepkumar");
		WebElement pass = Ch.findElement(By.xpath("//input[@placeholder='Password']"));
		pass.sendKeys("000123");
		WebElement login = Ch.findElement(By.xpath("//button[@value='1']"));
		login.click();
				
	}


}
