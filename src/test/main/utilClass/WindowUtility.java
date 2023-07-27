package utilClass;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowUtility 
{
	public static WebDriver switchToWindow(WebDriver driver, String Text)
	{
		Set<String> wh = driver.getWindowHandles();
		for(String s : wh)
		{
			driver.switchTo().window(s);
			WaitUtility.waitByMSecond(3000);
			if(driver.getTitle().equalsIgnoreCase(Text))
				{
					return driver;
				}
		}
		return driver;
	}

}
