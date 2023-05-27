package OddEvenNumber;

import java.util.Scanner;

public class ReverseNumber
{
	public static void main(String[] args)
	{
		int n,r;
		System.out.println("Enter Number");
		Scanner a=new Scanner(System.in);
		n=a.nextInt();
		a.close();
		
		while(n>0) 
		{
			r=n%10;
			n=n/10;
			System.out.print(r);
		}
		
	}

}
