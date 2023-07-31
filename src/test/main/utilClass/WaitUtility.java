package utilClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;

public class WaitUtility
{
	public static void waitByMSecond(int sec)
	{
		
		try {Thread.sleep(sec);}catch (InterruptedException e) { UtilClass.printutil("waiting");}
	}
	public static void waitByClickable(WebDriver driver,WebElement element)
	{
		
		try 
		{
			WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(30));
			myWait.until(ExpectedConditions.elementToBeClickable(element));
		}
		catch (Exception e) { UtilClass.printutil("Error in web driver wait  line 22");e.printStackTrace();}
	}
	
}
