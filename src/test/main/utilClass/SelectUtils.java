package utilClass;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtils
{
	public static void selectByVisibleText(String Text,WebElement ele)
	{
		Select select = new Select(ele);
		select.selectByVisibleText(Text);
	}
	public static void selectByValue(String Text,WebElement ele)
	{
		Select select = new Select(ele);
		select.selectByValue(Text);
	}
	public static void selectByText(String Text,List<WebElement> ele)
	{
		Iterator<WebElement> itr = ele.iterator();
		while(itr.hasNext())
		{
			WebElement ele1=itr.next();
			if(ele1.getText().equalsIgnoreCase(Text))
			{
				ele1.click();
				break;
			}
		}
	}

}
