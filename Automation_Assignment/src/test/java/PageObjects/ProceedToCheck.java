package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProceedToCheck {
	
	public WebDriver driver;
	
private	By Cart=By.xpath("//button[@name='Submit']//span");
private	By popup=By.cssSelector("a[title='Proceed to checkout']");
	
	public ProceedToCheck(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

public WebElement getItemsAdded()
{
	return driver.findElement(Cart);
}

public WebElement getpopup()
{
	return driver.findElement(popup);
}

}
