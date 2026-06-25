package fecthing_all;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Fetching_three {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//naviagte 
		driver.manage().window().maximize();
		
		driver.get("https://www.automationexercise.com/");
		
		System.out.println(driver.getTitle());
		
		TakesScreenshot Ss_1 = (TakesScreenshot)driver;
		
		File tempth = Ss_1.getScreenshotAs(OutputType.FILE);
			
		File perpth = new File("./src/main/resources/TestScreenshort/Screenshort.png");
		
			FileHandler.copy(tempth, perpth);
		
		System.out.println("Screenshort done");
		
		WebElement stf = driver.findElement(By.xpath("//a[contains(text(),'Log')]"));
	
		
		if(stf.isDisplayed() && stf.isEnabled() ) {
		    System.out.println("Pass");
		} else {
		    System.out.println("Fail");
		}
		
		stf.click();
		
		System.out.println(driver.getTitle());
		
		WebElement ntf = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
		
		ntf.sendKeys("aasif");
		
		if(ntf.isDisplayed() && ntf.isEnabled() ) {
		    System.out.println("Pass");
		} else {
		    System.out.println("Fail");
		}
		
		WebElement etf = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
		
		etf.sendKeys("abu123@gmail.com");
		
		if(etf.isDisplayed() && etf.isEnabled() ) {
		    System.out.println("Pass");
		} else {
		    System.out.println("Fail");
		}
		
		WebElement sbf = driver.findElement(By.xpath("//button[contains(text(),'Sign')]"));
		
		if(sbf.isDisplayed() && sbf.isEnabled() ) {
		    System.out.println("Pass");
		} else {
		    System.out.println("Fail");
		}
		
		sbf.click();
		
		System.out.println(driver.getTitle());
		
		TakesScreenshot Ss_2 = (TakesScreenshot)driver;
		
		File tempth_1 = Ss_2.getScreenshotAs(OutputType.FILE);
			
		File perpth_1 = new File("./src/main/resources/TestScreenshort/Screenshort.png");
		
			FileHandler.copy(tempth_1, perpth_1);
		
		System.out.println("Screenshort done");
		
		WebElement gtf = driver.findElement(By.xpath("//input[@value=\'Mr\']"));
		
		if(gtf.isDisplayed() && gtf.isEnabled() ) {
		    System.out.println("Pass");
		} else {
		    System.out.println("Fail");
		}
		
		gtf.click();
		
		WebElement Etf = driver.findElement(By.xpath("//input[@id='email']"));
		
		if(Etf.isDisplayed() && Etf.isEnabled()) {
		    System.out.println("Pass");
		} else {
		    System.out.println("Fail");
		}
		
		Etf.click();
		
		WebElement Ss_3 = driver.findElement(By.xpath("//input[@id='email']"));
		
		File tempth_2 = Ss_3.getScreenshotAs(OutputType.FILE);
		
		File perpth_2 = new File("./src/main/resources/TestScreenshort/Screenshort.png");
		
			FileHandler.copy(tempth_2, perpth_2);
		
		System.out.println("Screenshort done");
		
		System.out.println("All the operation is done");
		
		driver.close();
	}

}
