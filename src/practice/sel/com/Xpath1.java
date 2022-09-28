package practice.sel.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\S RAGUPATHI\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	
	WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
	String a = user.getAttribute("value");
	System.out.println(a);
	user.sendKeys("24022000");
	String b = user.getAttribute("value");
	System.out.println(b);
	WebElement reg = driver.findElement(By.xpath("// a[@href='Register.php']"));
	String text = reg.getText();
	System.out.println(text);
}
}
