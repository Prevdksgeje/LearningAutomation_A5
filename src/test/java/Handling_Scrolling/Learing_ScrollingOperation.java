package Handling_Scrolling;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;


public class Learing_ScrollingOperation {
	
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
	
	driver.get("https://vinothqaacademy.com/mouse-event/");
	
	Actions acobj = new Actions(driver);
	
	 WebElement hover = driver.findElement(By.id("tooltipTarget"));
	
	acobj.moveToElement(hover).perform();
	
	System.out.println("Hover done");
	
	acobj.scrollByAmount(0, 500).perform();
	
	System.out.println("Scroll X axes done");
	
	acobj.scrollToElement(hover).perform();
	
	System.out.println(" hover Element Scroll done");
	
	acobj.scrollFromOrigin(ScrollOrigin.fromElement(hover), 0, 500).perform();
	
	System.out.println(" hover Scroll done");
	
	driver.close();
	
	
	}

}
