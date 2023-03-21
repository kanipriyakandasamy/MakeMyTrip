package systemProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassOne {
   public static void main(String[] args) throws Throwable {
	 System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Lenovo\\eclipse-workspace\\systemProject\\chromedrive\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.facebook.com/");
	  
	  Thread.sleep(5000);
	 driver.get("https://www.flipkart.com/");
	 
	 Thread.sleep(5000);
	 
	 driver.get("https://www.facebook.com/");
	 
	 String title=driver.getTitle();
	 System.out.println(title);
	 System.out.println(driver.getCurrentUrl());
	 
	 driver.navigate().back();
	 System.out.println(driver.getCurrentUrl());
	 System.out.println(driver.getTitle());
	 driver.quit();
	
	 
	 
}
}
