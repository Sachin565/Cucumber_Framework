package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Payment {
public WebDriver driver ;

private By paymentoption=By.cssSelector("a[title='Pay by bank wire']");
private By confirm=By.xpath("//button[@class='button btn btn-default button-medium']//span");

public Payment(WebDriver driver)
{
	this.driver=driver;
}

public WebElement getpayment()
{
	return driver.findElement(paymentoption);
}

public WebElement getorderconfirm()
{
	return driver.findElement(confirm);
}

}
