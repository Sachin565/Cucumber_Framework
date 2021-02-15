package stepDefinitions;
import PageObjects.Address;
import PageObjects.LandingPage;
import PageObjects.MyAccount;
import PageObjects.Payment;
import PageObjects.ProceedToCheck;
import PageObjects.Shipping;
import PageObjects.SignPage;
import PageObjects.SummaryPage;
import PageObjects.TShirtSelect;
import PageObjects.OrderConfirm;
import Resources.Baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Scenario1Step extends Baseclass{

	
	@Given("^User is on automationpractice shopping site$")
	public void user_is_on_automationpractice_shopping_site() throws Throwable {
	    
	    driver=initializeDriver();
	    driver.get("http://automationpractice.com/index.php");
	    
	}

	@When("^User clicks on \"([^\"]*)\" tab$")
	public void user_clicks_on_tab(String arg1) throws Throwable {
	    
	
	    LandingPage lp= new LandingPage(driver);
	    lp.getTshirt().click();
	}

	@When("^adds first T-Shirt to Cart$")
	public void adds_first_T_Shirt_to_Cart() throws Throwable {
	    
		TShirtSelect ts=new TShirtSelect(driver);
		ts.getTshirt().click(); 
		ProceedToCheck pc=new ProceedToCheck(driver);
		pc.getItemsAdded().click();
	}

	@Then("^proceeds to checkout$")
	public void proceeds_to_checkout() throws Throwable {
	    
		ProceedToCheck pc=new ProceedToCheck(driver);
	
		pc.getpopup().click();
	}

	@Then("^sign in with given account$")
	public void sign_in_with_given_account() throws Throwable {
	    
		SummaryPage sp=new SummaryPage(driver);
		sp.getprocced().click();
		SignPage Snp=new SignPage(driver);
		Snp.getemail().sendKeys("mailtosachingharsele@gmail.com");
		Snp.getpassword().sendKeys("Sachin@123");
		Snp.getLogin().click();
	}

	@Then("^provide address details$")
	public void provide_address_details() throws Throwable {
	    
		Address Ads=new Address(driver);
		Ads.getprocced().click();
	}

	@Then("^provide shipping details$")
	public void provide_shipping_details() throws Throwable {
	    
		Shipping shp=new Shipping(driver);
		shp.getCheckBox().click();
		shp.getproceed().click();
	}

	@Then("^provide payment details$")
	public void provide_payment_details() throws Throwable {
	    
	    Payment pmt=new Payment(driver);
	    pmt.getpayment().click();
	    pmt.getorderconfirm().click();
	    OrderConfirm orc=new OrderConfirm(driver);
	    orc.getHome().click();
	}

	@Then("^verify the order is visible in order history$")
	public void verify_the_order_is_visible_in_order_history() throws Throwable {
	    
		 LandingPage lp=new LandingPage(driver);
	    	lp.getprofile().click();
	    	 
	}
	
	@Then("^user is on my account$")
	public void user_is_on_my_account() throws Throwable {
	    
		 MyAccount mya=new MyAccount(driver);
	    	mya.getorder().click();
	    	driver.close();
	}
}
