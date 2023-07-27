package utilClass;

public class WaitUtility
{
	public static void waitByMSecond(int sec)
	{
		
		try {Thread.sleep(sec);}catch (InterruptedException e) { UtilClass.printutil("waiting");}
	}
	
}
