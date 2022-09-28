package practice.sel.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day26 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\S RAGUPATHI\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");	
	    driver.manage().window().maximize();

	   driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	   
	   driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("ragu");

}}
