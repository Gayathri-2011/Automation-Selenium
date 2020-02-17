package com.amazon.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.AmazonTestbase;
import com.amazon.qa.pages.Signuppage;
import com.amazon.qa.util.TestUtilAmazon;

public class SignuppageTest extends AmazonTestbase {
	Signuppage signupage;
	TestUtilAmazon testutil;
	public SignuppageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initalize();
		signupage=new Signuppage();
		testutil=new TestUtilAmazon();
	}
	
	@Test(priority=1)
	
	  public void RegisterNewcustomer()
	{ 
		signupage.clickonNewcustomer();
	  signupage.CreateNewCustomer(prop.getProperty("fname"),prop.getProperty("mail"),prop.getProperty("password"),prop.getProperty("passwordchk"));
	  signupage.clickonAmazonact(); 
	  }
	 
	@Test
	public void Getotp()
	{
	signupage.Enterotp("457646");
	signupage.Clickonsubmitbtn();
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
