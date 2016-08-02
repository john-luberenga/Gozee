ampalapackage com.gozee.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GozeeSiteTabs {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Create firefox driver to drive the browser
		WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\John BackUp\\PROGRAMMING\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver","C:\\John BackUp\\PROGRAMMING\\SOFTWARE\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		/*driver.get("http://www.google.com");
		driver.findElement(By.className("gsfi")).sendKeys("gozee app");
		driver.findElement(By.className("lsb")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Gozee")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		driver.close();*/
		
		
		driver.get("https://www.gozeeapp.com");
		driver.findElement(By.xpath("//a[@href='/terms-of-service']")).click();	
		if(driver.getPageSource().contains("Gozee Terms of Service"))
		{
			System.out.println("PASS ONE");
		}
		else
		{
			System.out.println("FAIL ONE");
		}
		driver.findElement(By.xpath("//a[@href='/privacy-policy']")).click();	
		if(driver.getPageSource().contains("Gozee Privacy Policy"))
		{
			System.out.println("PASS TWO");
		}
		else
		{
			System.out.println("FAIL TWO");
		}
		driver.findElement(By.linkText("About Us"));
		}
		
		//Add text to allow pop-up of the accessmobile page
		
	
	}


