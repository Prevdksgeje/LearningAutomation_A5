package Handling_MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learning_HideElement {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		
		// steps for Mouse Action
		// 1 create a object 
		
		Actions acob = new Actions(driver);
		
		WebElement ele1 = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Com')]"));
		
		// 2 and 3
		
		acob.moveToElement(ele1).perform();
		
		System.out.println("Excuetion done");
		
		// Click Element
		
		acob.click(driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Des')]"))).perform();
		
		// Double Click element
		
		//acob.doubleClick(driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Not')]"))).perform();
		
		// Context Click element
		
		//acob.contextClick(driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Acc')]"))).perform();
		
		driver.get("https://vinothqaacademy.com/mouse-event/");
		
		WebElement dragele = driver.findElement(By.id("dragItem"));
		
		WebElement dropele = driver.findElement(By.id("dropZone"));
		
		// Drag and Drop Method 
		
		acob.dragAndDrop(driver.findElement(By.id("dragItem")), driver.findElement(By.id("dropZone")));
		
		//acob.dragAndDrop(dragele, dropele).perform();
		
		System.out.println("DragandDrop done");
		
		// Click and Hold --- Release Method 
		
		acob.clickAndHold(driver.findElement(By.id("dragItem"))).release(driver.findElement(By.id("dropZone"))).perform();
		
		//acob.clickAndHold(dragele).release(dropele).perform();
		
		System.out.println("click and hold done");
		
		// Hover on me --- moveToElement()
		
		WebElement hover = driver.findElement(By.id("tooltipTarget"));
		
		acob.moveToElement(hover).perform();
		
		System.out.println("Hover on me done");
		
		// Move to Offset 
		
		acob.dragAndDropBy(driver.findElement(By.id("handle_max")), 400, 0).perform();
		
		System.out.println("Slider done");
		
		
		driver.close();
	}

}
