package com.zerodha.QA11.Testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.zerodha.QA11.Base.TestBase;
import com.zerodha.QA11.Paages.LoginPage;
import com.zerodha.QA11.Utils.Util;




public class LoginPageTest  extends TestBase{
	
	@BeforeClass(alwaysRun=true)
	public void setup()
	{
		intializeBrowser("chrome");
	}
	
	@Test(priority = 1, groups="Functional")
	public void ZerodhaLoginPageTest() throws EncryptedDocumentException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		
		lp.verifyZerodhaLoginPageLogo();
		lp.verifyZerodhaLoginPageAndroidLogo();
	    lp.verifyZerodhaLoginPageIosLogo();
	    lp.verifyZerodhaLoginPageApplicationVersion();
		lp.setZerodhaLoginPageUsername(Util.getStringTestData(0, 0));
		lp.setZerodhaLoginPagePassword(Util.getStringTestData(0, 1));
		lp.clickZerodhaLoginPageLoginBtn();
		lp.setZerodhaLoginPagePin(Util.getStringTestData(0, 2));
		lp.clickZerodhaLoginPagePinContinueBtn();
	}

}
