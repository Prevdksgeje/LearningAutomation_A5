package LearnLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_cssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// open the browser
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement utf = driver.findElement(By.cssSelector("input[name='user-name']"));
		
		WebElement ptf = driver.findElement(By.cssSelector("input[name='password']"));
		
		WebElement lbf = driver.findElement(By.cssSelector("input[name='login-button']"));
		
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
