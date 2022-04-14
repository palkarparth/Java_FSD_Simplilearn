package com.simplilearn.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// Step1: Set driver property
		System.setProperty("webdriver.chrome.driver", "F:\\Download\\Phase5\\chromedriver.exe");

		// Step 2: create Instance of Chrome Driver
		WebDriver driver = new ChromeDriver();

		// Step 3: load the base URL which you want to test
		driver.get("https://www.shine.com/registration/");
		
		WebElement check = driver.findElement(By.id("id_privacy"));
		check.click();
		if(check.isSelected()) {
			System.out.println("Check-box is selected");
		} else {
			System.out.println("Check-box is not selected");
		}
		
		

	}

}
