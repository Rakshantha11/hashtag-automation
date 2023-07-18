package automation.script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_HashtagPage extends Testbase {
	// Passing all valid inputs
	@Test(priority = 1)
	public void successCase() {

		HashtagpageOR.getUserName().sendKeys(prop.getProperty("Name"));
		HashtagpageOR.getEmail().sendKeys(prop.getProperty("Email"));
		HashtagpageOR.getPhone().sendKeys(prop.getProperty("Phone"));

		// HashtagpageOR.getNoticeperiod().sendKeys("NoticePeriod");
		// HashtagpageOR.getExperience().sendKeys("experience");
		HashtagpageOR.getResume().sendKeys("/Users/sai/Downloads/Test.pdf");
		HashtagpageOR.getDescription().sendKeys("Description");
		HashtagpageOR.getClickbtn().submit();
		String sucessMessageFromUI = HashtagpageOR.getmessage().getText();
		String expectedMessage = prop.getProperty("SuccessMessage");
		Assert.assertEquals(sucessMessageFromUI, expectedMessage);
		Reporter.log("Application submitted successfully", true);
		driver.navigate().refresh();

	}

	// Passing invalid name
	@Test(priority = 2)
	public void invalidName() throws InterruptedException {
		HashtagpageOR.getUserName().sendKeys(prop.getProperty("InvalidName"));
		HashtagpageOR.getEmail().sendKeys(prop.getProperty("Email"));
		HashtagpageOR.getPhone().sendKeys(prop.getProperty("Phone"));
//		HashtagpageOR.getNoticeperiod().sendKeys("NoticePeriod");
//		HashtagpageOR.getExperience().sendKeys("experience");
		HashtagpageOR.getResume().sendKeys("/Users/sai/Downloads/test.pdf");
		HashtagpageOR.getDescription().sendKeys("Description");
		Thread.sleep(2000);
		HashtagpageOR.getClickbtn().click();
		String errorMessageFromUI = HashtagpageOR.getmessage().getText();
		String expectedMessage = prop.getProperty("ErrorMessage");
		Assert.assertEquals(errorMessageFromUI, expectedMessage);
		driver.navigate().refresh();


	}

	// Passing empty name
	@Test(priority = 3)
	public void emptyName() throws InterruptedException {
		HashtagpageOR.getUserName().sendKeys(prop.getProperty("EmptyValue"));
		HashtagpageOR.getEmail().sendKeys(prop.getProperty("Email"));
		HashtagpageOR.getPhone().sendKeys(prop.getProperty("Phone"));
//		HashtagpageOR.getNoticeperiod().sendKeys("NoticePeriod");
//		HashtagpageOR.getExperience().sendKeys("experience");
		HashtagpageOR.getResume().sendKeys("/Users/sai/Downloads/test.pdf");
		HashtagpageOR.getDescription().sendKeys("Description");
		Thread.sleep(2000);
     	HashtagpageOR.getClickbtn().click();
		driver.navigate().refresh();
		String errorMessageFromUI = HashtagpageOR.getmessage().getText();
		String expectedMessage = prop.getProperty("ErrorMessage");
		Assert.assertEquals(errorMessageFromUI, expectedMessage);
		driver.navigate().refresh();

	}

	// Passing invalid email
	@Test(priority = 4)
	public void invalidEmail() throws InterruptedException {
		HashtagpageOR.getUserName().sendKeys(prop.getProperty("Name"));
		HashtagpageOR.getEmail().sendKeys(prop.getProperty("InvalidEmail"));
		HashtagpageOR.getPhone().sendKeys(prop.getProperty("Phone"));
//		HashtagpageOR.getNoticeperiod().sendKeys("NoticePeriod");
//		HashtagpageOR.getExperience().sendKeys("experience");
		HashtagpageOR.getResume().sendKeys("/Users/sai/Downloads/test.pdf");
		HashtagpageOR.getDescription().sendKeys("Description");
		Thread.sleep(2000);
		HashtagpageOR.getClickbtn().click();
		String errorMessageFromUI = HashtagpageOR.getmessage().getText();
		String expectedMessage = prop.getProperty("ErrorMessage");
		Assert.assertEquals(errorMessageFromUI, expectedMessage);
		driver.navigate().refresh();

	}

	// Passing empty email
	@Test(priority = 5)
	public void emptyEmail() throws InterruptedException {
		HashtagpageOR.getUserName().sendKeys(prop.getProperty("Name"));
		HashtagpageOR.getEmail().sendKeys(prop.getProperty("EmptyValue"));
		HashtagpageOR.getPhone().sendKeys(prop.getProperty("Phone"));
//		HashtagpageOR.getNoticeperiod().sendKeys("NoticePeriod");
//		HashtagpageOR.getExperience().sendKeys("experience");
		HashtagpageOR.getResume().sendKeys("/Users/sai/Downloads/test.pdf");
		HashtagpageOR.getDescription().sendKeys("Description");
		Thread.sleep(2000);
		HashtagpageOR.getClickbtn().click();
		String errorMessageFromUI = HashtagpageOR.getmessage().getText();
		String expectedMessage = prop.getProperty("ErrorMessage");
		Assert.assertEquals(errorMessageFromUI, expectedMessage);
		driver.navigate().refresh();

	}

	// Passing invalid phone
	@Test(priority = 6)
	public void invalidPhone() throws InterruptedException {

		HashtagpageOR.getUserName().sendKeys(prop.getProperty("Name"));
		HashtagpageOR.getEmail().sendKeys(prop.getProperty("Email"));
		HashtagpageOR.getPhone().sendKeys(prop.getProperty("InvalidPhone"));
//		HashtagpageOR.getNoticeperiod().sendKeys("NoticePeriod");
//		HashtagpageOR.getExperience().sendKeys("experience");
		HashtagpageOR.getResume().sendKeys("/Users/sai/Downloads/test.pdf");
		HashtagpageOR.getDescription().sendKeys("Description");
		Thread.sleep(2000);
		HashtagpageOR.getClickbtn().click();
		String errorMessageFromUI = HashtagpageOR.getmessage().getText();
		String expectedMessage = prop.getProperty("ErrorMessage");
		Assert.assertEquals(errorMessageFromUI, expectedMessage);
		driver.navigate().refresh();

	}

	// Passing empty phone
	@Test(priority = 7)
	public void emptyPhone() throws InterruptedException {

		HashtagpageOR.getUserName().sendKeys(prop.getProperty("Name"));
		HashtagpageOR.getEmail().sendKeys(prop.getProperty("Email"));
		HashtagpageOR.getPhone().sendKeys(prop.getProperty("EmptyValue"));
//		HashtagpageOR.getNoticeperiod().sendKeys("NoticePeriod");
//		HashtagpageOR.getExperience().sendKeys("experience");
		HashtagpageOR.getResume().sendKeys("/Users/sai/Downloads/test.pdf");
		HashtagpageOR.getDescription().sendKeys("Description");
		Thread.sleep(2000);
		HashtagpageOR.getClickbtn().click();
		String errorMessageFromUI = HashtagpageOR.getmessage().getText();
		String expectedMessage = prop.getProperty("ErrorMessage");
		Assert.assertEquals(errorMessageFromUI, expectedMessage);
		driver.navigate().refresh();

	}
/*
	// Passing invalid NoticePeriod
	@Test(priority = 8)
	public void invalidNoticePeriod() throws InterruptedException {

		HashtagpageOR.getUserName().sendKeys(prop.getProperty("Name"));
		HashtagpageOR.getEmail().sendKeys(prop.getProperty("Email"));
		HashtagpageOR.getPhone().sendKeys(prop.getProperty("Phone"));
		// HashtagpageOR.getNoticeperiod().sendKeys("InvalidNoticePeriod");
		// HashtagpageOR.getExperience().sendKeys("experience");
		HashtagpageOR.getResume().sendKeys("/Users/sai/Downloads/test.pdf");
		HashtagpageOR.getDescription().sendKeys("Description");
		Thread.sleep(2000);
		HashtagpageOR.getClickbtn().click();
		String errorMessageFromUI = HashtagpageOR.getmessage().getText();
		String expectedMessage = prop.getProperty("ErrorMessage");
		Assert.assertEquals(errorMessageFromUI, expectedMessage);
		driver.navigate().refresh();

	}
	

	// Passing empty NoticePeriod
	@Test(priority = 9)
	public void emptyNoticePeriod() throws InterruptedException {

		HashtagpageOR.getUserName().sendKeys(prop.getProperty("Name"));
		HashtagpageOR.getEmail().sendKeys(prop.getProperty("Email"));
		HashtagpageOR.getPhone().sendKeys(prop.getProperty("Phone"));
		// HashtagpageOR.getNoticeperiod().sendKeys("EmptyValue");
		// HashtagpageOR.getExperience().sendKeys("experience");
		HashtagpageOR.getResume().sendKeys("/Users/sai/Downloads/test.pdf");
		HashtagpageOR.getDescription().sendKeys("Description");
		Thread.sleep(2000);
		HashtagpageOR.getClickbtn().click();
		String errorMessageFromUI = HashtagpageOR.getmessage().getText();
		String expectedMessage = prop.getProperty("ErrorMessage");
		Assert.assertEquals(errorMessageFromUI, expectedMessage);
		driver.navigate().refresh();

	}

	// Passing invalid experience
	@Test(priority = 10)
	public void invalidexperience() throws InterruptedException {

		HashtagpageOR.getUserName().sendKeys(prop.getProperty("Name"));
		HashtagpageOR.getEmail().sendKeys(prop.getProperty("Email"));
		HashtagpageOR.getPhone().sendKeys(prop.getProperty("Phone"));
		// HashtagpageOR.getNoticeperiod().sendKeys("NoticePeriod");
		// HashtagpageOR.getExperience().sendKeys("InvalidExperience");
		HashtagpageOR.getResume().sendKeys("/Users/sai/Downloads/test.pdf");
		HashtagpageOR.getDescription().sendKeys("Description");
		Thread.sleep(2000);
		HashtagpageOR.getClickbtn().click();
		String errorMessageFromUI = HashtagpageOR.getmessage().getText();
		String expectedMessage = prop.getProperty("ErrorMessage");
		Assert.assertEquals(errorMessageFromUI, expectedMessage);
		driver.navigate().refresh();

	}

	// Passing empty experience
	@Test(priority = 11)
	public void emptyexperience() throws InterruptedException {

		HashtagpageOR.getUserName().sendKeys(prop.getProperty("Name"));
		HashtagpageOR.getEmail().sendKeys(prop.getProperty("Email"));
		HashtagpageOR.getPhone().sendKeys(prop.getProperty("Phone"));
		// HashtagpageOR.getNoticeperiod().sendKeys("NoticePeriod");
		// HashtagpageOR.getExperience().sendKeys("EmptyValue");
		HashtagpageOR.getResume().sendKeys("/Users/sai/Downloads/test.pdf");
		HashtagpageOR.getDescription().sendKeys("Description");
		Thread.sleep(2000);
		HashtagpageOR.getClickbtn().click();
		String errorMessageFromUI = HashtagpageOR.getmessage().getText();
		String expectedMessage = prop.getProperty("ErrorMessage");
		Assert.assertEquals(errorMessageFromUI, expectedMessage);
		driver.navigate().refresh();

	}
*/
	// Passing invalid resume
	@Test(priority = 12)
	public void invalidresume() throws InterruptedException {

		HashtagpageOR.getUserName().sendKeys(prop.getProperty("Name"));
		HashtagpageOR.getEmail().sendKeys(prop.getProperty("Email"));
		HashtagpageOR.getPhone().sendKeys(prop.getProperty("Phone"));
//		HashtagpageOR.getNoticeperiod().sendKeys("NoticePeriod");
//		HashtagpageOR.getExperience().sendKeys("experience");
		HashtagpageOR.getResume().sendKeys("/Users/sai/Downloads/test.image");
		HashtagpageOR.getDescription().sendKeys("Description");
		Thread.sleep(2000);
		HashtagpageOR.getClickbtn().click();
		String errorMessageFromUI = HashtagpageOR.getmessage().getText();
		String expectedMessage = prop.getProperty("ErrorMessage");
		Assert.assertEquals(errorMessageFromUI, expectedMessage);
		driver.navigate().refresh();

	}

	// Passing empty experience
	@Test(priority = 13)
	public void emptyresume() throws InterruptedException {

		HashtagpageOR.getUserName().sendKeys(prop.getProperty("Name"));
		HashtagpageOR.getEmail().sendKeys(prop.getProperty("Email"));
		HashtagpageOR.getPhone().sendKeys(prop.getProperty("Phone"));
//		HashtagpageOR.getNoticeperiod().sendKeys("NoticePeriod");
//		HashtagpageOR.getExperience().sendKeys("experience");
		HashtagpageOR.getResume().sendKeys("EmptyValue");
		HashtagpageOR.getDescription().sendKeys("Description");
		Thread.sleep(2000);
		HashtagpageOR.getClickbtn().click();
		String errorMessageFromUI = HashtagpageOR.getmessage().getText();
		String expectedMessage = prop.getProperty("ErrorMessage");
		Assert.assertEquals(errorMessageFromUI, expectedMessage);
		driver.navigate().refresh();

	}

	// Passing empty description
	@Test(priority = 14)
	public void emptyDescription() throws InterruptedException {

		HashtagpageOR.getUserName().sendKeys(prop.getProperty("Name"));
		HashtagpageOR.getEmail().sendKeys(prop.getProperty("Email"));
		HashtagpageOR.getPhone().sendKeys(prop.getProperty("Phone"));
//		HashtagpageOR.getNoticeperiod().sendKeys("NoticePeriod");
//		HashtagpageOR.getExperience().sendKeys("experience");
		HashtagpageOR.getResume().sendKeys("/Users/sai/Downloads/test.pdf");
		HashtagpageOR.getDescription().sendKeys("EmptyValue");
		Thread.sleep(2000);
		HashtagpageOR.getClickbtn().click();
		String errorMessageFromUI = HashtagpageOR.getmessage().getText();
		String expectedMessage = prop.getProperty("ErrorMessage");
		Assert.assertEquals(errorMessageFromUI, expectedMessage);
		driver.navigate().refresh();

	}

}
