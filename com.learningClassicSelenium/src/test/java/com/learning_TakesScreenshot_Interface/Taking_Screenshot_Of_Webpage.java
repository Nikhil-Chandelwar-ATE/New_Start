package com.learning_TakesScreenshot_Interface;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Taking_Screenshot_Of_Webpage {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();	//Upcasting
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
//		Typecasting to TakesScreenhost
		TakesScreenshot ts = (TakesScreenshot) driver;
//		We have taken the screenshot, but it is present in RAM
		File src = ts.getScreenshotAs(OutputType.FILE);	//it is in RAM
//		We are creating the File in ROM/ Main memory/ System memory
		File dest = new File("./screenshots/flipkartWelcomePage.png");
//		Copy the screenshot from RAM to Main Memory
		FileHandler.copy(src, dest);
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
