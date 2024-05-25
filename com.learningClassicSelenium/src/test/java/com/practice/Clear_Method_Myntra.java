package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Method_Myntra {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		WebElement searchTF = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		searchTF.sendKeys("mobile");
		Thread.sleep(1000);
		searchTF.clear();
		searchTF.sendKeys("tshirt");
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		
	}
}
