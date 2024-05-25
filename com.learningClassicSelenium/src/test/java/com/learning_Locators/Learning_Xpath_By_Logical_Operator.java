package com.learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Xpath_By_Logical_Operator {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text' and @value='Search store']")).sendKeys("books");
		driver.findElement(By.xpath("//input[@type='submit' and @ class='button-1 search-box-button' and @value='Search']")).click();
		
	}
}
