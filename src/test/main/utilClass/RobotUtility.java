package utilClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

public class RobotUtility 
{
	static Robot robo;
	
	public static void pressDownAndEntr()
	{
		try {
			robo= new Robot();
			robo.keyPress(KeyEvent.VK_DOWN);
			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_DOWN);
			robo.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
