package testOne;

import java.text.Normalizer.Form;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOne {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\systemProject\\chromedrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String baseurl = "https://www.flipkart.com/";
		driver.get(baseurl);
		

		WebElement close = driver.findElement(By.className("_2Sn47c"));
		close.click();
		
		Thread.sleep(5000);
		
		WebElement searchbox = driver.findElement(By.className("_3704LK"));
		searchbox.sendKeys("iphone 12 ");
		
	
		WebElement button = driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]"));
		button.click();
		 
		
		}
}
