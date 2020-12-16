package com.utility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public WebDriver browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;
	}
	
	public static void url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void fillText(WebElement e,String text) {
		e.sendKeys(text);
	}
	
	public static void btnClick(WebElement e) {
		e.click();
	}
}
