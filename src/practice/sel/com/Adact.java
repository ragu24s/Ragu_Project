package practice.sel.com;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Adact {
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\S RAGUPATHI\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
 	WebDriver driver=new ChromeDriver();
 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://adactinhotelapp.com/");	
    driver.manage().window().maximize();
    
    driver.findElement(By.id("username")).sendKeys("ragu2000");
    driver.findElement(By.id("password")).sendKeys("Ragu@2000");
    driver.findElement(By.id("login")).click();
    WebElement a = driver.findElement(By.id("location"));
    Select r=new Select(a);
    r.selectByVisibleText("Sydney");
    WebElement b = driver.findElement(By.id("hotels"));
    Select r1=new Select(b);
    r1.selectByVisibleText("Hotel Creek");
    
    WebElement c = driver.findElement(By.id("room_type"));
    Select r2=new Select(c);
    r2.selectByVisibleText("Standard");
    
    WebElement d = driver.findElement(By.id("room_nos"));
    Select r3=new Select(d);
    r3.selectByValue("1");
    
     driver.findElement(By.xpath("//input[@name='datepick_in']")).sendKeys("14/09/2022");
   
     driver.findElement(By.xpath("//input[@name='datepick_out']")).sendKeys("14/10/2022");
    
     WebElement e = driver.findElement(By.id("adult_room"));
     Select r4=new Select(e);
     r4.selectByValue("2");
     
     WebElement f = driver.findElement(By.id("child_room"));
     Select r5=new Select(f);
     r5.selectByValue("2");
     
     driver.findElement(By.id("Submit")).click();
     
     WebElement g = driver.findElement(By.id("radiobutton_0"));
     g.click();
     System.out.println("Radio Button Option 1 Selected");
     
     driver.findElement(By.id("continue")).click();
     
     driver.findElement(By.id("first_name")).sendKeys("ragu");
     
     driver.findElement(By.id("last_name")).sendKeys("S");
     driver.findElement(By.id("address")).sendKeys("kaniyamoor,kallakurichi");
     driver.findElement(By.id("cc_num")).sendKeys("1112111411121112");
     
     WebElement h = driver.findElement(By.id("cc_type"));
     Select r6=new Select(h);
     r6.selectByValue("VISA");
    
     WebElement j = driver.findElement(By.id("cc_exp_month"));
     Select r7=new Select(j);
     r7.selectByValue("2");
     
     WebElement k = driver.findElement(By.id("cc_exp_year"));
     Select r8=new Select(k);
     r8.selectByValue("2016");
     
     driver.findElement(By.id("cc_cvv")).sendKeys("1234");
     
     driver.findElement(By.id("book_now")).click();
     
     
     driver.findElement(By.id("my_itinerary")).click();
     
     TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
	    File destination =new File("C:\\Users\\S RAGUPATHI\\eclipse-workspace\\Maven_Practice\\Takescreenshot1");
	    FileHandler.copy(source, destination);
     
     
     driver.quit();
     
}}
