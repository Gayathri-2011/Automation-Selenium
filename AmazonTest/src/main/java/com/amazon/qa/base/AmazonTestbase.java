package com.amazon.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.amazon.qa.util.TestUtilAmazon;


public class AmazonTestbase {
	public static WebDriver driver;
	public static Properties prop;
	public AmazonTestbase() 
	{
		try
		{
			prop=new Properties();
			FileInputStream file=new FileInputStream("C:\\Selenium Feb 6\\Java Workspace 1\\AmazonTest\\src\\main\\java\\com\\amazon\\qa\\config\\AmazonConfig.properties");
			prop.load(file);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public static void initalize()
	{
		String Browsername=prop.getProperty("browser");
		if(Browsername.equalsIgnoreCase("Chrome"))
		{
			//System.setProperty("webdriver.chrome.driver","C:\\Selenium Feb 6\\Java Workspace 1\\AmazonTest\\Driver");
			driver=new ChromeDriver();
		}
		else if(Browsername.equalsIgnoreCase("firefox"))
		{
			//System.setProperty("webdriver.gecko.driver","C:\\Selenium Feb 6\\Java Workspace 1\\AmazonTest\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtilAmazon.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtilAmazon.IMPLICITY_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}

}
