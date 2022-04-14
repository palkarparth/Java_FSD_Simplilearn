package com.simplilearn.automatetheloginregistrationprocess;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class RegistrationTest {

	@Test
	void registrationTest() {
		// Step1: Set driver property
		System.setProperty("webdriver.chrome.driver", "F:\\Download\\Phase5\\chromedriver.exe");

		// Step 2: create Instance of Chrome Driver
		WebDriver driver = new ChromeDriver();

		// Step 3: load the base URL which you want to test
		driver.get("https://www.shine.com/registration/");
		
		WebElement name = driver.findElement(By.id("id_name"));
        name.sendKeys("Parth Palkar");
        
        WebElement email = driver.findElement(By.id("id_email"));
        email.sendKeys("palkarparth24@gmail.com");
        
        WebElement phone= driver.findElement(By.id("id_cell_phone"));
        phone.sendKeys("7030768226");
        
        WebElement pass= driver.findElement(By.id("id_password"));
        pass.sendKeys("King@1234");
        
        WebElement submit= driver.findElement(By.id("registerButton"));
        submit.click();
        
        String actualUrl = "https://www.shine.com/registration/";
		String expectedUrl = driver.getCurrentUrl();
		assertEquals(expectedUrl, actualUrl);
	}

}
