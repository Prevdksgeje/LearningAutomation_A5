package Handling_PopUp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Learning_Notification_popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeOptions ch_obj = new ChromeOptions();
		
		ch_obj.addArguments("--disable-notificaion");
		
		WebDriver driver = new ChromeDriver(ch_obj);
		
		driver.get("https://www.goibibo.com/");
	}

}
