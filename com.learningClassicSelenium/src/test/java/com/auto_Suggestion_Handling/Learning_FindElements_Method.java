package com.auto_Suggestion_Handling;

/*
 * @author Nikhil chandelwar ATE
 * 
 */
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_FindElements_Method {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("APjFqb")).sendKeys("mobile");
		Thread.sleep(1000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='lnnVSe']"));
		Thread.sleep(1000);
//		in suggestions, we have 15 WE / reference will get store
//		in suggestion, we have 1 WE 
		for (WebElement suggestion : suggestions) {
			System.out.println(suggestion.getText());
			if (suggestion.getText().equals("mobile shop near me")) {
				suggestion.click();
				break;
			}
		}
	}
}
