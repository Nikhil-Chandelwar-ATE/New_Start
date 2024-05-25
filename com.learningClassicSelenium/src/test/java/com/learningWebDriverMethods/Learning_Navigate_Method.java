package com.learningWebDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Navigate_Method {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qspiders.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
//		to(String)
		driver.navigate().to("https://qspiders.com/corporates");
		Thread.sleep(2000);
		driver.navigate().to("https://qspiders.com/courses");
		
	}

}
