package stepDefinations;

import io.cucumber.java.en.*;

public class Login 
{
	@Given("User has navigated to login page")
	public void User_has_navigated_to_login_page()
	{
		
	}
	
	@When("User enter valid {string} to user field")
	public void user_enter_valid_to_user_field(String string)
	{
	   
	}

	@When("User has entered valid password {string} in password")
	public void user_has_entered_valid_password_in_password(String string) 
	{
	  
	}

	@When("User click on continue button")
	public void user_click_on_continue_button() 
	{
	    
	}

	@Then("User should successfully logged in")
	public void user_should_successfully_logged_in() 
	{
	   
	}

	@When("User enter invalid {string} to user field")
	public void user_enter_invalid_to_user_field(String string)
	{
	   
	}

	@When("User has entered invalid password {string} in password")
	public void user_has_entered_invalid_password_in_password(String string)
	{
	    
	}

	@Then("User should get error {string}")
	public void user_should_get_error(String string)
	{
	    
	}

	@When("User enter null {string} to user field")
	public void user_enter_null_to_user_field(String string) 
	{
		
	}

	@When("User has entered null password {string} in password")
	public void user_has_entered_null_password_in_password(String string)
	{
	    
	}

}
