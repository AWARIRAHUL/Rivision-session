package StarPattern;

public class DecrementPattern 
{
	public static void main(String[] args)
	{
		int i,j;
		for(i=5;i>=1;i--)               //rows
		{
			for(j=1;j<=i;j++)           // columns  
			{
				System.out.print(" * ");
			}
			System.out.print("\n");
		}
	}
}
