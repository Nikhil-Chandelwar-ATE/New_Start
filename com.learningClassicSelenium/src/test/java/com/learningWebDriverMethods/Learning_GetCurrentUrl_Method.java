package com.learningWebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_GetCurrentUrl_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
//		method to fetch the url - getCurrentUrl()
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (url.equals("https://www.facebook.com/")) {
			System.out.println("Welcome page displayed");
		} else {
			System.out.println("Welcome page not displayed");
		}
	}

}
