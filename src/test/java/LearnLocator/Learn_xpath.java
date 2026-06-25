package LearnLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(3000);
		//--- Identify webelement Xpath---
		// using Text Value
		// complete value 
		WebElement logo = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
		String text = logo.getText();
		System.out.println("Swag Labs");
		// using attribute Xpath
		Thread.sleep(3000);
		// complete value
		WebElement utf = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		Thread.sleep(3000);
		// partial value 
		WebElement ptf = driver.findElement(By.xpath("//input[contains(@placeholder,'word')]"));
		Thread.sleep(3000);
		// complete value 
		WebElement ltf = driver.findElement(By.xpath("//input[@value='Login']"));
		Thread.sleep(3000);
		
		// perform operation
		
		utf.sendKeys("problem_user");
		Thread.sleep(3000);
		
		ptf.sendKeys("secret_sauce");
		Thread.sleep(3000);
		ltf.click();
		Thread.sleep(3000);
		//driver.close();
		
		System.out.println("Execution done");
		
		


	}

}
