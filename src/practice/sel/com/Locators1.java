package practice.sel.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators1 { 
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\S RAGUPATHI\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe ");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement all = driver.findElement(By.xpath("//i[contains(@class,'hm-icon')]"));
	all.click();
	WebElement best = driver.findElement(By.xpath("(//a[contains(@href,'bestsellers_0_1_1_2')])"));
	best.click();
	Thread.sleep(3000);
	driver.navigate().back();
	WebElement all1 = driver.findElement(By.xpath("//i[contains(@class,'hm-icon')]"));
	all1.click();
	WebElement newreleases = driver.findElement(By.xpath("(//a[text()='New Releases'])[2] "));
	newreleases.click();
	
	
	
}
}
