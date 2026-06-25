package Handling_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learning_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		
		driver.get("file:///C:/Users/Personal/Downloads/EmbededWebpage.html");

		WebElement Wb1 = driver.findElement(By.cssSelector("select[name='country1']"));
		
		WebElement Wb2 = driver.findElement(By.cssSelector("select[name='country2']"));
		
		
		Select selectonj = new Select(Wb2);
		
		boolean status = selectonj.isMultiple();
		
		System.out.println("-----------------");
		
		if(status) {
			System.out.println("It is a Multiple ");
		}
		else {
			System.out.println("It is a Single");
		}
		
		Thread.sleep(2000);
		
		
		selectonj.selectByIndex(2);
		
		
		selectonj.selectByValue("cnd");
		

		
		selectonj.selectByVisibleText("SWITZERLAND");
		
	
		
		selectonj.selectByContainsVisibleText("IND");
		
		System.out.println("-----------------");
		
		List<WebElement> GetOption = selectonj.getOptions();
		
		for(int i=0;i<GetOption.size();i++) {
			
			System.out.println(GetOption.get(i).getText());
		}
		
		System.out.println("-----------------");
		
		selectonj.getFirstSelectedOption();
		
		System.out.println("-----------------");
		
		selectonj.getAllSelectedOptions();
		
		System.out.println("-----------------");
		
		WebElement GetWp = selectonj.getWrappedElement();
		
		System.out.println(GetWp.getText());
		
		System.out.println("-----------------");
		
		
		
		selectonj.deselectByIndex(2);
		
		selectonj.deselectByValue("cnd");
		
		selectonj.deselectByVisibleText("SWITZERLAND");
		
		selectonj.deSelectByContainsVisibleText("IND");
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
