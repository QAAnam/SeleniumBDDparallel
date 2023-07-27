package stepDefinations;

import org.openqa.selenium.WebDriver;

import baseLibrary.BaseLibrary;
import io.cucumber.java.en.*;
import pages.HomePage;
import static utilClass.WaitUtility.*;

public class Search {
	HomePage home;
	WebDriver driver;

	@Given("User is on HomePage {string}")
	public void user_is_on_home_page(String string) {
		this.driver = BaseLibrary.getinitializedDriver();
		home = new HomePage(driver);

		waitByMSecond(500);
	}

	@Given("User search {string} in page")
	public void user_search_in_page(String string) {
		home.searchwithString(string);

		waitByMSecond(500);
	}

	@When("User Click on search icon")
	public void user_click_on_search_icon() {
		home.clickOnSeachButton();

		waitByMSecond(500);
	}

	@When("user tick Search in product descriptions {string}")
	public void user_tick_search_in_product_descriptions(String string) {
		home.clickOnSearch_in_product_descriptions();

		waitByMSecond(500);
	}

	@When("user tick Search in subcategories {string}")
	public void user_tick_search_in_subcategories(String string) {
		home.clickOnSearch_in_subcategories();
		waitByMSecond(500);
	}

	@When("user select Phones & PDAs \"Phones & PDAs\"from All Categories drop down {string}")
	public void user_select_phones_pd_as_phones_pd_as_from_all_categories_drop_down(String string) {
		home.Select_category_idByValue("24");
		waitByMSecond(500);
	}

	@When("USer click on new search")
	public void u_ser_click_on_new_search() {
		home.clickOnNewSearch();

		waitByMSecond(500);
	}

	@Then("Mobile should be searched sucessfully")
	public void mobile_should_be_searched_sucessfully() {
		home.confirmProductIsSearched();

	}

	@When("user select {string} from All Categories drop down")
	public void user_select_from_All_Categories_drop_down(String string)
	{
		home=new HomePage(driver);
		home.Select_category_id(string);
	}
}
