package practice.sel.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day18 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\S RAGUPATHI\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe ");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	
	
}
}