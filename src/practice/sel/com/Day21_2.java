package practice.sel.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day21_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\S RAGUPATHI\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/facebook/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement elmt = driver.findElement(By.xpath("(//span[text()='Log In'])[3]"));
		js.executeScript("arguments[0].click();", elmt);
		
		WebElement elmt1 = driver.findElement(By.id("email"));
		
		js.executeScript("arguments[0].setAttribute('value','9750308485')", elmt1);
		Object a = js.executeScript("return arguments[0].getAttribute('type')", elmt1);

		String a1=(String) a;
		System.out.println(a1);
	
		WebElement elmt2 = driver.findElement(By.xpath("//a[text()='Contact uploading and non-users']"));
		js.executeScript("arguments[0].scrollIntoView(true);", elmt2);
		Thread.sleep(2000);
		
		WebElement elmt3 = driver.findElement(By.xpath("//img[@class='_97vu img']"));
	    js.executeScript("arguments[0].scrollIntoView(false);", elmt3);
		
		js.executeScript("arguments[0].setAttribute('style','background:yellow; border: 2px solid black')", elmt1);
	
	}
}
