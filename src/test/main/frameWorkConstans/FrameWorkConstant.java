package frameWorkConstans;

import lombok.Getter;

@Getter
public class FrameWorkConstant {
	private FrameWorkConstant() {}
	private static FrameWorkConstant INSATANCE=null;
	public static FrameWorkConstant getINSTANCE()
	{
		if (INSATANCE==null)
		{
			INSATANCE= new FrameWorkConstant();
		}
		
		return INSATANCE;
	}
	
	public String getExcelPath() {
		return ExcelPath;
	}
	private final String ExcelPath= System.getProperty("user.dir")+"\\src\\test\\resources\\resourceFiles\\";

}
