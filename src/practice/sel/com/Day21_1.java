package practice.sel.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day21_1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\S RAGUPATHI\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Cb%7Cfacebook%20log%20in%7C&placement=&creative=589460569900&keyword=facebook%20log%20in&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409266755%26loc_physical_ms%3D1007810%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwo_KXBhAaEiwA2RZ8hAM5UEIEVz2GOTcxceKIoNrKYOYY2mZv55GvBj5EW6LRRYMLGZdpJBoCuc4QAvD_BwE");
	driver.manage().window().maximize();
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 WebElement element = driver.findElement(By.xpath("//a[@href='/help/?ref=pf']"));
	 js.executeScript("arguments[0].scrollIntoView(false);", element);
	  Thread.sleep(5000);
	  WebElement element1 = driver.findElement(By.xpath("//div[text()='Create a new account']"));
		 js.executeScript("arguments[0].scrollIntoView(true);", element1);
       WebElement ele3 = driver.findElement(By.xpath("//div[text()='Date of birth']"));
		 js.executeScript("arguments[0].setAttribute('style','background: green; border: 2px solid red')",ele3 );

}
}
