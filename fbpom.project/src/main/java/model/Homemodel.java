package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homemodel extends Basemodel {
	public Homemodel (WebDriver g) {
		 super (g);
	}
	
	public WebElement Getbutton () {
		WebElement s=driver.findElement(By.xpath("//a[text()='Create new account']"));
		return s;
	}
	

}
