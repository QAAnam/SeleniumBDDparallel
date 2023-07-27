package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilClass.UtilClass;

public class LoginPage
{
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name ="email")
	private WebElement inputEmail;
	@FindBy(name ="password")
	private WebElement inputPassword;
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement submitButton;
	@FindBy(className = "alert")
	private WebElement alert;
	public void enterEmail(String s)
	{
		inputEmail.sendKeys(s);
		UtilClass.printutil("LoginPage.enterEmail"+" get executed ");
	}
	public void enterPassword(String s)
	{
		inputPassword.sendKeys(s);
		UtilClass.printutil("LoginPage.enterPassword"+" get executed ");
	}
	public void clickOnSubmit()
	{
		submitButton.click();
		UtilClass.printutil("LoginPage.clickOnSubmit"+" get executed ");
	}
	public String getAlertMassage()
	{
		UtilClass.printutil("LoginPage.getAlertMassage"+" get executed ");
		return  alert.getText();
	}

	
	public WebElement getInputEmail()
	{
		UtilClass.printutil("LoginPage.enterEmail"+" is fetched");
		return inputEmail;
	}
	public WebElement getInputPassword() 
	{
		UtilClass.printutil("LoginPage.enterPassword"+"  is fetched ");
		return inputPassword;
	}
	public WebElement getSubmitButton() 
	{
		UtilClass.printutil("LoginPage.clickOnSubmit"+" is fetched ");
		return submitButton;
	}
	public WebElement getAlert() {
		return alert;
	}
	

}
