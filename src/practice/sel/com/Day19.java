package practice.sel.com;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day19 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\S RAGUPATHI\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement mob = driver.findElement(By.xpath("(// a[contains(@href,'/mobile-phones/')])"));  
	 String chord = Keys.chord(Keys.CONTROL,Keys.ENTER);
	 mob.sendKeys(chord);
	 WebElement today = driver.findElement(By.xpath("(// a[contains(@href,'/deals?ref')])"));  
	 String chord1 = Keys.chord(Keys.CONTROL,Keys.ENTER);
	 today.sendKeys(chord1);
     WebElement sell = driver.findElement(By.xpath("(// a[contains(@href,'/gp/bestsellers/')])"));  
	 String chord2 = Keys.chord(Keys.CONTROL,Keys.ENTER);
	 sell.sendKeys(chord2); 
	 WebElement book = driver.findElement(By.xpath("(// a[contains(@href,'/Books/b/?ie')])"));  
	 String chord3 = Keys.chord(Keys.CONTROL,Keys.ENTER);
	 book.sendKeys(chord3);

}
}
