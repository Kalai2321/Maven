package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {

	public static WebDriver driver;

	public static void browserLaunch(String url) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get(url);
	}

	public static void title() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static String stringData(int row, int cell) throws IOException {
		File f = new File(
				"C:\\Users\\KALAI S\\OneDrive\\Documents\\Automation\\Eclipse WorkSpace\\MavenProject\\Excel\\DataDriven.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("Data");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String value = c.getStringCellValue();
		return value;
	}

	public static String numericData(int row, int cell) throws IOException {
		File f = new File(
				"C:\\Users\\KALAI S\\OneDrive\\Documents\\Automation\\Eclipse WorkSpace\\MavenProject\\Excel\\DataDriven.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("Data");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		double d = c.getNumericCellValue();
		long l = (long) d;
		String value = String.valueOf(l);
		return value;
	}

	public static void quit() {
		driver.quit();
	}
}