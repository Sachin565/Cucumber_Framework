package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderConfirm {
	
	public WebDriver driver;

private	By Home =By.xpath("//i[@class='icon-home']");
	
	public OrderConfirm(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getHome()
	{
		return driver.findElement(Home);
	}

}
