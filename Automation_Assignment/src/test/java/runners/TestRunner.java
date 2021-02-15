package runners;
/**
 * -- Generic TAG -- 
 * Sprint wise Tag = @Sprint1
 * Regression Tag = @Regression
 * 
 *  Specific Tag will need to mentioned specifically
 *  
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = {"src/test/java/features"},
glue= {"stepDefinitions"},
plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
)


public class TestRunner {
	@After
	public void after()
	{
		System.out.println("After each scenario ");
	}
	
	
	@AfterClass
    public static void writeExtentReport() {
     //Reporter.loadXMLConfig(new File("config/report.xml"));    
    }
}