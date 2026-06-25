package Handle_multiple;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the nth ");
		
		int n = sc.nextInt();
		
		System.out.println("---------");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vinothqaacademy.com/webtable/");
		
		WebElement FUname = driver.findElement(By.xpath("//table[@id='myTable']//tr["+n+"]/td[2]"));
		
		System.out.println(FUname.getText());
		
		System.out.println("----------");
		
		List<WebElement> Alldetails = driver.findElements(By.xpath("//table[@id='myTable']//tr/td[2]"));
		
		for(int i=1;i<Alldetails.size();i++) {
			System.out.println(Alldetails.get(i).getText());
		}
		System.out.println("----------");
		List<WebElement> Allusername = driver.findElements(By.xpath("//table[@id='myTable']//tr["+n+"]"));
		
		for(int j=1;j<Allusername.size();j++) {
			System.out.println(Alldetails.get(j).getText());
		}
		
		
		driver.close();

	}

}
