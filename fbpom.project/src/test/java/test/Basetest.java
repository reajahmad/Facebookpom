package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import page.Homepage;

public class Basetest {
	static WebDriver driver;
	static Homepage hp;
	
	
	
	@BeforeSuite
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.Facebook.com");
	}
	public void gethomepage () {
		hp=new Homepage (driver);
		
		
	}

	
	
	
	
	
	

}
