package com.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertSample {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		/*WebElement simpleAlert = driver.findElement(By.xpath("//*[text()='Click me'])[1])"));
		simpleAlert.click();
		Thread.sleep(2000);

		Alert a = driver.switchTo().alert();
		a.accept();*/
		WebElement confirmAlert = driver.findElement(By.id("confirmButton"));
		confirmAlert.click();
		Thread.sleep(2000);
		
		Alert a1 = driver.switchTo().alert();
		a1.dismiss();

	}

}
