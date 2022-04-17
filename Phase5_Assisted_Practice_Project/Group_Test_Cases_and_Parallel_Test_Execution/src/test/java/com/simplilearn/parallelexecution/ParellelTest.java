package com.simplilearn.parallelexecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParellelTest {

	WebDriver driver;

	@Test(groups = "Chrome")
	public void launchChrome() {
		System.setProperty("webdriver.chrome.driver", "F:\\Download\\Phase5\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(groups = "Chrome", dependsOnMethods = "launchChrome")
	public void facebook1() {
		System.out.println(Thread.currentThread().getId());
		driver.findElement(By.id("email")).sendKeys("palkarparth24@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Parth@1998");
		driver.findElement(By.id("loginbutton")).click();
	}

	@Test(groups = "Firefox")
	public void launchFirefox() {
		System.setProperty("webdriver.gecko.driver", "F:\\Download\\Phase5\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");

		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(groups = "Firefox", dependsOnMethods = "launchFirefox")
	public void facebook2() {
		System.out.println(Thread.currentThread().getId());
		driver.findElement(By.id("email")).sendKeys("palkarparth24@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Parth@1998");
		driver.findElement(By.id("loginbutton")).click();
	}
}
