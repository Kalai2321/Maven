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

public class Base {

	public static WebDriver driver;

	public static void browserLaunch(String url) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get(url);
	}
public static void max() {
	driver.manage().window().maximize();
}
	public static void title() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static String stringData(int row, int cell) throws IOException {
		File f = new File(
				"C:\\Users\\KALAI S\\OneDrive\\Documents\\Automation\\Eclipse WorkSpace\\MavenProject\\Excel\\POM_DataDriven.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("POM Data");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String value = c.getStringCellValue();
		return value;
	}

	public static String stringData1(int row, int cell) throws IOException {
		File f = new File(
				"C:\\Users\\KALAI S\\OneDrive\\Documents\\Automation\\Eclipse WorkSpace\\MavenProject\\Excel\\POM_DataDriven.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("POM Data");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String value = c.getStringCellValue();
		return value;
	}

//Send values for SearhHotel Class
	public static String sendLocation(int row, int cell) throws IOException {
		File f = new File(
				"C:\\Users\\KALAI S\\OneDrive\\Documents\\Automation\\Eclipse WorkSpace\\MavenProject\\Excel\\POM_DataDriven.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("POM Data");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String value = c.getStringCellValue();
		return value;
	}

	public static String sendHotel(int row, int cell) throws IOException {
		File f = new File(
				"C:\\Users\\KALAI S\\OneDrive\\Documents\\Automation\\Eclipse WorkSpace\\MavenProject\\Excel\\POM_DataDriven.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("POM Data");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String value = c.getStringCellValue();
		return value;
	}

	public static String sendRoomType(int row, int cell) throws IOException {
		File f = new File(
				"C:\\Users\\KALAI S\\OneDrive\\Documents\\Automation\\Eclipse WorkSpace\\MavenProject\\Excel\\POM_DataDriven.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("POM Data");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String value = c.getStringCellValue();
		return value;
	}

	public static String sendNoOfRooms(int row, int cell) throws IOException {
		File f = new File(
				"C:\\Users\\KALAI S\\OneDrive\\Documents\\Automation\\Eclipse WorkSpace\\MavenProject\\Excel\\POM_DataDriven.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("POM Data");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String value = c.getStringCellValue();
		return value;
	}

	public static String sendCheckInDate(int row, int cell) throws IOException {
		File f = new File(
				"C:\\Users\\KALAI S\\OneDrive\\Documents\\Automation\\Eclipse WorkSpace\\MavenProject\\Excel\\POM_DataDriven.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("POM Data");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String value = c.getStringCellValue();
		return value;
	}

	public static String sendCheckOutDate(int row, int cell) throws IOException {
		File f = new File(
				"C:\\Users\\KALAI S\\OneDrive\\Documents\\Automation\\Eclipse WorkSpace\\MavenProject\\Excel\\POM_DataDriven.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("POM Data");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String value = c.getStringCellValue();
		return value;
	}
	public static String sendAdultRoom(int row, int cell) throws IOException {
		File f = new File(
				"C:\\Users\\KALAI S\\OneDrive\\Documents\\Automation\\Eclipse WorkSpace\\MavenProject\\Excel\\POM_DataDriven.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("POM Data");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String value = c.getStringCellValue();
		return value;
	}
	public static String sendChildRoom(int row, int cell) throws IOException {
		File f = new File(
				"C:\\Users\\KALAI S\\OneDrive\\Documents\\Automation\\Eclipse WorkSpace\\MavenProject\\Excel\\POM_DataDriven.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("POM Data");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String value = c.getStringCellValue();
		return value;
	}
	
	public static String ccNumber(int row, int cell) throws IOException {
		File f = new File(
				"C:\\Users\\KALAI S\\OneDrive\\Documents\\Automation\\Eclipse WorkSpace\\MavenProject\\Excel\\POM_DataDriven.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("POM Data");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		double d = c.getNumericCellValue();
		long l = (long)d;
		String value = String.valueOf(l);
		return value;
	}
	
	public static void quit() {
		driver.quit();
	}
}
