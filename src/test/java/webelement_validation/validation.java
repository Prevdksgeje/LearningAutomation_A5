package webelement_validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class validation {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		// open browser
		WebDriver driver = new ChromeDriver();
		//naviagte 
		driver.manage().window().maximize();
		
		driver.get("https://www.automationexercise.com/");
		
		WebElement stf = driver.findElement(By.xpath("//a[contains(text(),'Log')]"));
		
		
		if(stf.isDisplayed() && stf.isEnabled() ) {
		    System.out.println(" SignUp Text Pass");
		} else {
		    System.out.println(" SignUp Text Fail");
		}
		
		stf.click();
		
		WebElement ntf = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
		
		ntf.sendKeys("aasif");
		
		if(ntf.isDisplayed() && ntf.isEnabled() ) {
		    System.out.println(" User name Pass");
		} else {
		    System.out.println(" User name Fail");
		}
		
		WebElement etf = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
		
		etf.sendKeys("abu123@gmail.com");
		
		if(etf.isDisplayed() && etf.isEnabled() ) {
		    System.out.println(" Email id Pass");
		} else {
		    System.out.println(" Email id Fail");
		}
		
		WebElement sbf = driver.findElement(By.xpath("//button[contains(text(),'Sign')]"));
		
		
		if(sbf.isDisplayed() && sbf.isEnabled() ) {
		    System.out.println("Signup button Pass");
		} else {
		    System.out.println("Signup button Fail");
		}
	
		sbf.click();
		
		WebElement gtf = driver.findElement(By.xpath("//input[@value=\'Mr\']"));
		
		
		if(gtf.isDisplayed() && gtf.isEnabled() ) {
		    System.out.println("Radio button Pass");
		} else {
		    System.out.println("Radio button Fail");
		}
		
		gtf.click();
		
		WebElement Etf = driver.findElement(By.xpath("//input[@id='email']"));
		
		
		if(Etf.isDisplayed() && Etf.isEnabled()) {
		    System.out.println("Email Pass");
		} else {
		    System.out.println(" Email Fail");
		}
		
		Etf.click();
		
		System.out.println("All the Validation operation task is Done");
		
		driver.close();
	}

}
