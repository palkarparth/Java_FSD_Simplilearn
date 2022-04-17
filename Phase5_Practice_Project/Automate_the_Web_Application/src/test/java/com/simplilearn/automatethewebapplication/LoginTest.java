package com.simplilearn.automatethewebapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest {
	private WebDriver driver;
	SoftAssert soft = new SoftAssert();

	@Test
	public void loginTest() {
		System.setProperty("webdriver.chrome.driver", "F:\\Download\\Phase5\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
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
		soft.assertEquals(expectedUrl, actualUrl);
	}

	@Test
	public void registrationTest() {
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

		WebElement phone = driver.findElement(By.id("id_cell_phone"));
		phone.sendKeys("7030768226");

		WebElement pass = driver.findElement(By.id("id_password"));
		pass.sendKeys("King@1234");

		WebElement submit = driver.findElement(By.id("registerButton"));
		submit.click();

		String actualUrl = "https://www.shine.com/registration/";
		String expectedUrl = driver.getCurrentUrl();
		soft.assertEquals(expectedUrl, actualUrl);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
