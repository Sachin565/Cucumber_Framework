package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Baseclass {
	
	public static WebDriver driver; 
public WebDriver initializeDriver() throws IOException
{	
Properties prop=new Properties();

	FileInputStream fls=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Resources\\data.properties");
	
	prop.load(fls);
	
String browserName=prop.getProperty("browser"); 
	System.out.println(browserName);
	
	if(browserName.contains("chrome"))
	{
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\Resources\\chromedriver.exe");
		
		 ChromeOptions options=new ChromeOptions();
		 if(browserName.contains("headless"))
		 {
		options.addArguments("headless"); 
		 }
		driver=new ChromeDriver(options);
		
	}
	
	else if(browserName.equals("firefox"))
	{
		driver=new FirefoxDriver();
		// execute in firefox
	}
	else if(browserName.equals("IE"))
	{
		//execute in IE
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    return driver;

}

public void getScreenshot(String result) throws IOException
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src,new File("D://"+result+"screenshot.png"));
}



}
