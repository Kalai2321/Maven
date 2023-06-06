package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Sample {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in//");
		driver.manage().window().maximize();
		// TO click the text in UI
		WebElement mobile = driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
		// TO click the text in UI
		// mobile.click();
		// To right click the tag or word(Mobile)
		Actions act = new Actions(driver);
		act.moveToElement(mobile).perform();
		act.contextClick(mobile).perform();

	}

}
