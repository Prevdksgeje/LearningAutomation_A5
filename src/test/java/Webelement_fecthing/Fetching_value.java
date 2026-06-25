package Webelement_fecthing;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetching_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		 WebElement Txf = driver.findElement(By.xpath("//div[contains(text(),'Swa')]"));
		 
		 if(Txf.isDisplayed()) {
			 System.out.println("Text pass");
		 }
		 else {
			 System.out.println("Text Fail");
		 }
		 
		 // fetch value
		 String actual_txt = Txf.getText();
		 String Exp_txt = "Swag Labs";
		 System.out.println(actual_txt);
		 
		 if(actual_txt.equals(Exp_txt)) {
				System.out.println(" Text field Passed");
			}
		else {
				System.out.println("Text field Failed");
			}
		 
		String actual_Tagname = Txf.getTagName();
		String Exp_Tagname = "div";
		System.out.println(actual_Tagname);
		
		if(actual_Tagname.equals(Exp_Tagname)) {
			System.out.println(" TagName Passed");
		}
		else {
			System.out.println("TagName Failed");
		}
		
		String actual_Attribute = Txf.getAttribute("class");
		String Exp_Attribute = "class";
		System.out.println(actual_Attribute);
		
		if(actual_Attribute.equals(Exp_Attribute)) {
			System.out.println(" Attribute Passed");
		}
		else {
			System.out.println(" Attribute Failed");
		}
		
		String actual_CSS = Txf.getCssValue("font-family");
		String Exp_CSS = "DM Mono,\"sans-serif\"";
		System.out.println(actual_CSS);
		
		if(actual_CSS.equals(Exp_CSS)) {
			System.out.println(" CSS Passed");
		}
		else {
			System.out.println(" CSS Failed");
		}
		
		Dimension actual_Size = Txf.getSize();
		  
		int actual_width = actual_Size.getWidth();
		int Exp_width = 48;
		int actual_Height = actual_Size.getHeight();
		int Exp_Heigth = 50;
		
		System.out.println(actual_Size );
		System.out.println( actual_width + actual_Height);
		
		if(actual_width == Exp_width && actual_Height == Exp_Heigth) {
			System.out.println(" Size Passed");
		}
		else {
			System.out.println(" Size Failed");
		}
		
		Point actual_location = Txf.getLocation();
		int	actual_X = actual_location.getX();
		int Exp_X = 0;
		int actual_Y= actual_location.getY();
		int Exp_Y = 0;
		
		System.out.println(actual_location);
		System.out.println(actual_X + actual_Y);
		
		if(actual_X == Exp_X && actual_Y == Exp_Y) {
			System.out.println(" Location Passed");
		}
		else {
			System.out.println(" Location Failed");
		}

		System.out.println("All operation completed");
		driver.close();
		
		
		
		
		
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
