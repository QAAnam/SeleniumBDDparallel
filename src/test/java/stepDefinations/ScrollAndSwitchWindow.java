package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseLibrary.BaseLibrary;
import io.cucumber.java.en.*;
import pages.HomePage;
import static utilClass.WaitUtility.*;

import java.util.List;

import utilClass.JsUtility;
import utilClass.WindowUtility;

public class ScrollAndSwitchWindow 
{ 
	WebDriver driver;
	HomePage home;
	@Given("User is on home page")
	public void user_is_on_home_page() 
	{
		this.driver=BaseLibrary.getinitializedDriver();
		home = new HomePage(driver);
		waitByMSecond(1200);
	}

	@Given("User scroll down to OpenCart")
	public void user_scroll_down_to_open_cart()
	{
		home.scrollToopenKartLinkOnBottom();
		waitByMSecond(1200);
	}

	@Given("User right click")
	public void user_right_click()
	{
		home.rightclickOpenCart();
		waitByMSecond(1200);
	}

	@Given("Open in new tab")
	public void open_in_new_tab()
	{
		home.openInNewTabopenKartLinkOnBottom();
		waitByMSecond(1200);
	}

	@When("User switch to open tab")
	public void user_switch_to_open_tab() 
	{
		this.driver=WindowUtility.switchToWindow(driver, "OpenCart - Open Source Shopping Cart Solution");
		waitByMSecond(1200);
	}

	@When("User scroll to view all button and click")
	public void user_scroll_to_view_all_button_and_click()
	{
		List<WebElement> ele = driver.findElements(By.xpath("//a[text()='Visit All'][1]"));
		while(ele.isEmpty()||ele.contains(null))
		{
			JsUtility.scrollToText(driver);
			ele = driver.findElements(By.xpath("//a[text()='Visit All'][1]"));
		}
		driver.findElement(By.xpath("//a[text()='Visit All'][1]")).click();
		waitByMSecond(1200);
	}

	@When("User reached to page with title {string}")
	public void user_reached_to_page_with_title(String string) 
	{
		this.driver=WindowUtility.switchToWindow(driver, string);
		waitByMSecond(1200);
	}

	@Then("User come back to parent window")
	public void user_come_back_to_parent_window()
	{
		this.driver=WindowUtility.switchToWindow(driver, "Your Store");
		waitByMSecond(1200);
	}

	@Then("scroll up to webElement {int}")
	public void scroll_up_to_web_element(Integer int1)
	{
		home.scrollTocontactnum();
		waitByMSecond(1200);
	}

}
