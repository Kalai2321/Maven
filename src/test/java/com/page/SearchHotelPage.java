package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.Base;

public class SearchHotelPage extends Base{
	public SearchHotelPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="location")
	private WebElement loc;
	
	@FindBy(id="hotels")
	private WebElement hot;
	
	@FindBy(id="room_type")
	private WebElement rotype;
	
	@FindBy(id="room_nos")
	private WebElement romno;
	
	@FindBy (id="datepick_in")
	private WebElement chkin;
	
	@FindBy(id="datepick_out")
	private WebElement chkout;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@FindBy(id="child_room")
	private WebElement ChldRom;
	
	@FindBy(id="Submit")
	private WebElement submitBtn;

	public void setSubmitBtn(WebElement submitBtn) {
		this.submitBtn = submitBtn;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public void setLoc(WebElement loc) {
		this.loc = loc;
	}

	public void setHot(WebElement hot) {
		this.hot = hot;
	}

	public void setRotype(WebElement rotype) {
		this.rotype = rotype;
	}

	public void setRomno(WebElement romno) {
		this.romno = romno;
	}

	public void setChkin(WebElement chkin) {
		this.chkin = chkin;
	}

	public void setChkout(WebElement chkout) {
		this.chkout = chkout;
	}

	public void setAdult(WebElement adult) {
		this.adult = adult;
	}

	public void setChldRom(WebElement chldRom) {
		ChldRom = chldRom;
	}

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHot() {
		return hot;
	}

	public WebElement getRotype() {
		return rotype;
	}

	public WebElement getRomno() {
		return romno;
	}

	public WebElement getChkin() {
		return chkin;
	}

	public WebElement getChkout() {
		return chkout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChldRom() {
		return ChldRom;
	}
	
	
	
}
