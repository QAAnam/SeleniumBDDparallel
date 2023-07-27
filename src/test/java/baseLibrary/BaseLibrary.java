package baseLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import enums.Propertiestype;
import utilClass.PropUtility;

public class BaseLibrary
{
	public static WebDriver driver;
	
	public static WebDriver initializeDriver()
	{
		if (PropUtility.getValueFromCinfig(Propertiestype.browser).equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
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
		
		
		
		return driver;
		
	}
	public static WebDriver getinitializedDriver()
	{
		return driver;
	}

}
