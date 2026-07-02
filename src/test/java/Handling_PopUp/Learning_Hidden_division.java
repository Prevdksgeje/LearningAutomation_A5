package Handling_PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Learning_Hidden_division {
	
	public static void main(String[] args) {
		
		ChromeOptions co_obj = new ChromeOptions();
		
		co_obj.addArguments("--disable-notificaions");
		
		WebDriver driver = new ChromeDriver(co_obj);
		
		driver.get("https://www.goibibo.com/");
		
		WebElement close = driver.findElement(By.xpath("//span[@role='presentation']"));
		
		close.click();
		
		
	}

}
