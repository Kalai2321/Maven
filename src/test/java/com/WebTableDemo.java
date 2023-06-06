package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.github.dockerjava.api.model.Driver;
import com.test.Base;


public class WebTableDemo extends Base {
	public static void main(String[] args) {
		browserLaunch("https://seleniumpractise.blogspot.com/2021/08/");
		driver.manage().window().maximize();
		// Get :Locator for over all table and store it in list, get list size and print
		// it (will get the names of column)
		List<WebElement> allHeaders = driver.findElements(By.xpath("//table[@id='customers']//th"));
		int ah = allHeaders.size();
		System.out.println(ah);
		// to print the names/header names of the column
		for (WebElement w : allHeaders) {
			String allH = w.getText();
			System.out.println(allH);
		}

		// to get value match in web table - get all the values from table and match
		// with the word required, pass it as variable

		List<WebElement> allValues = driver.findElements(By.xpath("//table[@id='customers']//td"));
		for (WebElement v : allValues) {
			String t1 = v.getText();
			System.out.println(t1);

			// to match exact value
			if (t1.equals("Selenium")) {
				System.out.println("Testcase Passed");
				break;
			}
		}

		// Dynamic table - to click checkbox that is present before selective word from
		// Web table - preceding keyword

		WebElement dynTab = driver.findElement(By.id("customers"));
		WebElement jBox = dynTab.findElement(By.xpath("//*[contains (text() , 'Java')]//preceding-sibling::td//input"));
		jBox.click();

		// Dynamic Table - to click link following the specific word in Web table
		// -following keyword in xpath
		WebElement dLink = driver.findElement(By.xpath("//*[contains (text() , 'Java')]//following-sibling::td//a"));
		dLink.click();
		

	}

}