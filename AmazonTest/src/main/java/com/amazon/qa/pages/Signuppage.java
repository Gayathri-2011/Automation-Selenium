package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.AmazonTestbase;

public class Signuppage extends AmazonTestbase {
@FindBy(linkText="Start here.")
WebElement StartRegister;
@FindBy(id="ap_customer_name")
WebElement FirstName;
@FindBy(id="ap_email")
WebElement Email;
@FindBy(id="ap_password")
WebElement Password;
@FindBy(id="ap_password_check")
WebElement Passwordcheck;
@FindBy(xpath="//input[@id='continue']")
WebElement CreateAmaAct;
@FindBy(xpath="	//input[@name='code']")
WebElement Enterotp;
@FindBy(xpath="//span[@id='a-autoid-0']//input[@class='a-button-input']")
WebElement SubmitAmazonaccount;
public Signuppage()
{
	PageFactory.initElements(driver, this);
}
public void clickonNewcustomer()
{
	Actions act=new Actions(driver);
	act.moveToElement(StartRegister);	
	StartRegister.click();
}
public void CreateNewCustomer(String fname,String mail,String passwrd,String passwrdchk)
{
	FirstName.sendKeys(fname);
	Email.sendKeys(mail);
	Password.sendKeys(passwrd);
	Passwordcheck.sendKeys(passwrdchk);
	
}
public void clickonAmazonact()
{
	CreateAmaAct.click();	
}
public void Enterotp(String otp)
{
	Enterotp.sendKeys(otp);
	
}
public void Clickonsubmitbtn()
{
	SubmitAmazonaccount.click();
}

}