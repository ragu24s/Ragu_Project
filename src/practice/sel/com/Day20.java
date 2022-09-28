package practice.sel.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day20 {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\S RAGUPATHI\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@id='alertButton']")).click();
    String r1 = driver.switchTo().alert().getText();
	System.out.println(r1);
	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
    Thread.sleep(5000);	
	String r2 = driver.switchTo().alert().getText();
	System.out.println(r2);
	driver.switchTo().alert().dismiss();

	
}
}
