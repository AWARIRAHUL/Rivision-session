package impProgram;

import java.util.Scanner;

public class PalindromeNumber 
{
	public static void main(String[] args)
	{
		int n,s=0,r,c;
		System.out.println("Enter any Number");
		Scanner ref=new Scanner(System.in);
		n=ref.nextInt();
		c=n;
		while(n>0)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;	
		}
		if (c==s)
			System.out.println("Palindrome Number");
		else
		    System.out.println("Not Palindrome Number");
			
	}

}
          // Palindrome number Means =A number that remains the same when its digits are reversed.



