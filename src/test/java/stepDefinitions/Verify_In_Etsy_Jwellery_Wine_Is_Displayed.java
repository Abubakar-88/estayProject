package stepDefinitions;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Etsy_Landing_Page;


public class Verify_In_Etsy_Jwellery_Wine_Is_Displayed extends Base{
	
	Etsy_Landing_Page landingPage = new Etsy_Landing_Page(driver);
	
	
	@Given("I am in etsy home page")
	public void i_am_in_etsy_home_page() {
		landingPage.navigateURL();
	}


	@Then("I click on jewllery set")
	public void i_click_on_jewllery_set() throws InterruptedException {
		
		landingPage.click_Jwellery_Set();
	}




}
