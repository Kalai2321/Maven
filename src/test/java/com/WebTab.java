package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.Base;

public class WebTab extends Base {
	public static void main(String[] args) {

		browserLaunch("https://letcode.in/table");
		driver.manage().window().maximize();

		// Dynamic Table to get a row values in console - gt locator till tr tag, and use td tag in for loop
		WebElement table = driver.findElement(By.id("simpletable"));
		List<WebElement> rowValues = table.findElements(By.xpath("//table[@id='simpletable']//tbody//tr"));
		
		for (WebElement r : rowValues) {
		List<WebElement> rows = r.findElements(By.xpath("//table[@id='simpletable']//tbody//td"));
		WebElement rowVal = rows.get(1);
		System.out.println(rowVal.getText());
		}
		//Dynamic tABLE   to select checkbox
		
		
		
		
		
	}
}
