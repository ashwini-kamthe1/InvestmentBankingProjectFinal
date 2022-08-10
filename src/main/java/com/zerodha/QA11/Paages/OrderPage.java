package com.zerodha.QA11.Paages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.zerodha.QA11.Base.TestBase;



public class OrderPage  extends TestBase {
	
	@FindBy(xpath="//input[@name='exchange' and @value='BSE']") private WebElement order_bsebannerprice;
	@FindBy(xpath="//input[@name='exchange' and @value='NSE']") private WebElement order_nsebannerprice;
	@FindBy(xpath="//input[@title='Regular order']") private WebElement order_regularorderoptn;
	@FindBy(xpath="//input[@title='Cover order']") private WebElement order_coverorderoptn;
	@FindBy(xpath="//input[@title='After Market Order (for the next day)']") private WebElement order_amoorderoptn;
	@FindBy(xpath="//input[@title='Split an order into smaller orders']") private WebElement order_icebergorderoptn;
	@FindBy(xpath="//div[@data-balloon='Margin Intraday Squareoff: Requires lower margin for equity. Has to be exited before market close.']") private WebElement order_intradayoptn;
	@FindBy(xpath="//div[@data-balloon='CashNCarry: Longterm investment. Requires full upfront margin.']") private WebElement order_longtermoptn;
	@FindBy(xpath="//input[@label='Qty.']") private WebElement order_sharequantity;
	@FindBy(xpath="//input[@label='Price']") private WebElement order_shareprice;
	@FindBy(xpath="//input[@label='Trigger price']") private WebElement order_triggerprice;
	@FindBy(xpath="//div[@data-balloon='Buy at market price']") private WebElement order_marketoptn;
	@FindBy(xpath="//input[@label='Limit']") private WebElement order_limitoptn;
	@FindBy(xpath="//input[@label='SL']") private WebElement order_stoplossoptn;
	@FindBy(xpath="//input[@label='SL-M']") private WebElement order_stoplossmarketoptn;
	@FindBy(xpath="//span[contains(text(),'Margin required')]") private WebElement order_margingrequired;
	@FindBy(xpath="//button[@class='submit']") private WebElement order_buybtn;
	@FindBy(xpath="//button[@class='button-outline cancel']") private WebElement order_cancelbtn;
	


	// initialize
	
	public OrderPage( WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	// usage
	
	public void verifyZerodhaOrderPageBSEPrice(){
		Assert.assertTrue(order_bsebannerprice.isDisplayed(), "Zerodha Order Page BSE Banner Price is not displayed");
		Reporter.log("verifyZerodhaOrderPageBSEPrice", true);
	}

	public void verifyZerodhaOrderPageNSEPrice(){
		Assert.assertTrue(order_nsebannerprice.isDisplayed(), "Zerodha Order Page NSE Banner Price is not displayed");
		Reporter.log("verifyZerodhaOrderPageNSEPrice", true);
	}

	public void verifyZerodhaOrderPageReularOrderOptn(){
		Assert.assertTrue(order_regularorderoptn.isDisplayed(), "Zerodha Order Page Regular order option is not displayed");
		Reporter.log("verifyZerodhaOrderPageReularOrderOptn", true);
	}

	public void verifyZerodhaOrderPageCoverOrderOptn(){
		Assert.assertTrue(order_coverorderoptn.isDisplayed(), "Zerodha Order Page Cover order option is not displayed");
		Reporter.log("verifyZerodhaOrderPageCoverOrderOptn", true);
	}
	
	public void verifyZerodhaOrderPageAmoOrderOptn(){
		Assert.assertTrue(order_amoorderoptn.isDisplayed(), "Zerodha Order Page AMO order option is not displayed");
		Reporter.log("verifyZerodhaOrderPageAmoOrderOptn", true);
	}

	public void verifyZerodhaOrderPageIcebergOrderOptn(){
		Assert.assertTrue(order_icebergorderoptn.isDisplayed(), "Zerodha Order Page Iceberg order option is not displayed");
		Reporter.log("verifyZerodhaOrderPageIcebergOrderOptn", true);
	}
	
	public void verifyZerodhaOrderPageIntradayOrderOptn(){
		Assert.assertTrue(order_intradayoptn.isDisplayed(), "Zerodha Order Page Inraday option is not displayed");
		Reporter.log("verifyZerodhaOrderPageIntradayOrderOptn", true);
	}
	
	public void verifyZerodhaOrderPageLongTermOrderOptn(){
		Assert.assertTrue(order_longtermoptn.isDisplayed(), "Zerodha Order Page Longterm option is not displayed");
		Reporter.log("verifyZerodhaOrderPageLongTermOrderOptn", true);
	}	
	
	public void setZerodhaOrderPageShareQuantityOptn(String qty){
		Assert.assertTrue(order_sharequantity.isDisplayed(), "Zerodha Order Page Share Quantity option is not displayed");
		order_sharequantity.sendKeys(qty);
		Reporter.log("selectZerodhaOrderPageShareQuantityOptn", true);
	}
	
	public void setZerodhaOrderPageSharePriceOptn(String price){
		Assert.assertTrue(order_shareprice.isDisplayed(), "Zerodha Order Page Share Price option is not displayed");
		order_shareprice.clear();
		order_shareprice.sendKeys(price);
		Reporter.log("selectZerodhaOrderPageSharePriceOptn", true);
	}
	
	
	public void verifyZerodhaOrderPageTriggerPriceOptn(){
		Assert.assertFalse(order_triggerprice.isEnabled(),"Zerodha Order Page Trigger Price option is Enabled");
		Reporter.log("verifyZerodhaOrderPageTriggerPriceOptn", true);
	}
	
	public void verifyZerodhaOrderPageMarketOptn(){
		Assert.assertTrue(order_marketoptn.isDisplayed(),"Zerodha Order Page Market option is not Displayed");
		Reporter.log("verifyZerodhaOrderPageMarketOptn", true);
	}
	
	public void verifyZerodhaOrderPageLimitOptn(){
		Assert.assertTrue(order_limitoptn.isDisplayed(),"Zerodha Order Page Limit option is not Displayed");
		Reporter.log("verifyZerodhaOrderPageLimitOptn", true);
	}
	
	public void verifyZerodhaOrderPageStopLossOptn(){
		Assert.assertTrue(order_stoplossoptn.isDisplayed(),"Zerodha Order Page Stop Loss option is not Displayed");
		Reporter.log("verifyZerodhaOrderPageStopLossOptn", true);
	}
	
	public void verifyZerodhaOrderPageStopLossMarketOptn(){
		Assert.assertTrue(order_stoplossmarketoptn.isDisplayed(),"Zerodha Order Page Stop Loss- Market option is not Displayed");
		Reporter.log("verifyZerodhaOrderPageStopLossMarketOptn", true);
	}
	
	public void verifyZerodhaOrderPageMarginRequired(){
		Assert.assertTrue(order_margingrequired.isDisplayed(),"Zerodha Order Page Margin Required option is not Displayed");
		Reporter.log("verifyZerodhaOrderPageMarginRequired", true);
	}

	
	public void clickZerodhaOrderPageOrderBtn(){
		Assert.assertTrue(order_buybtn.isDisplayed(),"Zerodha Order Page Buy Button is not Displayed");
		Reporter.log("clickZerodhaOrderPageOrderBtn", true);
	}
	
	public void clickZerodhaOrderPageCancelBtn(){
		Assert.assertTrue(order_cancelbtn.isDisplayed(),"Zerodha Order Page Cancel Button is not Displayed");
		Reporter.log("clickZerodhaOrderPageCancelBtn", true);
	}
	
}
