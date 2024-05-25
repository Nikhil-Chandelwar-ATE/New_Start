package com.learningWebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Close_Method {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://qspiders.com/");
		
		Thread.sleep(5000);
		driver.close();
	}

}
