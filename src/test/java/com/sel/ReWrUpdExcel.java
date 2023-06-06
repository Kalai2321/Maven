package com.sel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReWrUpdExcel {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Automation\\Eclipse WorkSpace\\MavenProject\\Excel\\Read Write and Update Excel.xlsx");

		// To read from Excel
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("Java");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		String s1 = c.getStringCellValue();
		System.out.println(s1);
		System.out.println("Read is Success");

		// to write into Excel
		Sheet s2 = w.createSheet("Selenium");
		Row r1 = s2.createRow(1);
		Cell c1 = r1.createCell(0);
		FileOutputStream f1 = new FileOutputStream(f);
		c1.setCellValue("Boolean Success");
		w.write(f1);
		System.out.println("Write is success");

		// To update value in Excel 2,1

		Sheet s3 = w.getSheet("Java");
		Row r2 = s3.getRow(0);
		Cell c2 = r2.getCell(0);
		if(c2.equals("Sring is success")){
		c2.setCellValue("List is Good");
		w.write(f1);
		}
		System.out.println("Update is Success");

	}
}
