package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.utility.BaseClass;

public class SearchPagePOJO extends BaseClass {
	public SearchPagePOJO() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}
	
	
 }

