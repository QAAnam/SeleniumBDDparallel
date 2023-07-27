package pages;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilClass.ActionUtility;
import utilClass.JsUtility;
import utilClass.RobotUtility;
import utilClass.SelectUtils;
import utilClass.UtilClass;

public class HomePage
{
	private WebDriver driver;

	public HomePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement My_Account;
	
	@FindBy(linkText = "Login")
	private WebElement Login;
	
	@FindBy(name="search")
	private WebElement search;
	
	@FindBy(xpath="(//button[@type='button']//i)[1]")
	private WebElement searchbutton;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement Search_in_product_descriptions;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement Search_in_subcategories;
	
	@FindBy(name="category_id")
	private WebElement Select_category_id;
	
	@FindBy(xpath="//select[@name='category_id']//option")
	private List<WebElement> Select_category_id_selections;
	
	@FindBy(linkText="Products meeting the search criteria")
	private WebElement Products_meeting_the_search_criteria;
	
	@FindBy(xpath="//input[@value='Search']")
	private WebElement newSearch;
	
	@FindBy(linkText = "OpenCart")
	private WebElement openKartLinkOnBottom;
	
	@FindBy(xpath="//*[text()='123456789']")
	private WebElement contactnum;
	
	public void scrollTocontactnum()
	{
		JsUtility.scrollToText(driver, contactnum);
	}
	public void scrollToopenKartLinkOnBottom()
	{
		JsUtility.scrollToText(driver, openKartLinkOnBottom);
	}
	public void rightclickOpenCart()
	{
		ActionUtility.rightClickOnEle(driver,openKartLinkOnBottom);
	}
	public void openInNewTabopenKartLinkOnBottom()
	{
		RobotUtility.pressDownAndEntr();
	}
	public void clickOnNewSearch()
	{
		newSearch.click();
	}
	public void confirmProductIsSearched()
	{
		boolean stepPassed = false;
		try {Products_meeting_the_search_criteria.isDisplayed();stepPassed=true; }
		catch (Exception e) {UtilClass.printutil(Products_meeting_the_search_criteria+e.getMessage()+" line number51 Home page ");}
		Assertions.assertThat(stepPassed);
	}
	public void Select_category_id(String string)
	{
		Select_category_id.click();
		SelectUtils.selectByText(string,Select_category_id_selections);
	}
	public void Select_category_idByValue(String string)
	{
		SelectUtils.selectByValue(string,Select_category_id);
	}
	public void clickOnSearch_in_product_descriptions()
	{
		Search_in_product_descriptions.click();
	}
	public void clickOnSearch_in_subcategories()
	{
		Search_in_subcategories.click();
	}
	public void clickOnSeachButton()
	{
		searchbutton.click();
	}
	public void searchwithString(String string)
	{
		search.sendKeys(string);
	}
	public void clickOnLogin()
	{
		Login.click();
	}
	public void clickOnMyAccount()
	{
		My_Account.click();
	}
	public WebElement getMy_Account() {
		return My_Account;
	}
	public WebElement getLogin() {
		return Login;
	}
	
	

}
