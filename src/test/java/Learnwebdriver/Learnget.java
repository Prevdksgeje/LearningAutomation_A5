package Learnwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnget {
public static void main(String[] args) {
	
	WebDriver driver =  new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.saucedemo.com/");
	
	WebElement utf = driver.findElement(By.id("user-name"));
	
	utf.sendKeys("standard_user");
	
	WebElement ptf = driver.findElement(By.id("password"));
	
	ptf.sendKeys("secret_sauce");
	
	
	WebElement lbf = driver.findElement(By.id("login-button"));
	
	lbf.click();
	
	driver.close();
	
	
	
	
}
}
