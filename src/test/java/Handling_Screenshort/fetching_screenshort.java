package Handling_Screenshort;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class fetching_screenshort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		// step 1
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//step 2 and 3
		
		File tempth = ts.getScreenshotAs(OutputType.FILE);
		
		// step 4
		
		File perpth = new File("./src/main/resources/TestScreenshort/Screenshort.png");
		
		// step 5 
		
		
			FileHandler.copy(tempth, perpth);
			
			
			
		
		
		System.out.println("Screenshort done");
		
		
		driver.close();
	}

}
