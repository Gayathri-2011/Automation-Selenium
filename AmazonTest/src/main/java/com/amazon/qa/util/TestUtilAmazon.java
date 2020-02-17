package com.amazon.qa.util;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.qa.base.AmazonTestbase;

public class TestUtilAmazon extends AmazonTestbase {
	public static long PAGE_LOAD_TIMEOUT=30;
	public static long IMPLICITY_WAIT=30;
	public static  void clickOn(WebDriver driver,WebElement element,int timeout)
	{
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	

	
			}
					
		

