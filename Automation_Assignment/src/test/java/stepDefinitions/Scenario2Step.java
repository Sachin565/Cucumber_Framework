package stepDefinitions;
import org.openqa.selenium.JavascriptExecutor;
import PageObjects.InformUpdate;
import PageObjects.LandingPage;
import PageObjects.MyAccount;
import PageObjects.PersonalInform;
import PageObjects.SignPage;
import Resources.Baseclass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Scenario2Step extends Baseclass {
	@When("^User clicks goes to 'My Account' section$")
	public void user_clicks_goes_to_My_Account_section() throws Throwable {
	    
	    driver=initializeDriver();
	    driver.get("http://automationpractice.com/index.php");
	    driver.manage().window().maximize();
	}
	    @When("^User clicks goes to Sign IN section$")
	    public void user_clicks_goes_to_Sign_IN_section() throws Throwable {
	        
	    	LandingPage lp=new LandingPage(driver);
		    lp.getsignin().click();
	    	 
	    }

	    @Then("^User provide credential to 'Sign In ' section$")
	    public void user_goes_to_My_Account_section() throws Throwable {
		    
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
			SignPage Snp=new SignPage(driver);
				Snp.getemail().sendKeys("mailtosachingharsele@gmail.com");
				Snp.getpassword().sendKeys("Sachin@123");
				Snp.getLogin().click();
      
	   
	    	}

	@When("^User is on 'My Account ' section$")
	public void user_is_on_My_Account_section() throws Throwable {
		
    
		MyAccount mya=new MyAccount(driver);
		mya.getInfo().click();
	}


	@Then("^He updates his first name from XXX to YYY OR YYY to XXX$")
	public void he_updates_his_first_name_from_XXX_to_YYY_OR_YYY_to_XXX() throws Throwable {
	    
		PersonalInform pnif=new PersonalInform(driver);
		pnif.getfirstname().getText();
		pnif.getfirstname().clear();
		pnif.getfirstname().sendKeys("sachin");
		pnif.getfirstname().getText();
		pnif.getOldPassword().sendKeys("Sachin@123");
		pnif.getNewPassword().sendKeys("Sachin@123");
		pnif.getConfirmation().sendKeys("Sachin@123");
		pnif.toSave().click();
	}

	@Then("^confirmation of update is received$")
	public void confirmation_of_update_is_received() throws Throwable {
	    
		InformUpdate Inupd=new InformUpdate(driver);
        Inupd.getMssg().getText();
        driver.close();
	}
}
