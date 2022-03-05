package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Xpath\\Driver\\chromedriver.exe");
		WebDriver WD = new ChromeDriver();
		WD.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		WD.manage().window().maximize();
		WebElement fname = WD.findElement(By.name("firstName"));
		fname.sendKeys("Veena");
		WebElement lname = WD.findElement(By.name("lastName"));
		lname.sendKeys("Pradheep");
		WebElement mail = WD.findElement(By.id("username"));
		mail.sendKeys("veenapradheep123@gmail.com");
		WebElement pass = WD.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("000@123ve");
		WebElement cpass = WD.findElement(By.xpath("(//input[@type='password'])[2]"));
		cpass.sendKeys("000@123ve");
		WebElement btn = WD.findElement(By.id("i3"));
		btn.click();
		WebElement btn1 = WD.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
		btn1.click();
		
		
	}

}
