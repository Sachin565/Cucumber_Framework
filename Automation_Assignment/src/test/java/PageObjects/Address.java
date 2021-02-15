package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Address {
public WebDriver driver;

private By proceed= By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]");

public Address(WebDriver driver)
{
	this.driver=driver;
}

public WebElement getprocced() 
{
	return driver.findElement(proceed);
	
}
}
