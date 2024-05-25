package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPractice_Flipkart {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("mobile", Keys.ENTER);
		WebElement element = driver.findElement(By.xpath("(//select[@class='Gn+jFg'])[2]"));
		Select sel = new Select(element);
		
		for (int i = 0; i < sel.getOptions().size(); i++) {
			sel.selectByIndex(i);
			Thread.sleep(500);
		}

	}

}
