package LearnLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_name {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// open the browser
		WebDriver driver = new ChromeDriver();
		// navigate window
		driver.manage().window().maximize();
		// navigate 
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(3000);
		
		 WebElement utf = driver.findElement(By.name("user-name"));
		 
		 WebElement ptf = driver.findElement(By.name("password"));
		 
		 WebElement lbf = driver.findElement(By.name("login-button"));
		 
		 Thread.sleep(3000);
		 
		 utf.sendKeys("standard_user");
		 
		 Thread.sleep(3000);
		 
		 ptf.sendKeys("secret_sauce");
		 
		 Thread.sleep(3000);
		 
		 lbf.click();
		 
		 driver.close();
		 
		 System.out.println("Execution done");
		 
		 
		
		

	}

}
