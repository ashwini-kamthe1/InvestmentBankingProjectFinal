package com.zerodha.QA11.Paages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.zerodha.QA11.Base.TestBase;

public class LoginPage  extends TestBase{
	
	
	@FindBy(xpath="//a[@class='logo kite-logo']") private WebElement login_zerodhakitelogo;
	@FindBy(id ="userid") private WebElement username;
	@FindBy(id ="password") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginbtn;
	@FindBy(className="//a[text()='Forgot user ID or password?']") private WebElement forgot_password;
	@FindBy(xpath="//a[contains(text(),'Signup now!')]") private WebElement singnuplink;
	@FindBy(xpath="//p[@class='text-light text-xxsmall dim']") private WebElement applicationversion;
	@FindBy(xpath="//img[@alt='Kite Android']") private WebElement androidlogo;
	@FindBy(xpath="//img[@alt='Kite iOS']") private WebElement ioslogo;
	@FindBy(xpath="//input[@type='password']") private WebElement enterpin;
	@FindBy(xpath="//button[@type ='submit']") private WebElement enterpincontinue;

	// initiallization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// usage.
	

	public void verifyZerodhaLoginPageLogo() {
		Assert.assertTrue(login_zerodhakitelogo.isDisplayed(), "Zerodha Login Page Logo is not displayed");
		Reporter.log("verifyZerodhaLoginPageLogo",true);
		
	}
	
	public void verifyZerodhaLoginPageForgotPasswordLink() {
		Assert.assertTrue(forgot_password.isDisplayed());
		Assert.assertEquals(forgot_password.getText(), "Forgot user ID or password?");
		Reporter.log("verifyZerodhaLoginPageForgotPasswordLink", true);
	}
	
	public void verifyZerodhaLoginPageApplicationVersion() {
		Assert.assertTrue(applicationversion.isDisplayed());
		Assert.assertEquals(applicationversion.getText(), "v2.9.12");
		Reporter.log("verifyZerodhaLoginPageApplicationVersion", true);
	}
	
	public void verifyZerodhaLoginPageAndroidLogo() {
		Assert.assertTrue(androidlogo.isDisplayed());
		Reporter.log("verifyZerodhaLoginPageAndroidLogo", true);
	}
	
	
	public void verifyZerodhaLoginPageIosLogo() {
		Assert.assertTrue(ioslogo.isDisplayed());
		Reporter.log("verifyZerodhaLoginPageIosLogo", true);
	}
	
	public void setZerodhaLoginPageUsername(String un) {
		username.sendKeys(un);
		Reporter.log("setZerodhaLoginPageUsername", true);
	}
	
	
	public void setZerodhaLoginPagePassword(String pwd) {
		password.sendKeys(pwd);
		Reporter.log("setZerodhaLoginPagePassword", true);
	}
	
	
	public void clickZerodhaLoginPageLoginBtn() {
		Assert.assertTrue(loginbtn.isDisplayed());
		loginbtn.click();
		Reporter.log("clickZerodhaLoginPageLoginBtn", true);
	}
	
	public void setZerodhaLoginPagePin(String pin) {
		enterpin.sendKeys(pin);
		Reporter.log("setZerodhaLoginPagePin", true);
	}
	
	
	
	public void clickZerodhaLoginPagePinContinueBtn() {
		Assert.assertTrue(enterpincontinue.isDisplayed());
		enterpincontinue.click();
		Reporter.log("clickZerodhaLoginPagePinContinueBtn", true);
	}

}
