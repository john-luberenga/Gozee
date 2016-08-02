package com.gozee.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LocatingStrategies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Create firefox driver to drive the browser
		WebDriver driver = new FirefoxDriver();
		
		//Open Indeed home page
		driver.get("http://www.indeed.co.uk");	
		
		//Locating by ID
		//driver.findElement(By.id("what")).sendKeys("Selenium");
		
		//Locating by Name
		//driver.findElement(By.name("q")).sendKeys("Selenium");
		
		//Locating by LinkText
		//driver.findElement(By.linkText("Upload your CV")).click();
		
		//Locating by PartialLinkText
		//driver.findElement(By.partialLinkText("Post Job")).click();
		
		//Locating by Xpath
		//driver.findElement(By.xpath("//img[@title='Indeed job search']")).getAttribute("src");
		
		//System.out.println(driver.findElement(By.xpath("//img[@title='Indeed job search']")).getAttribute("src"));
		
		//Locating by Css Selector
		//		System.out.println(driver.findElement(By.cssSelector("css=input.input_submit")).getAttribute("value"));
		
		//Locating by Xpath
		//driver.findElement(By.xpath("//img[@title='Indeed job search']")).getAttribute("src");
		
		//Locating by Tag Name		
		//System.out.println(driver.findElements(By.tagName("a")).size());		
		//System.out.println(driver.findElement(By.tagName("a")).getText());
		
		//Locating by Class Name		
		System.out.println(driver.findElements(By.className("input_text")).size());		
		System.out.println(driver.findElement(By.className("a")).getText());
				
			}

}
