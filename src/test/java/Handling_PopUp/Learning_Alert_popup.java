package Handling_PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Alert_popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		WebElement sim_Alert = driver.findElement(By.xpath("//button[contains(text(),'Alert')]"));
		
		sim_Alert.click();
		
		driver.switchTo().alert().accept();
		
		
		WebElement con_Alert = driver.findElement(By.xpath("//button[contains(text(),'Confirm')]"));
		
		con_Alert.click();
		
		driver.switchTo().alert().dismiss();
		
		
		WebElement prompt_Alert = driver.findElement(By.xpath("//button[contains(text(),'Prompt')]"));
		
		prompt_Alert.click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.close();
		
	}

}
