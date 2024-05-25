package com.learningWebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_GetTitle_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
//		fetch the title using getTitle() method
		String title = driver.getTitle();
		System.out.println(title);
		
//		is used for validation purpose
		if (title.equals("Facebook – log in or sign up")) {
			System.out.println("Welcome page is displayed..");
		} else {
			System.out.println("Invalid page displayed");
		}
	}

}
