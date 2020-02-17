package com.amazon.qa.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.AmazonTestbase;
import com.amazon.qa.pages.Homepage;
import com.amazon.qa.pages.Loginpage;
import com.amazon.qa.util.TestUtilAmazon;

public class Homepagetest extends AmazonTestbase{
	Homepage hm;
	Loginpage lp;
	TestUtilAmazon testutil;
	Loginpagetest lptest;
	public Homepagetest()
	{
		super();
		PageFactory.initElements(driver, Loginpagetest.class);
	}
	@BeforeMethod
	public void setup()
	{
		initalize();
		testutil=new TestUtilAmazon();
		hm=new Homepage();
		lp=new Loginpage();
		lp.movetosignin();
		lp.loginemailaccount(prop.getProperty("username"));
		lp.continueclick();
		hm=lp.loginpasswordaccount(prop.getProperty("password"));
		
		
	}
	@Test(priority=1)
	public void verifyAmazonlabelTest()
	{
		Assert.assertTrue(hm.verifyamazonlabel());
	}
	@Test(priority=2)
	public void searchtext()
	{
		hm.search("mobile holder" +Keys.ENTER);
		hm.Element();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)","");
	}
	/*
	 * @AfterMethod() public void teardown() { //driver.quit(); }
	 */

}
