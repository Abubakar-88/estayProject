package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import base.Base;

public class Etsy_Landing_Page extends Base {
	
	WebDriver driver;

	public Etsy_Landing_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateURL() {
		driver.get("https://it.microtechlimited.com/");
	}

	
	@FindBy(xpath="//a[@href='elogin.php']")
	WebElement custLoginBtn;
	
	

	
	 public void click_Jwellery_Set() {
		 custLoginBtn.click();
	}

}
