package com.amazon.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.AmazonTestbase;
import com.amazon.qa.pages.Homepage;
import com.amazon.qa.pages.Loginpage;
import com.amazon.qa.util.TestUtilAmazon;

public class Loginpagetest extends AmazonTestbase{
	Loginpage lg;
	TestUtilAmazon testutil;
	
@BeforeMethod
	public void setup()
	{
		initalize();
		 lg=new Loginpage();
		 testutil=new TestUtilAmazon();	 
	}
@Test
public void Loginmethod()
{
	lg.movetosignin();
	lg.loginemailaccount(prop.getProperty("username"));
	lg.continueclick();
	lg.loginpasswordaccount(prop.getProperty("password"));
	
	
}
@AfterMethod
public void teardown()
{
	driver.quit();
}
}
