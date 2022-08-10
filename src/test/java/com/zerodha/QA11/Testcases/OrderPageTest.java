package com.zerodha.QA11.Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.zerodha.QA11.Base.TestBase;
import com.zerodha.QA11.Paages.HomePage;
import com.zerodha.QA11.Paages.LoginPage;
import com.zerodha.QA11.Paages.OrderPage;
import com.zerodha.QA11.Utils.Util;


public class OrderPageTest extends TestBase {
	
	@BeforeClass(alwaysRun=true)
	public void Setup() {
		intializeBrowser("chrome");
	}
	
	
	
	@Test(priority = 3, groups={"Functional","Regression"})
	
	public void EquityOrderTest() throws EncryptedDocumentException, IOException, InterruptedException {
		
		
		LoginPage lp = new LoginPage(driver);
		lp.setZerodhaLoginPageUsername(Util.getStringTestData(0, 0));
		lp.setZerodhaLoginPagePassword(Util.getStringTestData(0, 1));
		lp.clickZerodhaLoginPageLoginBtn();
		lp.setZerodhaLoginPagePin(Util.getStringTestData(0, 2));
		lp.clickZerodhaLoginPagePinContinueBtn();
		Thread.sleep(2000);
		HomePage hp = new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		hp.ClickZerodhaHomePageTataShareBuy();
		
		Thread.sleep(2000);
		OrderPage op = new OrderPage(driver);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(2000);
		//op.verifyZerodhaOrderPageBSEPrice();
		//op.verifyZerodhaOrderPageNSEPrice();
		//op.verifyZerodhaOrderPageReularOrderOptn();
		//op.verifyZerodhaOrderPageCoverOrderOptn();
		//op.verifyZerodhaOrderPageAmoOrderOptn();
		//op.verifyZerodhaOrderPageIcebergOrderOptn();
		//op.verifyZerodhaOrderPageIntradayOrderOptn();
		//op.verifyZerodhaOrderPageLongTermOrderOptn();
		op.setZerodhaOrderPageShareQuantityOptn("25");
		op.setZerodhaOrderPageSharePriceOptn("417.79");
		op.verifyZerodhaOrderPageTriggerPriceOptn();
		op.verifyZerodhaOrderPageMarketOptn();
		//op.verifyZerodhaOrderPageLimitOptn();
//		op.verifyZerodhaOrderPageStopLossOptn();
//		op.verifyZerodhaOrderPageStopLossMarketOptn();
//		op.verifyZerodhaOrderPageMarginRequired();
		op.clickZerodhaOrderPageOrderBtn();
		
		
		
	}
	
}
