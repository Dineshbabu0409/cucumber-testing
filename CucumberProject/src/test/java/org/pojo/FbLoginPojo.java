package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sam.BaseClass;

public class FbLoginPojo extends BaseClass{
	
	public FbLoginPojo(){
		 PageFactory.initElements(driver, this);
		 }

		 @FindBy(xpath = "(//input[@id='phone'])[1]")
		 private WebElement email;

		 @FindBy(xpath = "(//input[@name='password'])[1]")
		 private WebElement password;

		 @FindBy(xpath = "(//button[@name='login'])[1]")
		 private WebElement LoginBtn;

		 public WebElement getEmail() {
		 return email;
		 }

		 public WebElement getPassword() {
		 return password;
		 }

		 public WebElement getLoginBtn() {
		 return LoginBtn;
		 }

}
