package practice.sel.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Xpath {


public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\S RAGUPATHI\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
	WebDriver v18 = new ChromeDriver();
	v18.get("https://www.facebook.com/login/");
	v18.manage().window().maximize();
	String ms = v18.getTitle();
	System.out.println(ms);
	String faf = v18.getCurrentUrl();
	System.out.println(faf);
	WebElement user = v18.findElement(By.xpath("//input[@type='text']"));
	user.sendKeys("9750308485");
	WebElement password = v18.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("24022000");
	WebElement login = v18.findElement(By.name("login")); 
	login.click();
	Thread.sleep(1000,2000);
	v18.navigate().refresh();
	Thread.sleep(1000,2000);
	v18.close();
	
	
}
}
