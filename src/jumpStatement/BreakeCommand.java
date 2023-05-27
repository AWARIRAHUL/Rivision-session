package jumpStatement;

public class BreakeCommand 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
				break;
			System.out.print(" "+i);
		}
		System.out.println(" for loop exited");
		
	}

}
