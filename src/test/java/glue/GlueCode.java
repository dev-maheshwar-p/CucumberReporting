package glue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import cucumber.api.java.en.Given;

public class GlueCode {
	
	@Given("^this is step (\\d+)$")
	public void this_is_step(int arg1) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:/Users/devma/OneDrive/Documents/Workspace/EclipseNeonJEE/SampleJavaLibraryProject/cucable-test-project/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		WebDriver wd = new ChromeDriver(options);
		wd.get("http://www.google.com");
		
		Assert.assertEquals(wd.getTitle(), "Googlee");
	}
	
	@Given("^this is new step (\\d+)$")
	public void this_is_new_step(int arg1) throws Throwable {
		System.out.println("Another Step");
	}
	
	@Given("^this is setup step (\\d+)$")
	public void this_is_setup_step(int arg1) throws Throwable {
		System.out.println("This is setup step");
	}
}
