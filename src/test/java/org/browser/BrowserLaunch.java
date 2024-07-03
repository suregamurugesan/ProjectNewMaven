package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("surega");
	
		WebElement pw = driver.findElement(By.id("pass"));
		pw.sendKeys("54321");
		
		WebElement loginbtn = driver.findElement(By.name("login"));
		loginbtn.click();
		
	}

}
