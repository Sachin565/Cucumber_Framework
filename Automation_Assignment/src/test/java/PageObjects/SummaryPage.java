package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SummaryPage {

	public WebDriver driver;
	
private	By Quantity=By.xpath("//input[@name='quantity_1_1_0_446846']");
private	By proceed=By.xpath("\r\n" + 
			"//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]\r\n" + 
			"");
	
	public SummaryPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement getQuantity()
	{
		return driver.findElement(Quantity);
	}
	
	public WebElement getprocced()
	{
		return driver.findElement(proceed);
	}
}
