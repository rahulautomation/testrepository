package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement login;
	
	@FindBy(xpath="//a[@href='https://www.freecrm.com/register/']")
	WebElement signup;

	@FindBy(xpath="//img[@class='img-responsive' and @alt='free crm logo']")
	WebElement logo;

	@FindBy(xpath = "//h1[contains(text(),'#1 Free CRM software in the cloud for sales and service')]")
	WebElement text1;

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	public String validatetitleofpage() {
		return driver.getTitle();

	}

	public boolean validatelogo() {
		return logo.isDisplayed();

	}

	public Home_Page signin(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		return new Home_Page();
	}

}