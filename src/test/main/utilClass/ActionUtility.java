package utilClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtility 
{
	static Actions act ;
	
	public static void rightClickOnEle(WebDriver driver, WebElement Ele)
	{
		act = new Actions(driver);
		act.contextClick(Ele).build().perform();
	}
	public static void doubleClickOnEle(WebDriver driver, WebElement Ele)
	{
		act = new Actions(driver);
		act.doubleClick(Ele).build().perform();
		
	}
	public static void keyPress(WebDriver driver)
	{
		act = new Actions(driver);
		act.sendKeys(Keys.DOWN).release().sendKeys(Keys.ENTER).release().build().perform();
		
	}
	public static void moveToElement(WebDriver driver,WebElement ele)
	{
		act = new Actions(driver);
		act.moveToElement(ele).build().perform();
	}

}
