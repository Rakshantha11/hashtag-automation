package automation.script;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import automation.pages.Hashtag;

public class Testbase {
	WebDriver driver;
	Hashtag HashtagpageOR;
	SoftAssert sAssert = new SoftAssert();
	FileInputStream fileLoc;
	Properties prop;
	Alert JSAlert;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void setup(String browser, String url) throws IOException {
		fileLoc = new FileInputStream("/Users/sai/Documents/selenium_workspace/selenium/src/com/qa/testdata/INPUT DATA");
		prop = new Properties();
		prop.load(fileLoc);

		System.setProperty("webdriver.chrome.driver", "/Users/sai/Documents/Software/chromedriver_mac64/chromedriver");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get(url);

		HashtagpageOR = new Hashtag(driver);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}