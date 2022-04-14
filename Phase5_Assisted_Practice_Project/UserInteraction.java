package com.simplilearn.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class UserInteraction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Download\\Phase5\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

		WebElement element = driver.findElement(By.name("q"));
		Actions builder = new Actions(driver);

		Action myAction = builder.moveToElement(element).click().keyDown(element, Keys.SHIFT).sendKeys(element, "Parth")
				.keyUp(element, Keys.SHIFT).doubleClick().contextClick().build();
		myAction.perform();

		driver.close();

	}

}
