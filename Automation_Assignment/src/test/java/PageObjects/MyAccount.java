package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccount {
	
	public WebDriver driver;
private	By Info=By.xpath("//span[normalize-space()='My personal information']");
private By order=By.cssSelector("a[title='Orders'] span");
	
	public MyAccount(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement getInfo()
	{
		return driver.findElement(Info);
	}
	
	public WebElement getorder()
	{
		return driver.findElement(order);
	}

}
