package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.Homemodel;
public class Homepage extends Homemodel {
	
	
	public Homepage (WebDriver h) {
		super (h);
	}
	
	public void ClickonButton() {
		WebElement g=Getbutton();
		g.click();
		
	}
}
