package com.practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qspiders.com/");
		Thread.sleep(2000);
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		driver.manage().window().getSize().getHeight();
		
		Options opt = driver.manage();
		Window win = opt.window();
		Dimension size2 = win.getSize();
		int height = size2.getHeight();
	}
}
