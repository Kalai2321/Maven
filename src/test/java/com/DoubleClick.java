package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement doubleClick = driver.findElement(By.xpath("//*[contains (text(),'Double-Click Me To See Alert')]"));
		//WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions builder = new Actions(driver);
		builder.doubleClick(doubleClick).perform();
		//builder.moveToElement(rightClick).perform();
		// builder.contextClick(rightClick).perform();
	}
}
