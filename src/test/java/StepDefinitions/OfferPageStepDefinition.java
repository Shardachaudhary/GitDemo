package StepDefinitions;

import org.junit.Assert;

import PageObject.LandingPage;
import PageObject.OffersPage;
import PageObject.PageObjectManager;
import Utils.TestContextSetup;
import io.cucumber.java.en.Then;

public class OfferPageStepDefinition {
	public String offerPageProductName;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	
	public OfferPageStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}

	@Then("^user searched for (.+) shortname in offers page$")
	public void user_searched_for_same_shortname_in_offers_page(String shortName) throws InterruptedException {
	    
		switchToOffersPage();
		OffersPage offersPage  =testContextSetup.pageObjectManager.OffersPage();
		offersPage.searchItem(shortName);
		Thread.sleep(2000);
		offerPageProductName = offersPage.getProductName();		
	}

	public void switchToOffersPage()
	{
		//if switched to offer page-> skip below part
		LandingPage landingPage  =testContextSetup.pageObjectManager.getLandingPage();
		landingPage.selectTopDealsPage();
		testContextSetup.genericUtils.SwitchWindowToChild();	
	}
	
	@Then("validate product name in offers page matches with Landing Page")
	public void validate_product_name_in_Offers_page()
	{
		Assert.assertEquals(offerPageProductName, testContextSetup.landingPageProductName);
	}	
}
