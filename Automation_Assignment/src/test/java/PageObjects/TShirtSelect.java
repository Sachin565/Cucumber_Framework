package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TShirtSelect {
public WebDriver driver;

private By SelectTshirt=By.xpath("//img[@title='Faded Short Sleeve T-shirts']");

public TShirtSelect(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}

public WebElement getTshirt()
{
	return driver.findElement(SelectTshirt);
}

}
