package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	private By Signin = By.cssSelector("a[title='Log in to your customer account']");
private	By Tshirt=By.xpath("//body/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]/a[1]");
	private By signin = By.cssSelector("a[title='Log in to your customer account']");
private	By profile=By.cssSelector("a[title='View my customer account'] span");

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getLogin() {
		return driver.findElement(Signin);
	}

	public WebElement getTshirt() {
		return driver.findElement(Tshirt);
	}

	public WebElement getsignin() {
		return driver.findElement(signin);
	}
	
	public WebElement getprofile() {
		return driver.findElement(profile);
	}

}
