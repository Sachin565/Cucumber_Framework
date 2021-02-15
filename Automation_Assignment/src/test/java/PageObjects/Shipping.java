package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shipping {
	public WebDriver driver;

private	By checkbox=By.id("cgv");
private	By proceed=By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]");
	
	public Shipping(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getCheckBox()
	{
		return driver.findElement(checkbox);
	}
	
	public WebElement getproceed()
	{
		return driver.findElement(proceed);
	}

}
