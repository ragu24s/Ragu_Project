package practice.sel.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day24 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\S RAGUPATHI\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	    driver.get("http://www.uitestpractice.com/");	
	    driver.manage().window().maximize();
	    WebElement a = driver.findElement(By.xpath("//a[text()='Select']"));
	    a.click();
	    WebElement single = driver.findElement(By.id("countriesSingle"));
	    
	    Select s=new Select(single);
	    s.selectByVisibleText("England ");
	    
	    WebElement mul = driver.findElement(By.id("countriesMultiple"));
	    
	    Select m1=new Select(mul);
	    m1.selectByValue("india");
	    m1.selectByValue("usa");
	    
	    List<WebElement> op = m1.getOptions();
	    
	    System.out.println(op.size());
	    
	    for (WebElement ele : op) {
			System.out.println(ele.getText());		
		}
	    System.out.println("        666      ");
	    
	    
	    boolean b = m1.isMultiple();
	    System.out.println(b);
	    
	    System.out.println("=====");
	 
	    WebElement c = m1.getFirstSelectedOption();
	    System.out.println(c);
	    
	    boolean d = mul.isDisplayed();
	    System.out.println(d);
	    
	    boolean e = mul.isEnabled();
        System.out.println(e);
        
        boolean f = mul.isSelected();
	    System.out.println(f);
	
	}}
