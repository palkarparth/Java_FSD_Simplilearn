package com.simplilearn.cssandxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		// Step1: Set driver property
				System.setProperty("webdriver.chrome.driver", "F:\\Download\\Phase5\\chromedriver.exe");

				// Step 2: create Instance of Chrome Driver
				WebDriver driver = new ChromeDriver();

				// Step 3: load the base URL which you want to test
				driver.get("https://www.facebook.com/");
				
				// 	Use Path as a CSS Selector
				WebElement email = driver.findElement(By.cssSelector("#email"));
				email.sendKeys("palkarparth24@gmail.com");
				
				// XPath
				WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"));
				password.sendKeys("qwertyuiop");
				
				WebElement login = driver.findElement(By.xpath("#u_0_d_yk"));
				login.submit();
				
//				driver.close();

	}

}
