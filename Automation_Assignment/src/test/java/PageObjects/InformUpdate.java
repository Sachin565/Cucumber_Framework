package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InformUpdate {
public WebDriver driver;

private By mssg= By.xpath("//p[@class='alert alert-success']");

public InformUpdate(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}


public WebElement getMssg()
{
	return driver.findElement(mssg);
}
}
