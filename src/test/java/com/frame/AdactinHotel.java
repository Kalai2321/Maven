package com.frame;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.page.AdactinLoginPage;
import com.page.BookHotel;
import com.page.SearchHotelPage;
import com.page.SelectHotel;
import com.test.Base;

public class AdactinHotel extends Base {

	public static void main(String[] args) throws IOException {
		browserLaunch("https://adactinhotelapp.com/index.php");
		title();
		driver.manage().window().maximize();
// For Adactin Login Page -POM
		AdactinLoginPage adc = new AdactinLoginPage();
		adc.getUser().sendKeys(stringData(1, 0));
		adc.getPass().sendKeys(stringData1(1, 1));
		adc.getLoginbtn().click();

		// for Adactin SearchHotel Page - POM
		SearchHotelPage searchHotel = new SearchHotelPage();
// to pass value in Drop Down, use Select class
		Select location = new Select(searchHotel.getLoc());
		location.selectByVisibleText(sendLocation(4, 0));

		Select hotel = new Select(searchHotel.getHot());
		hotel.selectByVisibleText(sendHotel(4, 1));

		Select roomType = new Select(searchHotel.getRotype());
		roomType.selectByVisibleText(sendRoomType(4, 2));

		Select roomNumber = new Select(searchHotel.getRomno());
		roomNumber.selectByVisibleText(sendNoOfRooms(4, 3));
		//WebElement dropRoomNo = drpRmNo.getFirstSelectedOption();
		// To pass values in textBox

		searchHotel.getChkin().sendKeys(sendCheckInDate(4, 4));

		searchHotel.getChkout().sendKeys(sendCheckOutDate(4, 5));

		Select adultRoom = new Select(searchHotel.getAdult());
		adultRoom.selectByVisibleText(sendAdultRoom(4, 6));

		Select childRoom = new Select(searchHotel.getChldRom());
		childRoom.selectByVisibleText(sendChildRoom(4, 7));

		searchHotel.getSubmitBtn().click();
		
		//SelectHotel Page
		SelectHotel slt = new SelectHotel();
			//Radio Buttons and Button	
		slt.getRadioBtn().click();
		slt.getContinueBtn().click();
		
		//BookHotel Page
		BookHotel bkHotel = new BookHotel();
		
		//Passing values to textBox
		bkHotel.getfName().sendKeys(stringData(7,0));
		bkHotel.getlName().sendKeys(stringData(7,1));
		bkHotel.getAddress().sendKeys(stringData(7,2));
		bkHotel.getCcNum().sendKeys(stringData(7,3));
		//Drop Down get values
		
		Select ccType = new Select(bkHotel.getCcType());//Parameterized constructor
		ccType.selectByVisibleText(stringData(7,4));
		
		Select mon = new Select(bkHotel.getCcMonth());
		mon.selectByVisibleText(stringData(7,5));
		
		Select year = new Select(bkHotel.getCcYear());
		year.selectByVisibleText(ccNumber(7,6));
		
		//Select ccv = new Select(bkHotel.getCcV());
		//ccv.selectByVisibleText(ccNumber(7,7));
		driver.findElement(By.id("cc_cvv")).sendKeys(ccNumber(7,7));
		
		//List<WebElement> elements = driver.findElements(By.id("cc_cvv"));
      //  for (WebElement element: elements) {
        //    System.out.println("Tag: " + element.getTagName());
         //   System.out.println("Text: " + element.getText());
         //   System.out.println("Location: " + element.getLocation());
      //  }
        
		bkHotel.getBookNow().click();
		
	}

}
