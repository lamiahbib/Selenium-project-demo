package com.e2etestsautomation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etestsautomation.utils.ConfigFileReader;
import com.e2etestsautomation.utils.Setup;

public class AuthenticationPage {
	private ConfigFileReader configFileReader;

	/* @FindBy WebEleemnt */
	@FindBy(how = How.ID, using = "txtUsername")
	public static WebElement username;

	@FindBy(how = How.ID, using = "txtPassword")
	public static WebElement password;

	@FindBy(how = How.ID, using = "btnLogin")
	public static WebElement btnLogin;
	
	@FindBy(how = How.ID, using = "welcome")
	public static WebElement homePage;

	public AuthenticationPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}

	/* @Create methods */
	public void fillUserName(String txt_username) {
		username.sendKeys(txt_username);
	}

	public void fillPassword(String txt_password) {
		password.sendKeys(txt_password);
	}

	public void clickbtnlogin() {
		btnLogin.click();
	}

	public void goToURL() {
		Setup.driver.get(configFileReader.getProperties("home.url"));
	}
}
