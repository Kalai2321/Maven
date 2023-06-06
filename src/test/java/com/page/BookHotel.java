package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.Base;

public class BookHotel extends Base {

	public BookHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement fName;

	@FindBy(id = "last_name")
	private WebElement lName;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement ccNum;
	
	@FindBy(id="cc_type")
	private WebElement ccType;
	
	@FindBy(id="cc_exp_month")
	private WebElement ccMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ccYear;
	
	//@FindBy(id="cc_cvv")
	@FindBy(name="cc_cvv")
	private WebElement ccV; 
	
	public void setCcV(WebElement ccV) {
		this.ccV = ccV;
	}

	public WebElement getCcV() {
		return ccV;
	}

	@FindBy(id="book_now")
	private WebElement bookNow;

	public void setBookNow(WebElement bookNow) {
		this.bookNow = bookNow;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public void setfName(WebElement fName) {
		this.fName = fName;
	}

	public void setlName(WebElement lName) {
		this.lName = lName;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public void setCcNum(WebElement ccNum) {
		this.ccNum = ccNum;
	}

	public void setCcType(WebElement ccType) {
		this.ccType = ccType;
	}

	public void setCcMonth(WebElement ccMonth) {
		this.ccMonth = ccMonth;
	}

	public void setCcYear(WebElement ccYear) {
		this.ccYear = ccYear;
	}

	

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNum() {
		return ccNum;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcMonth() {
		return ccMonth;
	}

	public WebElement getCcYear() {
		return ccYear;
	}

	
}
