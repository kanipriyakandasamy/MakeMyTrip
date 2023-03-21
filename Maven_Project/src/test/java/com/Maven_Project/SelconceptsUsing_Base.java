package com.Maven_Project;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base_Class;

public class SelconceptsUsing_Base extends Base_Class {

	public static void main(String[] args) throws IOException, AWTException {

		setProperty();
		launchUrl("https://www.amazon.in/");
		maxi();
		
		WebElement findElement = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		clickOnElement(findElement);
		
		scrnShot("C:\\Users\\Lenovo\\eclipse-workspace\\Maven_Project\\Screeshot\\kani.png");
		getTitle();
		getCurrentUrl();
		navigateTo("https://demoqa.com/alerts");
		
		WebElement findElement1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
		clickOnElement(findElement1);
		alert();
		implicitWait();
		backpage();
		
		WebElement findElement2 = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		dropdwn(findElement2);
		
		WebElement findElement3 = driver.findElement(By.xpath("//a[text()='Customer Service']"));
		actions(findElement3);
		robotclass();

	}

}
