package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import baseLibrary.BaseLibrary;
import enums.Propertiestype;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilClass.PropUtility;
import utilClass.UtilClass;

public class Hooks
{
	WebDriver driver;
	@Before
	public void setUp()
	{
		BaseLibrary.initializeDriver();
		driver=BaseLibrary.getinitializedDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(PropUtility.getValueFromCinfig(Propertiestype.url));
	}
	@After
	public void tearDown()
	{
		try {Thread.sleep(2000);}
		catch (InterruptedException e) { UtilClass.printutil("waiting");}
		driver.quit();
	}
}
