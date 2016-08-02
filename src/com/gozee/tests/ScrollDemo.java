package com.gozee.tests;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://facebook.com");
	Thread.sleep(5000);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("scroll(0, 1500)"); //y value  can be altered
	//Thread.sleep(5000);
	//JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	//jse1.executeScript("scroll(250, 0)"); //x value can be altered

	}

}
