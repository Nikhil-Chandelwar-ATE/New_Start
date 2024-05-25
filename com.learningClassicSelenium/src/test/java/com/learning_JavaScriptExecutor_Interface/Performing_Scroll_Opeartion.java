package com.learning_JavaScriptExecutor_Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Performing_Scroll_Opeartion {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver(); // Upcasting
//		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false)", element);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()", element);
	}

}
