package Learning_Synchorzation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchorzation_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.shoppersstack.com/");
		
		WebElement txf = driver.findElement(By.xpath("//h3[contains(text(),'Welcome')]"));
		
		System.out.println(txf.getText());
		
		WebElement lbf = driver.findElement(By.xpath("//button[@id='loginBtn']"));
		
		lbf.click();
		
		
		driver.close();
		
		
		
		
		
	
	}

}
