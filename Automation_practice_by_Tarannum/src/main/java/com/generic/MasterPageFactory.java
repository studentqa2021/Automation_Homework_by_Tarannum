package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	MasterPageFactory(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//*[@id='email']")
private WebElement Email;
@FindBy(xpath="//*[@name='pass']")
private WebElement Password;
@FindBy(xpath="//*[@name='login']")
private WebElement login;
public WebElement getEmail() {
	return Email;
}
public WebElement  getPassword() {
	return Password;
}
public WebElement getlogin() {
	return login;
}
}