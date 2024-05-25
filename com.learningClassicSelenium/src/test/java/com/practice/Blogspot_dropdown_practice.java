package com.practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Blogspot_dropdown_practice {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.name("country"));
		Select sel = new Select(dropdown);
		System.out.println(sel.isMultiple());
		
		List<WebElement> option = sel.getOptions();
		for (int i = 0; i < option.size(); i++) {

			sel.selectByIndex(i);
			Thread.sleep(500);

		}
		
	}
}
