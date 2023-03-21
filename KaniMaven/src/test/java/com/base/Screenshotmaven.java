package com.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotmaven {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Lenovo\\eclipse-workspace\\KaniMaven\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\Lenovo\\eclipse-workspace\\KaniMaven\\Screenshot\\kani.png");
		FileUtils.copyFile(from, to);
		
	}
}
