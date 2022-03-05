package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Xpath\\Driver\\chromedriver.exe");
		WebDriver WD = new ChromeDriver();
		WD.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		WD.manage().window().maximize();
		WebElement btn = WD.findElement(By.xpath("//input[@autocomplete='new-password']"));
		btn.sendKeys("9994112884");
	
		WebElement btn1 = WD.findElement(By.xpath("//div[@class='submitBottomOption']"));
		btn1.click();
		
			}


}
