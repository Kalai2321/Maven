package com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.Utility;

public class DataDriven extends Utility {
	public static void main(String[] args) throws IOException {
		browserLaunch("https://www.facebook.com/");
		title();
		driver.manage().window().maximize();
		//driver.switchTo().frame(0);
		
		//Sending values to textbox
		driver.findElement(By.id("email")).sendKeys(stringData(1,0));
		driver.findElement(By.id("pass")).sendKeys(numericData(1,1));
		quit();
}
}

