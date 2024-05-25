package com.learning_Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_JS_Confirmation_Popup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver(); // Upcasting
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
	}

}
