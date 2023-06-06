package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.Base;

public class AdactinLoginPage extends Base{

	public AdactinLoginPage() {
		PageFactory.initElements(driver,this);
	}
		
		@FindBy(id="username")
		private WebElement user;
		
		@FindBy(id="password")
		private WebElement pass;
		
		@FindBy(id="login")
		private WebElement loginbtn;

		public WebElement getLoginbtn() {
			return loginbtn;
		}

		public void setLoginbtn(WebElement loginbtn) {
			this.loginbtn = loginbtn;
		}

		public WebElement getUser() {
			return user;
		}

		public WebElement getPass() {
			return pass;
		}

		public void setUser(WebElement user) {
			this.user = user;
		}

		public void setPass(WebElement pass) {
			this.pass = pass;
		}

		
		
		
		
		
	
	
	
	
	
	
	
}
