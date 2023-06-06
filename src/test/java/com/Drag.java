package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.xpath("//@id='draggable')"));
		//WebElement source2 = driver.findElement(By.xpath("//*[text()='High Tatras 2']"));
		WebElement destination = driver.findElement(By.xpath("//@id='droppable')"));
//play.letcode.in/aui
		Actions act = new Actions(driver);
		act.dragAndDrop(source, destination).perform();
		//act.dragAndDrop(source2,destination).perform();

	}
}
