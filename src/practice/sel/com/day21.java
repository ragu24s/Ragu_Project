package practice.sel.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day21 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\S RAGUPATHI\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/flights/");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor) driver;    //downcasting
	WebElement email = driver.findElement(By.id("twotabsearchtextbox"));
    Object a = js.executeScript("arguments[0].setAttribute('value','9750308485')",email);
	String a1=(String) a;
	System.out.println(a1);
	 Object b = js.executeScript("return arguments[0].getAttribute('type')",email);
	 String b1=(String) b;
	System.out.println(b1);
	WebElement best = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
	js.executeScript("arguments[0].click();",best);
	WebElement scrolldown = driver.findElement(By.xpath("//a[text()='Customer Service'] "));
	js.executeScript("arguments[0].scrollIntoView(true)",scrolldown);
	Thread.sleep(5000);
	WebElement scrollup = driver.findElement(By.xpath("//div[text()='Connect with Us']"));
	js.executeScript("arugments[0].scrollIntoView(false)", scrollup);
	
	
	
}
}
