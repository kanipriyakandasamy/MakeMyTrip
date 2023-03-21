import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
	
	public static WebDriver driver;
	public static void getDriver() {
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Lenovo\\eclipse-workspace\\KaniMaven\\ChromeDriver\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	}
	
}
