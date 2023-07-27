package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage 
{
	WebDriver driver;
	public MyAccountPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Edit your account information")
	private static WebElement Edit_your_account_information;
	@FindBy(linkText = "Change your password")
	private static WebElement Change_your_password;
	@FindBy(linkText = "Modify your address book entries")
	private static WebElement Modify_your_address_book_entries;
	@FindBy(linkText = "Modify your wish list")
	private static WebElement Modify_your_wish_list;
	
	
	public WebElement getEdit_your_account_information() {
		return Edit_your_account_information;
	}
	public WebElement getChange_your_password() {
		return Change_your_password;
	}
	public WebElement getModify_your_address_book_entries() {
		return Modify_your_address_book_entries;
	}
	public WebElement getModify_your_wish_list() {
		return Modify_your_wish_list;
	}
	
}
