package Handling_MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learning_HideElement {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		
		// steps for Mouse Action
		// 1 create a object 
		
		Actions acob = new Actions(driver);
		
		WebElement ele1 = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Com')]"));
		
		// 2 and 3
		
		acob.moveToElement(ele1).perform();
		
		//acob.click(driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Des')]"))).perform();
		
		acob.doubleClick(driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Not')]"))).perform();
		
		//acob.contextClick(driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Acc')]"))).perform();
		
		System.out.println("Execution done");
		
		driver.close();
	}

}
