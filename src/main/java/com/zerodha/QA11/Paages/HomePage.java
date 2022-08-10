package com.zerodha.QA11.Paages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.zerodha.QA11.Base.TestBase;

public class HomePage extends TestBase {
	
	// In Page Classes first we need to create the object repository.
	
			@FindBy(xpath="//img[@alt='Kite logo']") private WebElement home_zerodhakitelogo;
			@FindBy(xpath="//span[@class='nickname']") private WebElement home_nickname;
			@FindBy(xpath="//input[@icon='search']") private WebElement home_searchbar;
			@FindBy(xpath="//span[text()='Dashboard']") private WebElement home_dashboardopt;
			@FindBy(xpath="//span[text()='Orders']") private WebElement home_ordersopt;
			@FindBy(xpath="//span[text()='Holdings']") private WebElement home_holdingsopt;
			@FindBy(xpath="//span[text()='Positions']") private WebElement home_positionsopt;
			@FindBy(xpath="//span[text()='Funds']") private WebElement home_fundsopt;
			@FindBy(xpath="//span[text()='Apps']") private WebElement home_appsopt;
			@FindBy(xpath="//span[text()='View statement']") private WebElement home_viewstatement;
			@FindBy(xpath="//div[text()='Margin available']") private WebElement home_marginavailable;
			@FindBy(xpath="//span[text()='Margins used']") private WebElement home_marginused;
			@FindBy(xpath="//span[text()='Opening balance'][1]") private WebElement home_openingbalance;
			@FindBy(xpath="//span[@class='user-id']") private WebElement home_userid;    
			@FindBy(xpath="//h4[@class='username']") private WebElement home_userfullname; 
			@FindBy(xpath="//div[@class='email']") private WebElement home_useremailid;
			@FindBy(xpath="//a[contains(@href,'/logout')]") private WebElement home_logoutbtn;
			@FindBy(xpath="//span[text()='TATAMOTORS']") private WebElement home_tatashare;
			@FindBy(xpath="//button[@class='button-blue buy']") private WebElement home_sharebuybtn;
			
			
			
			
			// Initialization
				public HomePage(WebDriver driver) {
					PageFactory.initElements(driver, this);
				}
			
				// usage
				
				public void verifyZerodhaHomePageLogo() {
					Assert.assertTrue(home_zerodhakitelogo.isDisplayed(), "Zerodha Home Page Logo is not displayed");
					Reporter.log("verifyZerodhaHomePageLogo", true);
				}
			
				public void verifyZerodhaHomePageNickName() {
					Assert.assertTrue(home_nickname.isDisplayed(), "Zerodha Home Page NickName is not displayed");
					Reporter.log("verifyZerodhaHomePageNickName", true);
				}
			
				public void verifyZerodhaHomePageSearchBar() {
					Assert.assertTrue(home_searchbar.isDisplayed(), "Zerodha Home Page Search bar is not displayed");
					Reporter.log("verifyZerodhaHomePageSearchBar", true);
				}
			
			
				public void verifyZerodhaHomePageDashboardOpt() {
					Assert.assertTrue(home_dashboardopt.isDisplayed(), "Zerodha Home Page Dashboard Opt is not displayed");
					Reporter.log("verifyZerodhaHomePageDashboardOpt", true);
				}
			
				public void verifyZerodhaHomePageOrdersOpt() {
					Assert.assertTrue(home_ordersopt.isDisplayed(), "Zerodha Home Page Orders Opt is not displayed");
					Reporter.log("verifyZerodhaHomePageOrdersOpt", true);
				}
			
				public void verifyZerodhaHomePageHoldingsOpt() {
					Assert.assertTrue(home_holdingsopt.isDisplayed(), "Zerodha Home Page Holdings Opt is not displayed");
					Reporter.log("verifyZerodhaHomePageHoldingsOpt", true);
				}
			
			
				public void verifyZerodhaHomePagePositionsOpt() {
					Assert.assertTrue(home_positionsopt.isDisplayed(), "Zerodha Home Page Positions Opt is not displayed");
					Reporter.log("verifyZerodhaHomePagePositionsOpt", true);
				}
			
				public void verifyZerodhaHomePageFundsOpt() {
					Assert.assertTrue(home_fundsopt.isDisplayed(), "Zerodha Home Page Funds Opt is not displayed");
					Reporter.log("verifyZerodhaHomePageFundsOpt", true);
				}
			
			
				public void verifyZerodhaHomePageAppsOpt() {
					Assert.assertTrue(home_appsopt.isDisplayed(), "Zerodha Home Page Apps Opt is not displayed");
					Reporter.log("verifyZerodhaHomePageAppsOpt", true);
				}
				
				public void verifyZerodhaHomePageViewStatementOpt() {
					Assert.assertTrue(home_viewstatement.isDisplayed(), "Zerodha Home View Statement Opt is not displayed");
					Reporter.log("verifyZerodhaHomePageViewStatementOpt", true);
				}
			
				public void verifyZerodhaHomePageMarginAvailableOpt() {
					Assert.assertTrue(home_marginavailable.isDisplayed(), "Zerodha Home Margin Availbale Opt is not displayed");
					Reporter.log("verifyZerodhaHomePageMarginAvailableOpt", true);
				}
				
				public void verifyZerodhaHomePageMarginUsedOpt() {
					Assert.assertTrue(home_marginused.isDisplayed(), "Zerodha Home Margin Used Opt is not displayed");
					Reporter.log("verifyZerodhaHomePageMarginUsedOpt", true);
				}
				
				public void verifyZerodhaHomePageOpeningBalanceOpt() {
					Assert.assertTrue(home_openingbalance.isDisplayed(), "Zerodha Home Oening Balance Opt is not displayed");
					Reporter.log("verifyZerodhaHomePageOpeningBalanceOpt", true);
				}
			
				public void verifyZerodhaHomePageUserAccountProfileOpt() {
					Assert.assertTrue(home_userid.isDisplayed(), "Zerodha Home User Account Profile Opt is not displayed");
					Reporter.log("verifyZerodhaHomePageUserAccountProfileOpt", true);
				}
				
				public void clickZerodhaHomePageUserAccountProfileOpt() {
					Assert.assertTrue(home_userid.isDisplayed(), "Zerodha Home User Account Profile Opt is not displayed");
					home_userid.click();
					Reporter.log("clickZerodhaHomePageUserAccountProfileOpt", true);
				}
				
				public void verifyZerodhaHomePageUserFullName() {
					Assert.assertTrue(home_userfullname.isDisplayed(), "Zerodha Home Page Holdings Opt is not displayed");
					Assert.assertEquals(home_userfullname.getText(), "Sourabh Bharat Howale");
					Reporter.log("verifyZerodhaHomePageUserFullName", true);
				}
				
				public void verifyZerodhaHomePageUserEmailId() {
					Assert.assertTrue(home_useremailid.isDisplayed(), "Zerodha Home Page Holdings Opt is not displayed");
					Assert.assertEquals(home_useremailid.getText(), "sourabhhowale@gmail.com");
					Reporter.log("verifyZerodhaHomePageUserEmailId", true);
				}
				
				
				
				public void ClickZerodhaHomePageTataShareBuy() {
					Actions action = new Actions(driver);
					action.moveToElement(home_tatashare).build().perform();
					home_sharebuybtn.click();
				}
				
				public void clickZerodhaHomePageLogoutBtn() {
					Assert.assertTrue(home_logoutbtn.isDisplayed(), "Zerodha Home User Profile Logout Opt is not displayed");
					home_logoutbtn.click();
					Reporter.log("clickZerodhaHomePageLogoutBtn", true);
				}
				

}
