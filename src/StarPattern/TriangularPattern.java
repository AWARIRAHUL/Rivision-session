package StarPattern;

public class TriangularPattern 
{
	
		public static void main(String[] args)
	{
		int i,j,k;
		for(i=1;i<=4;i++)               //rows
		{
			for(j=4;j>i;j--)           // Space  
			{
				System.out.print("  ");
			}
			for(k=1;k<=i;k++)           // columns  
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}

}
