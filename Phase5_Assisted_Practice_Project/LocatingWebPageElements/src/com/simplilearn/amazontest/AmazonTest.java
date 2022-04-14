package com.simplilearn.amazontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args) {
		// Step1: Set driver property
		System.setProperty("webdriver.chrome.driver", "F:\\Download\\Phase5\\chromedriver.exe");

		// Step 2: create Instance of Chrome Driver
		WebDriver driver = new ChromeDriver();

		// Step 3: load the base URL which you want to test
		driver.get(
				"https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26adgrpid%3D60571832564%26ext_vrnc%3Dhi%26gclid%3DCjwKCAjwo8-SBhAlEiwAopc9W-BV3Z65EMXwP3jnmkZM-4G8pASBHsioBV20mSOktt97qtxKAkEfcRoCj6MQAvD_BwE%26hvadid%3D486387378181%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9299860%26hvnetw%3Dg%26hvpone%3D%26hvpos%3D%26hvptwo%3D%26hvqmt%3De%26hvrand%3D11271170450570439596%26hvtargid%3Dkwd-296458789801%26hydadcr%3D14452_2154371%26ref%3Dpd_sl_nxqtetlae_e%26tag%3Dgooghydrabk1-21%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		// Using ID as a Locator
		WebElement yourName = driver.findElement(By.id("ap_customer_name"));
		yourName.sendKeys("Parth Palkar");
		
		// Using Name as a Locator
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("palkarparth24@gmail.com");
		
		// Using Xpath as a Locator
		WebElement password = driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
		password.sendKeys("Parth@123");
		
		driver.close();

	}

}
