package com.amazon.qa.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.AmazonTestbase;
import com.amazon.qa.pages.Elementpage;
import com.amazon.qa.pages.Homepage;
import com.amazon.qa.pages.Loginpage;
import com.amazon.qa.pages.ShippingDetailspage;
import com.amazon.qa.util.TestUtilAmazon;

public class ElementpageTest extends AmazonTestbase {
	Homepage hm;
	Loginpage lp;
	TestUtilAmazon testutil;
	Elementpage Ep;
	ShippingDetailspage sp;
	public ElementpageTest()
	{
		super();
	}
	@BeforeMethod()
	public void setup()
	{
		initalize();
		testutil=new TestUtilAmazon();
		hm=new Homepage();
		lp=new Loginpage();
		Ep=new Elementpage();
		sp=new ShippingDetailspage();
		lp.movetosignin();
		lp.loginemailaccount(prop.getProperty("username"));
		lp.continueclick();
		hm=lp.loginpasswordaccount(prop.getProperty("password"));
		
	}
	@Test
	public void ElementAdd() throws InterruptedException
	{
		hm.search("HENGBANG Multipurpose Phone Bracket mobile holder" +Keys.ENTER);
		hm.Element();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)","");
		Ep.Addtocart();
		Ep.proceedtocheckclick();
		//sp.checkdisplay();
		String text=ShippingDetailspage.displayaddress.getText();
		if(text.isEmpty())
		{
		sp.Enterdetails("Gayathridevi", "821 Arcadia Ave", "Unit 15", "Arcadia", "California", "91007", "3233887460", "1683");
		sp.selectcountry();
		sp.clickbtn();	
		}
		else
		{
			sp.clickdeliverbtn();
		}
	}
	

}
