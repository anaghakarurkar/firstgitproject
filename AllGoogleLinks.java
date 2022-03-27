package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class AllGoogleLinks {
	WebDriver driver;

	@Test
	public void printAllGoogleLinksWithTheirHref() {
		driver.get("http://www.google.com");
		List<WebElement> allGoogleLinks = driver.findElements(By.tagName("a"));
		
		for(WebElement element: allGoogleLinks)
		{
			System.out.println(element.getText() + "-" + element.getAttribute("href"));
		}
//		for(int i =0 ; i<=allGoogleLinks.size(); i++)
//		{
//			System.out.println(allGoogleLinks.get(i).getText());
//		}
	}
	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am inside beforeClass method()");
		System.setProperty("webdriver.chrome.driver", "test/resources/chromedriver");
	//	driver = new ChromeDriver();
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		try {
			driver = new RemoteWebDriver(
			new URL("http://localhost:4444"), caps);
			} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}

	@AfterClass
	public void afterClass() {
	}

}
