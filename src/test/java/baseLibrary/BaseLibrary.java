package baseLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import enums.Propertiestype;
import utilClass.LogUtils;
import utilClass.PropUtility;


public class BaseLibrary
{
	public static WebDriver driver;
	

	public static WebDriver initializeDriver()
	{
		if (PropUtility.getValueFromCinfig(Propertiestype.browser).equalsIgnoreCase("chrome"))
		{
			LogUtils.getLogger(BaseLibrary.class).info(" line number "+ Thread.currentThread().getStackTrace()[1].getLineNumber() + "is being executed ");
			
			ChromeOptions options = new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");
		    driver = new ChromeDriver(options);
		}
		else if (PropUtility.getValueFromCinfig(Propertiestype.browser).equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		else if (PropUtility.getValueFromCinfig(Propertiestype.browser).equalsIgnoreCase("edge"))
		{
			driver= new EdgeDriver();
		}
		else
		{
			driver = new ChromeDriver();
		}
		
		
		LogUtils.getLogger(BaseLibrary.class).info(" line number "+ Thread.currentThread().getStackTrace()[1].getLineNumber() + "is being executed ");
		return driver;
		
	}
	public static WebDriver getinitializedDriver()
	{
		LogUtils.getLogger(BaseLibrary.class).info(" line number "+ Thread.currentThread().getStackTrace()[1].getLineNumber() + "is being executed ");
		return driver;
	}

}
