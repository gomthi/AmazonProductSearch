package com.testcases;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.pom.SearchPagePOJO;
import com.utility.BaseClass;

public class SearchPage extends BaseClass {
	
	@Test
	public void test() throws InterruptedException {
		browserLaunch();
		url("https://www.amazon.in/");
		SearchPagePOJO s=new SearchPagePOJO();
		fillText(s.getSearch(), "iphone"+Keys.ENTER);
		
		List<WebElement> allProducts = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (WebElement products : allProducts) {
			String text = products.getText();
			//System.out.println(text);
			List<String> l=new LinkedList<String>();
			l.add(text);
			Set<String> set=new HashSet<String>();
			set.addAll(l);
            System.out.println(set);
		}
		
		List<WebElement> allPrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for (WebElement price : allPrice) {
			String text = price.getText();
			//System.out.println(text);
			String s1 = text.replaceAll(",","");
			int amount=Integer.parseInt(s1);
			List<Integer> l1=new LinkedList<Integer>(); 
			l1.add(amount);
			System.out.println(" product greater then 30000");
			//System.out.println(amount);
			if(amount>30000)
			{
				System.out.println(amount);
			}	
		}
	}

}
