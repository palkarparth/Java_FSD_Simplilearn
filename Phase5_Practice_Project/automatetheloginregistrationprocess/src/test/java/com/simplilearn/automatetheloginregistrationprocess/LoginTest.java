package com.simplilearn.automatetheloginregistrationprocess;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTest {

	@Test
	void testLogin() {
		// Step1: Set driver property
		System.setProperty("webdriver.chrome.driver", "F:\\Download\\Phase5\\chromedriver.exe");

		// Step 2: create Instance of Chrome Driver
		WebDriver driver = new ChromeDriver();

		// Step 3: load the base URL which you want to test
		driver.get("https://www.facebook.com/");

		// Email
		WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("palkarparth24@gmail.com");
        
        // Password
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Parth@1998");
		
		// Login
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		String actualUrl = "https://www.facebook.com/";
		String expectedUrl = driver.getCurrentUrl();
		assertEquals(expectedUrl, actualUrl);
	}

}
