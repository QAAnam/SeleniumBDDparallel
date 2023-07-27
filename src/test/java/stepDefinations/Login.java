package stepDefinations;

import static org.testng.Assert.assertTrue;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import baseLibrary.BaseLibrary;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import utilClass.UtilClass;

public class Login 
{
	private WebDriver driver;
	private HomePage home;
	private LoginPage loginPage;
	private MyAccountPage myaccount;

	
	@Given("User has navigated to login page")
	public void User_has_navigated_to_login_page()
	{
		this.driver=BaseLibrary.getinitializedDriver();
		home = new HomePage(driver);
		try {Thread.sleep(500);}
		catch (InterruptedException e) { UtilClass.printutil("waiting");}
		home.clickOnMyAccount();
		try {Thread.sleep(500);}
		catch (InterruptedException e) { UtilClass.printutil("waiting");}
		home.clickOnLogin();
		try {Thread.sleep(500);}
		catch (InterruptedException e) { UtilClass.printutil("waiting");}
	}
	
	@When("User enter valid {string} to user field")
	public void user_enter_valid_to_user_field(String string)
	{
	   loginPage= new LoginPage(driver);
	   try {Thread.sleep(500);}
		catch (InterruptedException e) { UtilClass.printutil("waiting");}
	   loginPage.enterEmail(string);
	   try {Thread.sleep(500);}
		catch (InterruptedException e) { UtilClass.printutil("waiting");}
	}

	@When("User has entered valid password {string} in password")
	public void user_has_entered_valid_password_in_password(String string) 
	{
		loginPage.enterPassword(string);
		try {Thread.sleep(500);}
		catch (InterruptedException e) { UtilClass.printutil("waiting");}
	}

	@When("User click on continue button")
	public void user_click_on_continue_button() 
	{
		loginPage.clickOnSubmit();
		try {Thread.sleep(500);}
		catch (InterruptedException e) { UtilClass.printutil("waiting");}
	}

	@Then("User should successfully logged in")
	public void user_should_successfully_logged_in() 
	{
		myaccount=new MyAccountPage(driver);
		try {Thread.sleep(500);}
		catch (InterruptedException e) { UtilClass.printutil("waiting");}
		boolean display=false;
		try 
		{
			display = myaccount.getChange_your_password().isDisplayed();					
		}
		catch(NullPointerException e )
		{
			Assertions.assertThat(loginPage.getAlertMassage().contains("Warning: No match for E-Mail Address and/or Password."));
		}
		assertTrue(display);
		try {Thread.sleep(500);}
		catch (InterruptedException e) { UtilClass.printutil("waiting");}
		
	}

	@When("User enter invalid {string} to user field")
	public void user_enter_invalid_to_user_field(String string)
	{
		loginPage =new LoginPage(driver);
		loginPage.enterEmail(string);
		try {Thread.sleep(500);}
		catch (InterruptedException e) { UtilClass.printutil("waiting");}
	}

	@When("User has entered invalid password {string} in password")
	public void user_has_entered_invalid_password_in_password(String string)
	{
		loginPage.enterPassword(string);
		try {Thread.sleep(500);}
		catch (InterruptedException e) { UtilClass.printutil("waiting");}
	}

	@Then("User should get error {string}")
	public void user_should_get_error(String string)
	{
		Assertions.assertThat(loginPage.getAlertMassage().contains("Warning: No match for E-Mail Address and/or Password."));
		try {Thread.sleep(500);}
		catch (InterruptedException e) { UtilClass.printutil("waiting");}
	}

	@When("User enter null {string} to user field")
	public void user_enter_null_to_user_field(String string) 
	{
		loginPage =new LoginPage(driver);
		loginPage.enterEmail(string);
		try {Thread.sleep(500);}
		catch (InterruptedException e) { UtilClass.printutil("waiting");}
	}

	@When("User has entered null password {string} in password")
	public void user_has_entered_null_password_in_password(String string)
	{
		loginPage.enterPassword(string);
		try {Thread.sleep(500);}
		catch (InterruptedException e) { UtilClass.printutil("waiting");}
	}

}
