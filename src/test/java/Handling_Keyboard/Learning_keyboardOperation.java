package Handling_Keyboard;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learning_keyboardOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		 Actions keyobj = new Actions(driver);
		 
		 /*keyobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		 keyobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		 keyobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		 keyobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();*/
		 
		 keyobj.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,"Book",Keys.ENTER).perform();
		 
		 System.out.println("Keyboard operation done");
		 
		 driver.close();
		 

	}

}
