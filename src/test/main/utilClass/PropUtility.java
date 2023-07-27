package utilClass;
import enums.Propertiestype;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public final class PropUtility 
{
	private PropUtility() {}
	
	private static Properties prop = new Properties();
	private static Map<String, String> map = new HashMap<String, String>();
		
	static
	{
		File f = new File(System.getProperty("user.dir")+"/src/test/resources/resourceFiles/config.properties");
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream(f);
		} 
		catch (FileNotFoundException e) 
		{
			UtilClass.printutil("eroor in fis = new FileInputStream(f); "+e.getMessage());
			System.exit(0);
			
		}
		
		try 
		{
			prop.load(fis);
		} catch (IOException e)
		{
			
			e.printStackTrace();
			System.exit(0);
		}
		prop.entrySet().forEach(e->map.put(String.valueOf(e.getKey()), String.valueOf(e.getValue())));
		
	}
	public static String getValueFromCinfig(String key)
	{
		return map.get(key);
	}
	public static String getValueFromCinfig(Propertiestype key)
	{
		return map.get(key.name().toLowerCase());
	}
	
	
}

