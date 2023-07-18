package automation.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hashtag {
	
	public Hashtag (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	WebDriver driver;
	
	@FindBy (xpath="//input[@placeholder='Enter your name']")
	WebElement Username;
	public WebElement getUserName() {
		return  Username;
	}
	
	@FindBy (css="input[Type='email']")
	WebElement Email;
	public WebElement getEmail() {
		return  Email;
	}
	@FindBy (xpath="//input[@name='phone']")
	WebElement Phone;
	public WebElement getPhone() {
		return  Phone;
	}
	/*@FindBy (xpath="//input[@placeholder='Notice Period (Days)']")
	WebElement Noticeperiod;
	public WebElement getNoticeperiod() {
		return  Noticeperiod;
	}
		@FindBy (xpath="//input[@name='experience']")
		WebElement Experience;
		public WebElement getExperience() {
			return  Experience;
}*/
		@FindBy (css="input[type='file']")
		WebElement Resume;
		public WebElement getResume() {
			return  Resume;
		
}
		@FindBy (css="textarea[placeholder='Briefly Describe Yourself']")
		WebElement Description;
		public WebElement getDescription() {
			return  Description;	
}
		@FindBy (xpath="//button[@class='btn form-button font-12 font-bold']")
		WebElement Clickbtn;
		public WebElement getClickbtn() {
					return  Clickbtn;
}
		@FindBy (xpath="//h4[@class='JoinUs_text_orange__P6pf-']")
		WebElement Message;
		public WebElement getmessage() {
					return  Message;
		}	
}