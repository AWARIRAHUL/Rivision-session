package impProgram;

import java.util.Scanner;

public class FibonacciSeries
{
	public static void main(String[] args)
	{
		int n,a=0,b=1,c;
		System.out.println("Enter term");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		r.close();
		
		for(int i=1;i<=n;i++)     // i=1           i=2         i=3   ----------------
		{
			System.out.print(" "+a); // a=0           a=1         a=1
			
			c=a+b;                 //c=0+1            c=1+1       c=1+2   
			
			a=b;                  //a=b=1             a=b=1       a=b=2
			
			b=c;                 //b=c=a+b=0+1=1      b=c=2       b=c=3
		}
		
	}
	
// Fibonacci Series means= In which each number is the sum of the two preceding once
}
 