package practice.sel.com;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day27 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\S RAGUPATHI\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
 	WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in/");	
    driver.manage().window().maximize();
    
    String w1 = driver.getWindowHandle();
   
    WebElement best = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
    WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
    WebElement today = driver.findElement(By.xpath("//a[@href='/deals?ref_=nav_cs_gb']"));
   
	String key = Keys.chord(Keys.CONTROL,Keys.ENTER);
    
	best.sendKeys(key);
    mob.sendKeys(key);
    today.sendKeys(key);
    
     Set<String> w = driver.getWindowHandles();
     for (String str : w){
   if (w1.equals(str))
   {
	driver.switchTo().window(w1).getTitle();
	System.out.println("parent window id is "+w1); 
	} 
   else  {
	 String title = driver.switchTo().window(str).getTitle();
	 System.out.println(title);
	  System.out.println(" All window id is  "+w);
	  driver.close();
 }}}}
