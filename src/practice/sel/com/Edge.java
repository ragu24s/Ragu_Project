package practice.sel.com;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Edge {
	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.edge.driver","C:\\Users\\S RAGUPATHI\\eclipse-workspace\\Selenium_Testing\\Driver\\msedgedriver.exe");
			
			WebDriver driver = new EdgeDriver ();
			
			driver.get("https://www.youtube.com/");
			
			driver.manage().window().maximize();
			
			String r = driver.getTitle();
			System.out.println(r);
			
			String r1 = driver.getCurrentUrl();
			System.out.println(r1);
					
			driver.navigate().to("https://www.youtube.com/watch?v=GmQeDJMnwcM");
			 
			String r2 = driver.getTitle();
		    System.out.println(r2);
				
			String r3 = driver.getCurrentUrl();
			System.out.println(r3);
						
			Thread.sleep(5000);
			
			driver.navigate().back();
			 
		    Thread.sleep(3000);
			
			driver.navigate().to("https://www.youtube.com/watch?v=q9Iv1uEcfTs");
			 
			String r4 = driver.getTitle();
			System.out.println(r4);
				
			String r5 = driver.getCurrentUrl();
			System.out.println(r5);
						
			Thread.sleep(5000);
			
			driver.navigate().back();
			
			Thread.sleep(5000);
			
			driver.navigate().forward();
			
			Thread.sleep(5000);
			
			driver.navigate().back();
			
			Thread.sleep(5000);
			
			driver.navigate().to("https://www.youtube.com/watch?v=yFlarM35vxA");
			
			Thread.sleep(3000);
			
			driver.navigate().back();
			
			Thread.sleep(5000);
			
			driver.navigate().refresh();
			
			Thread.sleep(5000);
			
			driver.close();
		}

		}


