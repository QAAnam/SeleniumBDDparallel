package stepDefinations;

import org.openqa.selenium.WebDriver;

import baseLibrary.BaseLibrary;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import pages.TimeAndDatePage;
import utilClass.ActionUtility;

public class WirteTimeAndDateInExcel {
	WebDriver driver;
	TimeAndDatePage timendate;
	@Given("User is one Time and date web")
	public void user_is_one_time_and_date_web() {
		this.driver=BaseLibrary.getinitializedDriver();
		timendate=new TimeAndDatePage();
		driver.get("https://www.timeanddate.com/");
	}

	@Given("User move to weather")
	public void user_move_to_weather() {
		timendate.mooveToElement();
	}

	@When("User click on world wide")
	public void user_click_on_world_wide() {
		timendate.clickToElementWorldWide();
	}

	@When("User Import data")
	public void user_import_data() {
		timendate.writeTable();

	}

	@Then("User read imported data and print")
	public void user_read_imported_data_and_print() {
		timendate.printTable();
		
	}

}
