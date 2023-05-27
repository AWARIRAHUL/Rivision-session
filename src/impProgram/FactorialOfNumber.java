package impProgram;

import java.util.Scanner;

public class FactorialOfNumber 
{
	public static void main(String[] args)
	{
		int n,fact=1;                                 // n=3 
		 System.out.println("Enter any Number");
			Scanner a=new Scanner(System.in);
			n=a.nextInt();
			a.close();
	      
			for(int i=1;i<=n;i++)           //i=1          i=2             i=3          i=4
			{
				fact=fact*i;             //fact=1*1=1    fact=1*2=2    fact=2*3=6      fact=6*4=24
			}
			
			
			System.out.println("Factorial is: "+fact);
	}

}

	//Factorial Of Number means= Multiplication of all +ve integers smaller than or equal to given number





