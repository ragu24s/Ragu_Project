package practice.sel.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowerLaunch {
	
	public static void main(String[] args) throws InterruptedException{
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\S RAGUPATHI\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
            String r = driver.getTitle();
            System.out.println(r);
            String r1 = driver.getCurrentUrl();
            System.out.println(r1);
            
            WebElement email = driver.findElement(By.id("email"));
            email.sendKeys("9750308485");
            WebElement pass = driver.findElement(By.name("pass"));
			pass.sendKeys("24022000"); 
			WebElement login = driver.findElement(By.name("login"));
            login.click();
           
            
		    Thread.sleep(10000);
		  
		     driver.close();
	        		
	    }		
	
	}

	


