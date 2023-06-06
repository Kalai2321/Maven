package com.frame;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Junit {
	
	@Test
	public void test1() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.facebook.com/");
				System.out.println("Test1 success");
	}

	@Ignore
	@Test
	public void test2() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.redbus.in/");
		System.out.println("test2 success");
	}
	
	
}
