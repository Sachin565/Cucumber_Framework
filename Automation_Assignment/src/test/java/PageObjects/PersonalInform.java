package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalInform {
	
private	By Firstname=By.id("firstname");
private By OldPassword=By.id("old_passwd");
private By NewPassword=By.id("passwd");
private By Confirmation=By.id("confirmation");
private By Save=By.cssSelector("button[name='submitIdentity'] span");
	
	public WebDriver driver;
	
	public PersonalInform(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement getfirstname()
	{
		return driver.findElement(Firstname);
	}
	
	public WebElement getOldPassword()
	{
		return driver.findElement(OldPassword);
	}

	public WebElement getNewPassword()
	{
		return driver.findElement(NewPassword);
	}

	public WebElement getConfirmation()
	{
		return driver.findElement(Confirmation);
	}


	public WebElement toSave()
	{
		return driver.findElement(Save);
	}

}
