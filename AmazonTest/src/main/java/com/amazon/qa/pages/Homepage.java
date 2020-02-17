package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.AmazonTestbase;

public class Homepage extends AmazonTestbase {
	@FindBy(xpath="//a[@aria-label='Amazon']")
	WebElement Amazonlabel;
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbox;
	@FindBy(xpath="//span[contains(text(),'HENGBANG Multipurpose Phone Bracket, Phone Ring Ho')]")
	WebElement mobileholder;

	public Homepage()
	{
		PageFactory.initElements(driver,this);
	}
	public boolean verifyamazonlabel()
	{
		return Amazonlabel.isDisplayed();
	}
	public Homepage search(String txt)
	{
		 searchbox.sendKeys(txt);
		 return  new Homepage();
	}
	public Elementpage Element()
	{
		mobileholder.click();
		return new Elementpage();
	}
}
