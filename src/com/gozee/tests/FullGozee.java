package com.gozee.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FullGozee {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Create firefox driver to drive the browser
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//System.setProperty("webdriver.chrome.driver","C:\\John BackUp\\PROGRAMMING\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver","C:\\John BackUp\\PROGRAMMING\\SOFTWARE\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://healthadvs2.cloudapp.net/");
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 1500)"); //y value  can be altered
		Thread.sleep(5000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("scroll(250, 0)"); //x value can be altered
		 }}
		
	
		

		

	}

}
