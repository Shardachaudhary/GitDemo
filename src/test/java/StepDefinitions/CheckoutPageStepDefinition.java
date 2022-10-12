package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageObject.CheckoutPage;
import Utils.TestContextSetup;
import io.cucumber.java.en.Then;

public class CheckoutPageStepDefinition {
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	public CheckoutPage checkoutPage;
	TestContextSetup testContextSetup;
	//Spring framework, EJB, 
	//SRP
	//
	public CheckoutPageStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.checkoutPage = testContextSetup.pageObjectManager.getCheckoutPage();
	}

	@Then("verify user has ability to enter promo code and place the order")
	public void  verify_user_has_ability_enter_promo()
	{
		
		Assert.assertTrue(checkoutPage.VerifyPromoBtn());
		Assert.assertTrue(checkoutPage.VerifyPlaceOrder());
		
	}

	@Then("^User proceeds to Checkout and validate the (.+) items in checkout page$")
	public void user_proceeds_to_checkout(String name) throws InterruptedException
	{	
		checkoutPage.CheckoutItems();
}
}