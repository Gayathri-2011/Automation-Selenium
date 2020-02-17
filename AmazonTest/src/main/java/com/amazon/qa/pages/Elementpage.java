package com.amazon.qa.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.qa.base.AmazonTestbase;


public class Elementpage extends AmazonTestbase{
	@FindBy(xpath="//span[@id='color_name_0_price']//span[@class='a-size-mini twisterSwatchPrice'][contains(text(),'$9.98')]")
	WebElement price;
	@FindBy(id="quantity")
	WebElement Stock;
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement Addtocartbtn;
	@FindBy(xpath="//a[@id='hlb-ptc-btn-native']")
	WebElement Proceedtocheck;

	public Elementpage()
	{
		PageFactory.initElements(driver,this);
		
	}

	@SuppressWarnings("deprecation")
	public static  void clickOn(WebDriver driver,WebElement element,int timeout)
	{
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	public void Addtocart() throws InterruptedException
	{
	clickOn(driver,price,20);
		Select sel=new Select(Stock);
		sel.selectByIndex(0);
		Thread.sleep(3000);
	//clickOn(driver,Addtocartbtn,30);
	Addtocartbtn.click();
	}
	
	public void proceedtocheckclick()
	{
		Proceedtocheck.click();
	}
	
	
}
