package OddEvenNumber;

import java.util.Scanner;

public class SumOfEvenNumber
{
	public static void main(String[] args)
	  {
		  int n,sum=0;
		  System.out.println("Enter Range");
			Scanner a=new Scanner(System.in);
			n=a.nextInt();
			a.close();
			
			//if(n%2==0)
			{
			for(int i=0;i<=n;i=i+2)
			{
				sum=sum+i;
			}
			System.out.println("Sum of Even Number is :"+sum);
			}
			//else
			{
			// System.out.println("please Enter even number");
			}
	  }
}
