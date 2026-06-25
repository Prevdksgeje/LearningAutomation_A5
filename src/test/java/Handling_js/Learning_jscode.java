package Handling_js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_jscode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		// handle the JS code
		System.out.println("Execution Start");
		// step 1
		
		JavascriptExecutor jsobj = (JavascriptExecutor) driver;
		
		// step 2 and 3 
		
		jsobj.executeScript("window.location=arguments[0]", "https://www.automationexercise.com/");
		
		// Refresh 
		
		jsobj.executeScript("history.go(0)");
		
		// Fectching title
		
		System.out.println(jsobj.executeScript("return document.title"));
		
		// fetching url
		
		System.out.println(jsobj.executeScript("return document.URL"));
		
		// Perfrom
		
		jsobj.executeScript("arguments[0].click()", driver.findElement(By.partialLinkText("Log")));
		
		jsobj.executeScript("arguments[0].value='Aasif'", driver.findElement(By.name("name")));
		
		jsobj.executeScript("arguments[0].value='abd123@gmail.com'", driver.findElement(By.xpath("//input[@data-qa='signup-email']")));
		
		jsobj.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[@data-qa='signup-button']")));
		
		
		jsobj.executeScript("arguments[0].value='abu143@gmail.com'", driver.findElement(By.xpath("//input[@id='email']")));
		
		
		jsobj.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//h2/b[text()='Address Information']")));
		
		
		jsobj.executeScript("window.scrollBy(0,500)");
		
		jsobj.executeScript("window.scrollTo(0,500)");
	}

}
