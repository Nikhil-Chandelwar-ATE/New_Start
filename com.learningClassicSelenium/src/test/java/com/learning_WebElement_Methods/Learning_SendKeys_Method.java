package com.learning_WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_SendKeys_Method {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");

		driver.findElement(By.id("Email")).sendKeys("nikhil26@gmail.com", Keys.TAB, "nikhil123", Keys.ENTER);
	}

}
