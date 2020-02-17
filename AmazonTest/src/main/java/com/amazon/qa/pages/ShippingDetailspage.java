package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.qa.base.AmazonTestbase;

public class ShippingDetailspage extends AmazonTestbase {
	@FindBy(id="enterAddressFullName")
	WebElement Firstname;
	@FindBy(id="enterAddressAddressLine1")
	WebElement address1;
	@FindBy(id="enterAddressAddressLine2")
	WebElement address2;
	@FindBy(id="enterAddressCity")
	WebElement cityname;
	@FindBy(id="enterAddressStateOrRegion")
	WebElement statename;
	@FindBy(id="enterAddressPostalCode")
	WebElement Postalcode;
	@FindBy(id="enterAddressCountryCode")
	WebElement Country;
	@FindBy(id="enterAddressPhoneNumber")
	WebElement Phonenumber;
	@FindBy(id="GateCode")
	WebElement Gatecode;
	@FindBy(name="isBillingAddress")
	WebElement Radiobtn;
	@FindBy(name="shipToThisAddress")
	WebElement Shipcontinuebtn;
	@FindBy(xpath="//ul[@class='displayAddressUL']")
	public static WebElement displayaddress;
	@FindBy(xpath="//a[contains(text(),'Deliver to this address')]")
	WebElement delivertoaddbtn;

	
	public ShippingDetailspage()
	{
		PageFactory.initElements(driver,this);
	}
	public void checkdisplay()
	{
		String text=displayaddress.getText();
		System.out.println(text);
		
		
	}
	public void Enterdetails(String name,String add1,String add2,String city,String
			state,String code,String phnumber,String Gcode)
	{
		Firstname.clear();
		Firstname.sendKeys(name);
		address1.clear();
		address1.sendKeys(add1);
		address2.clear();
		address2.sendKeys(add2);
		cityname.clear();
		cityname.sendKeys(city);
		statename.clear();
		statename.sendKeys(state);
		Postalcode.clear();
		Postalcode.sendKeys(code);	
		//Select sel=new Select(Country);
		//sel.selectByVisibleText("United States");
		Phonenumber.sendKeys(phnumber);
		Gatecode.sendKeys(Gcode);
		//Radiobtn.click();
		//Shipcontinuebtn.click();
	}
	public void selectcountry()
	{
		Select sel=new Select(Country);
		sel.selectByVisibleText("United States");
	}
	public void clickbtn()
	{
		Radiobtn.click();
		Shipcontinuebtn.click();
	}
	public void clickdeliverbtn()
	{
		delivertoaddbtn.click();
	}

}
