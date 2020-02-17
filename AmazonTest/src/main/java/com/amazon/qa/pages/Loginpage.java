package com.amazon.qa.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.qa.base.AmazonTestbase;


public class Loginpage  extends AmazonTestbase{
	@FindBy(id="ap_email")
	WebElement Email;
	@FindBy(id="ap_password")
	WebElement Password;
	@FindBy(xpath="//input[@id='continue']")
	WebElement Continue;
	//(xpath="//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]"
	@FindBy(linkText="Sign in")
	WebElement Signinbtn;
	@FindBy(id="signInSubmit")
	WebElement Signsubmitbtn;


public Loginpage()
{
	PageFactory.initElements(driver, this);
}
public void movetosignin()
{
	
	Actions act=new Actions(driver);
	act.moveToElement(Signinbtn).build().perform();	
	Signinbtn.click();
}

public void loginemailaccount(String us)
{
	Email.sendKeys(us);	
	//Password.sendKeys();
}
public Homepage loginpasswordaccount(String ps)
{
//	Email.sendKeys();	
	Password.sendKeys(ps);
	Signsubmitbtn.click();
	return new Homepage();
}
public void continueclick()
{
	Continue.click();
}
}