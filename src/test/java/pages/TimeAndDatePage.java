package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;
import utilClass.ActionUtility;
import utilClass.ExcelUtility;
import utilClass.WaitUtility;

public class TimeAndDatePage {
	WebDriver driver;
	
	public TimeAndDatePage()
	{
		this.driver=BaseLibrary.getinitializedDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Weather' and @class='site-nav__title']")
	private WebElement Weather;
	@FindBy(xpath = "//a[text()='Worldwide' and @class='site-nav__link']")
	private WebElement WorldWide;
	@FindBy(xpath = "//tr//td")
	private List<WebElement> Table;
	
	public void mooveToElement()
	{
		WaitUtility.waitByClickable(driver, Weather);
		ActionUtility.moveToElement(driver, Weather);
	}
	
	public void clickToElementWorldWide()
	{
		WaitUtility.waitByClickable(driver, WorldWide);
		WorldWide.click();
	}
	public List<String> getTable()
	{
		List<String> li=new ArrayList<String>();
		for(WebElement ele:Table)
		{
			li.add(ele.getText().toString());
		}
		return li;
		
	}
	public void writeTable()
	{
		ExcelUtility.writeExcelWithList(getTable(), 4, "WeaterWorldWide.xlsx");
	}
	public void printTable()
	{
		ExcelUtility.printMap("WeaterWorldWide.xlsx");
	}
	
	

}
