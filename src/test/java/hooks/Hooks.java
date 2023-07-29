package hooks;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

import baseLibrary.BaseLibrary;
import enums.Propertiestype;
import freemarker.template.SimpleDate;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
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
	public void tearDown(Scenario scenario)
	{
		
		SimpleDateFormat d = new SimpleDateFormat("_HH_mm_ss_dd_MM_yyyy");
		String S= d.format(new Date());
		try {Thread.sleep(2000);}
		catch (InterruptedException e) { UtilClass.printutil("waiting");}
		String Senarioname = scenario.getName().replaceAll(" ", "_")+S;
		byte[] ts = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		if(scenario.isFailed()) scenario.attach(ts, "image/png", Senarioname);
		File ts1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{Files.copy(ts1, new File(System.getProperty("user.dir")+"/target/CucumberScreenshots/"+Senarioname+".png"));}
		catch(Exception e) {e.printStackTrace();}
		scenario.attach(S, "text/plain", Senarioname);
		driver.quit();
	}
}
