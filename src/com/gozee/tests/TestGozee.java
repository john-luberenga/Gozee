package com.gozee.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGozee {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Create firefox driver to drive the browser
		WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\John BackUp\\PROGRAMMING\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver","C:\\John BackUp\\PROGRAMMING\\SOFTWARE\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		//Searching google
		driver.get("http://www.google.com");
		driver.findElement(By.className("gsfi")).sendKeys("gozee app");
		driver.findElement(By.className("lsb")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Gozee")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		//Scrolling the page down
		Thread.sleep(5000);
		driver.findElement(By.id("ember753-select-nu0.6605481872046969")).getAttribute("placeholder");
		
		/*driver.findElement(By.cssSelector("#ember808")).click();
		driver.findElement(By.cssSelector("#ember808")).clear();
		driver.findElement(By.cssSelector("#ember808")).sendKeys("Kenya");
		driver.findElement(By.cssSelector("#ember815")).click();
		driver.navigate().back();
		// ERROR: Caught exception [ERROR: Unsupported command [getEval | selenium.browserbot.getCurrentWindow().scrollTo(100,400) | ]]
		driver.findElement(By.cssSelector("#ember1069")).clear();
		driver.findElement(By.cssSelector("#ember1069")).sendKeys("Uganda");
		driver.findElement(By.cssSelector("#ember1075")).click();
		driver.navigate().back();
		// ERROR: Caught exception [ERROR: Unsupported command [getEval | selenium.browserbot.getCurrentWindow().scrollTo(100,400) | ]]
		driver.findElement(By.cssSelector("#ember1149")).clear();
		driver.findElement(By.cssSelector("#ember1149")).sendKeys("kampala");
		driver.findElement(By.cssSelector("#ember1155")).click();
		driver.findElement(By.cssSelector("h3[title=\"Care Clinic - test\"]")).click();
		// ERROR: Caught exception [ERROR: Unsupported command [getEval | selenium.browserbot.getCurrentWindow().scrollTo(100,200) | ]]
		driver.findElement(By.cssSelector("#ember1575")).click();
		// ERROR: Caught exception [ERROR: Unsupported command [getEval | selenium.browserbot.getCurrentWindow().scrollTo(100,400) | ]]
		driver.findElement(By.xpath("//div[@id='ember543']/section[3]/div[4]/div/article/div/table/tr[5]/td/div")).click();
		driver.findElement(By.cssSelector("#ember2029")).clear();
		driver.findElement(By.cssSelector("#ember2029")).sendKeys("John");
		driver.findElement(By.cssSelector("#ember2031")).clear();
		*/
				
		
		
		
		
		

	}

}
