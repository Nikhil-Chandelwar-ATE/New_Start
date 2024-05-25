package com.learningWebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Get_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
//		call the method by using reference variable
		driver.get("https://www.flipkart.com/");
	}

}
