package OddEvenNumber;

import java.util.Scanner;

public class PrintEvenNumber
{
	public static void main(String[] args)
	  {
		  int n;
		  System.out.println("Enter any Number");
			Scanner a=new Scanner(System.in);
			n=a.nextInt();
			a.close();
			for(int i=0;i<=n;i=i+2)
			{
				System.out.print(" "+i);
			}
	  }
}
