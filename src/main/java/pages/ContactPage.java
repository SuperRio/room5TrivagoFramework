package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends PageBase {

	public ContactPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "div.Cookie__button")
	public WebElement cookieClose;
	public void closeCookie()
	{
		cookieClose.click();
	}

	@FindBy (xpath = "//textarea[@class='contact-msg']")
	public WebElement contactMsg;
	public void ContactMsg(String feedback)
	{
		setText(contactMsg, feedback);
	}

	@FindBy (css = "input.contact-input")
	public WebElement Name;
	public void WriteName()
	{
		setText(Name, "Mario Farid");
	}

	@FindBy (xpath = "//input[@id='contact-email']")
	public WebElement Email;
	public void WriteEmail()
	{
		setText(Email, "mario.nady07@gmail.com");
	}

	@FindBy (css = "input#confirm")
	public WebElement confirmCheckBox;
	public void ConfirmFeedback()
	{
		confirmCheckBox.click();
	}

	@FindBy (css = "button.contact-submit")
	public WebElement submitBtn;
	public void ClickSubmit()
	{
		submitBtn.click();
	}



}
