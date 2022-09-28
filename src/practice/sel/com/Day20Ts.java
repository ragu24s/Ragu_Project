package practice.sel.com;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class Day20Ts {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\S RAGUPATHI\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://weather.com/en-IN/weather/today/l/11.65,78.92?par=google");
	driver.manage().window().maximize();
	
	// to take TakeScreenshot //so DownCasting
	TakesScreenshot vk=(TakesScreenshot) driver;
	  File source = vk.getScreenshotAs(OutputType.FILE);
      File destination =new File("C:\\Users\\S RAGUPATHI\\eclipse-workspace\\Selenium_Testing\\ScreenShot\\ragu1.png");
      FileHandler.copy(source, destination);
	  
	
	
	
	
	
}
}
