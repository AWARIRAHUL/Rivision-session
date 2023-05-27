package controlStatement;

public class IfNested
{
	public static void main(String[] args) 
	{
		int age=10;
		int weight=42;
		if(age>18)
		{
			if(weight>50)
			{
				System.out.println(" you are eligible for blood donate");
			}
		}
		else
		        System.out.println(" you are not eligible for blood donate");
	}

}
