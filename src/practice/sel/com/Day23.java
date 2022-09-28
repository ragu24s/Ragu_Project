package practice.sel.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day23 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\S RAGUPATHI\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
 	WebDriver driver=new ChromeDriver();
    driver.get("https://www.leafground.com/select.xhtml");	
    driver.manage().window().maximize();
    WebElement a = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
    Select r=new Select(a);
    r.selectByVisibleText("Cypress");
    
}
}


