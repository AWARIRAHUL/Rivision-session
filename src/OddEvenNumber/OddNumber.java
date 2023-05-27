package OddEvenNumber;

import java.util.Scanner;

public class OddNumber 
{
  public static void main(String[] args)
  {
	  int n;
	  System.out.println("Enter any Number");
		Scanner a=new Scanner(System.in);
		n=a.nextInt();
		a.close();
		for(int i=1;i<=n;i=i+2)
		{
			
			System.out.print(" "+i);
		}
	     
}
}
