package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Xpath\\Driver\\chromedriver.exe");
		WebDriver sw = new ChromeDriver();
		sw.get("https://www.swiggy.com/");
		sw.manage().window().maximize();
		sw.findElement(By.xpath("//a[text()='Sign up']")).click();
		WebElement nam = sw.findElement(By.name("mobile"));
		nam.sendKeys("9994112884");
		WebElement nam1 = sw.findElement(By.name("name"));
		nam1.sendKeys("Veena");
		WebElement mail = sw.findElement(By.id("email"));
		mail.sendKeys("veenapradheepkumar@gmail.com");
		WebElement pw = sw.findElement(By.id("password"));
		pw.sendKeys("12345@34");
		WebElement btn = sw.findElement(By.xpath("//a[@class='a-ayg']"));
		btn.click();
	
	}
}
