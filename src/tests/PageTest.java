package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTest {


public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");

	driver = new ChromeDriver();
	
	driver.get("https://www.experta.com.ar/");
	
	Thread.sleep(1000);
	
	driver.close();
}
	
	
}
