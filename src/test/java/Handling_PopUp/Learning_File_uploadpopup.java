package Handling_PopUp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_File_uploadpopup {
	
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://the-internet.herokuapp.com/upload");
	
	// step to indentify
	
	WebElement ch_button = driver.findElement(By.xpath("//input[@id='file-upload']"));
	
	// file 
	
	 File actual_file = new File("./src/test/resources/Data/data.txt");
	 
	 //using sendkyes method 
	 
	 ch_button.sendKeys(actual_file.getAbsolutePath());
	 
	 
	}

}
