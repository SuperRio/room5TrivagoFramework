package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
		}

	@FindBy(css = "div.search-icon")
	public WebElement searchBar;
	public void clickSearchBar() 
	{
		clickButton(searchBar);
	}
	
	@FindBy(css = "input.input.search-input")
	public WebElement searchInput;
	public void typeInSearch() 
	{
		setText(searchInput,"Germany");
	}
	
	public void inputSearch(){
		searchInput.sendKeys(Keys.RETURN);
	}
	
	
	@FindBy(css = "div.Cookie__button")
	public WebElement cookieClose;
	public void closeCookie()
	{
		cookieClose.click();
	}
	
	@FindBy(xpath = "//input[@id='confirm']")
	public WebElement newsletterCheckbox;
	public void CheckNewsletter()
	{
		newsletterCheckbox.click();
	}
	
	@FindBy(xpath = "//input[@name='email']")
	public WebElement newsletterEmail;
	public void NewsletterEmail()
	{
		setText(newsletterEmail, "mario.nady07@gmail.com");
	}
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement submitNewsletterBtn;
	public void SubmitNewsletter()
	{
		submitNewsletterBtn.click();
	}
	
	
	@FindBy(css = "div.nav-icon")
	public WebElement menuTopLeft;
	public void ClickOnMenu()
	{
		menuTopLeft.click();
	}
	
	@FindBy(css = "div.destination-menu")
	public WebElement dest;
	public void ClickOnDestination()
	{
		dest.click();
	}

}
