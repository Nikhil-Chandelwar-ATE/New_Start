package com.learningWebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Manage_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://qspiders.com/");
		Thread.sleep(2000);
//		Options opt = driver.manage();
//		Window win = opt.window();
//		win.maximize();
//		optimized way, method chaining
		driver.manage().window().maximize(); // in every program after launching browser
//		Thread.sleep(2000);
//		driver.manage().window().fullscreen();
//		Thread.sleep(2000);
//		driver.manage().window().minimize();
		int height2 = driver.manage().window().getSize().getHeight();
		System.out.println(height2);
		int width2 = driver.manage().window().getSize().getWidth();
		System.out.println(width2);
//		getX, warning don't use this method in front of your better half
//		sometime it will return your x also
		int x_axis = driver.manage().window().getPosition().getX();
		System.out.println(x_axis);
		int y_axis = driver.manage().window().getPosition().getY();
		System.out.println(y_axis);
	}

}
