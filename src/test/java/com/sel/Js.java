package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Js {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		// driver.get("https://www.facebook.com/");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		// To send values to textboxes in UI without using sendKeys
		/*
		 * WebElement user = driver.findElement(By.id("email")); WebElement pass =
		 * driver.findElement(By.id("pass")); WebElement loginBtn =
		 * driver.findElement(By.name("login"));
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].setAttribute('value', 'HelloJava')", user);
		 * js.executeScript("arguments[0].setAttribute('value', '145548' )", pass);
		 * js.executeScript("arguments[0].click()", loginBtn);
		 */

		// To scroll up and Scroll down

		WebElement scrollDwn = driver.findElement(By.xpath("// *[contains(text(),'Back to top')]"));
		WebElement scrollUp = driver.findElement(By.id("twotabsearchtextbox"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", scrollDwn);
		js.executeScript("arguments[0].scrollIntoView(true)", scrollUp);

	}
}
