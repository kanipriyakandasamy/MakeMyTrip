package selliniumproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mynthra {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		driver.manage().window().maximize();
		List<WebElement> products = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		System.out.println("Total number of products is  "+ products.size());
	}
}
public void getminproductvalue()
{
	List<WebElement> prices= driver.findelements(By.xpath("//spam["product[@class]))
}