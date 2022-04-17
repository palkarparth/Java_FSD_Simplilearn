package com.simplilearn.evaluatingtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

	SoftAssert soft = new SoftAssert();
	WebDriver driver;

	@Test
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "F:\\Download\\Phase5\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(dependsOnMethods = { "launch" })
	public void Facebook() {
		driver.get("https://www.facebook.com");
		soft.assertEquals("Facebook – log in or sign up", driver.getTitle());
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(dependsOnMethods = { "Facebook" })
	public void Login() {
		driver.findElement(By.id("email")).sendKeys("palkarparth24@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Parth@1998");
		driver.findElement(By.name("login")).click();
		soft.assertAll();

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
