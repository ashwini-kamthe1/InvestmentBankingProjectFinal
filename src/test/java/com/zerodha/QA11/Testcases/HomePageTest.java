package com.zerodha.QA11.Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.zerodha.QA11.Base.TestBase;
import com.zerodha.QA11.Paages.HomePage;
import com.zerodha.QA11.Paages.LoginPage;
import com.zerodha.QA11.Utils.Util;


public class HomePageTest extends TestBase {
	
	@BeforeClass(alwaysRun=true)
	public void Setup() {
		intializeBrowser("chrome");
	}
	
	
	@Test(priority = 2, groups="Functional")
	public void HomePageTest1() throws EncryptedDocumentException, IOException, InterruptedException{
		
	// Login to the application ==> Go to the home page and check several aspects.
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setZerodhaLoginPageUsername(Util.getStringTestData(0, 0));
		lp.setZerodhaLoginPagePassword(Util.getStringTestData(0, 1));
		lp.clickZerodhaLoginPageLoginBtn();
		
		lp.setZerodhaLoginPagePin(Util.getStringTestData(0, 2));
		lp.clickZerodhaLoginPagePinContinueBtn();
		
		Thread.sleep(2000);
		HomePage hp = new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		hp.verifyZerodhaHomePageLogo();
		hp.verifyZerodhaHomePageNickName();
		hp.verifyZerodhaHomePageSearchBar();
		hp.verifyZerodhaHomePageDashboardOpt();
		hp.verifyZerodhaHomePageOrdersOpt();
		hp.verifyZerodhaHomePageHoldingsOpt();
		hp.verifyZerodhaHomePagePositionsOpt();
		hp.verifyZerodhaHomePageFundsOpt();
		hp.verifyZerodhaHomePageAppsOpt();
		hp.verifyZerodhaHomePageViewStatementOpt();
		hp.verifyZerodhaHomePageMarginAvailableOpt();
		hp.verifyZerodhaHomePageMarginUsedOpt();
		hp.verifyZerodhaHomePageOpeningBalanceOpt();
		hp.verifyZerodhaHomePageUserAccountProfileOpt();
		hp.clickZerodhaHomePageUserAccountProfileOpt();
		hp.verifyZerodhaHomePageUserFullName();
		hp.verifyZerodhaHomePageUserEmailId();
		hp.clickZerodhaHomePageLogoutBtn();
	}
	
	@SuppressWarnings("static-access")
	@AfterMethod(alwaysRun=true)
	public void Capturess(ITestResult result) throws IOException {
		if(result.FAILURE==result.getStatus()) {
			Util.getscreenshot(driver, result.getName());
		}
	}
	
	@AfterClass(alwaysRun=true)
	public void tearDown() {
		driver.quit();
	}

}
