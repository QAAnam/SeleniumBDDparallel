package stepDefinations;
import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import baseLibrary.BaseLibrary;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import utilClass.FakerUtils;
import utilClass.UtilClass;
import static utilClass.WaitUtility.*;
public class Register
{
	private WebDriver driver;
	String str=FakerUtils.getEmail();

	@Given("User navigated to register page")
	public void user_navigated_to_register_page()
	{
		driver=BaseLibrary.getinitializedDriver();
		waitByMSecond(500);		
		driver.findElement(By.linkText("My Account")).click();
		waitByMSecond(500);
		driver.findElement(By.linkText("Register")).click();
		waitByMSecond(500);
		
	}

	@When("User enter below details")
	public void user_enter_below_details(DataTable dataTable) 
	{
		Map<String, String> entry = dataTable.asMap();
		driver.findElement(By.name("firstname")).sendKeys(entry.get("firstName"));
		waitByMSecond(500);
		driver.findElement(By.name("lastname")).sendKeys(entry.get("lastName"));
		waitByMSecond(500);
		
		driver.findElement(By.name("email")).sendKeys(str);
		waitByMSecond(500);
		driver.findElement(By.name("telephone")).sendKeys(entry.get("telephone"));
		waitByMSecond(500);
		driver.findElement(By.name("password")).sendKeys(entry.get("password"));
		waitByMSecond(500);
		driver.findElement(By.name("confirm")).sendKeys(entry.get("password"));
		waitByMSecond(500);
	}

	@When("User click on privacy policy")
	public void user_click_on_privacy_policy()
	{
		driver.findElement(By.name("agree")).click();
		waitByMSecond(500);
	}

	@When("user click on continue")
	public void user_click_on_continue() 
	{
		assertTrue(driver.findElement(By.name("agree")).isSelected());
		waitByMSecond(500);
		System.out.println(driver.findElement(By.name("agree")).isSelected());
		waitByMSecond(500);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		waitByMSecond(500);
	}

	@Then("User should be created successfully")
	public void user_should_be_created_successfully()
	{
		boolean account_created=false;
		try
		{
			assertTrue(driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText().contains("Your Account Has Been Created!"));
			account_created=true;
			waitByMSecond(500);
		}
		catch (NoSuchElementException e) 
		{
			UtilClass.printutil("no such element from selenium for line 72 assertTrue(driver.findElement(By.xpath(\"//h1[text()='Your Account Has Been Created!']\")).getText().contains(\"Your Account Has Been Created!\")); ");
		}
		catch (java.util.NoSuchElementException e) 
		{
			UtilClass.printutil("no such element from Java for line 72 assertTrue(driver.findElement(By.xpath(\"//h1[text()='Your Account Has Been Created!']\")).getText().contains(\"Your Account Has Been Created!\")); ");
		}
		assertTrue(account_created);
		waitByMSecond(500);
	}

	@When("user click on news letter")
	public void user_click_on_news_letter() 
	{
	    driver.findElement(By.name("newsletter")).click();
	    waitByMSecond(500);
	}

	@Then("User should warned for duplicate email")
	public void user_should_warned_for_duplicate_email()
	{
		System.out.println(driver.findElement(By.xpath("//ul[@class='breadcrumb']/following-sibling::div[1]")).getText());
		waitByMSecond(500);
		assertThat(driver.findElement(By.xpath("//ul[@class='breadcrumb']/following-sibling::div[1]")).getText()).contains("Warning: E-Mail Address is already registered!");
		waitByMSecond(500);
		
	}


}
