package com.simplilearn.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OracalRegistration {

	public static void main(String[] args) {
		// Step1: Set driver property
		System.setProperty("webdriver.chrome.driver", "F:\\Download\\Phase5\\chromedriver.exe");

		// Step 2: create Instance of Chrome Driver
		WebDriver driver = new ChromeDriver();

		// Step 3: load the base URL which you want to test
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		
		WebElement email = driver.findElement(By.id("sView1:r1:0:email::content"));
		email.sendKeys("palkarparth24@gmail.com");
		
		WebElement password = driver.findElement(By.id("sView1:r1:0:password::content"));
		password.sendKeys("King@789");
		
		WebElement rePassword = driver.findElement(By.id("sView1:r1:0:retypePassword::content"));
		rePassword.sendKeys("King@789");
		
		WebElement country = driver.findElement(By.id("sView1:r1:0:country::content"));
		country.sendKeys("India");
		
		WebElement fname = driver.findElement(By.id("sView1:r1:0:firstName::content"));
		fname.sendKeys("Parth");
		
		WebElement lname = driver.findElement(By.id("sView1:r1:0:lastName::content"));
		lname.sendKeys("Palkar");
		
		WebElement jobTitle = driver.findElement(By.id("sView1:r1:0:jobTitle::content"));
		jobTitle.sendKeys("Employee");
		
		WebElement workPhone = driver.findElement(By.id("sView1:r1:0:workPhone::content"));
		workPhone.sendKeys("7030768226");
		
		WebElement companyName = driver.findElement(By.id("sView1:r1:0:companyName::content"));
		companyName.sendKeys("Simplilearn");
		
		WebElement address = driver.findElement(By.id("sView1:r1:0:address1::content"));
		address.sendKeys("Flat No.T-1,Adwait App-2, Chandrapur");

	}

}
