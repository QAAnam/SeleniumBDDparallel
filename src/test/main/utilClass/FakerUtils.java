package utilClass;

import com.github.javafaker.Faker;

public class FakerUtils 
{
	static Faker fake=new Faker();
	public static String getFname() 
	{
		return String.valueOf(fake.name().firstName());
	}
	public static String getLname() 
	{
		return String.valueOf(fake.name().firstName());
	}
	public static String getMnumber() 
	{
		return String.valueOf(fake.number().digits(10));
	}
	public static String getEmail() 
	{
		return String.valueOf(fake.internet().emailAddress());
	}


}
