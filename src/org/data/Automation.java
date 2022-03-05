package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver WD = new ChromeDriver();
		// To Launch the URL
		WD.get("http://demo.automationtesting.in/Register.html");
		//To max the Window
		WD.manage().window().maximize();
		// To launch and pass the values
		WebElement user = WD.findElement(By.xpath("//input[@placeholder='First Name']"));
		user.sendKeys("Veena");
		WebElement last = WD.findElement(By.xpath("(//input[@type='text'])[2]"));
		last.sendKeys("Nagaraj");
		WebElement Address = WD.findElement(By.xpath("//textarea[@rows='3']"));
		Address.sendKeys("Perumbakkam");
		WebElement mail = WD.findElement(By.xpath("//input[@type='email']"));
		mail.sendKeys("veenapradheepkumar@gmail.com");
		WebElement phno = WD.findElement(By.xpath("//input[@type='tel']"));
		phno.sendKeys("9999464758");
		WebElement gender = WD.findElement(By.name("radiooptions"));
		gender.click();
		WebElement hobbie = WD.findElement(By.id("checkbox2"));
		hobbie.click();
		WebElement lang = WD.findElement(By.xpath("//div[@style='min-height:30px;max-width:200px']"));
		lang.click();
		for (int i = 0; i < 8; i++) {
		Thread.sleep(2000);
		WebElement eng = WD.findElement(By.xpath("(//a[@style='text-decoration:none'])[8]"));	
		eng.click();
		}
		
		
	}

}
