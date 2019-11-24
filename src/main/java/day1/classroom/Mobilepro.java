package day1.classroom;

public class Mobilepro {

	public Boolean call(String name)
	{
		System.out.println(name);
		return true;
	}
	
	public void sms(String value)
	{
		System.out.println(value);
		
	}


public static void main(String[] args)
{
	Mobilepro mobile =new Mobilepro();
	mobile.call("karthik");
	mobile.sms("value");
	
}
}
