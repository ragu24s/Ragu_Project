package practice.sel.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day22 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\S RAGUPATHI\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
     	WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Frames.html");	
	    driver.manage().window().maximize();
	    // single frame
	    WebElement elmt = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
	    driver.switchTo().frame(elmt);
	    WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	    name.sendKeys("ragupathi");
	    driver.switchTo().defaultContent();
	    // multi frame
	    driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	    WebElement elmt1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(elmt1);
		WebElement elmt2 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(elmt2);
	
		WebElement name1 = driver.findElement(By.xpath("//input[@type='text']"));
		name1.sendKeys("ragupathi");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		// go to webTable
	    driver.findElement(By.xpath("//a[@href='WebTable.html']")).click();
	
	    
	}

}
