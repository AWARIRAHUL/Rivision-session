package impProgram;

import java.util.Scanner;

public class ArmstrongNumber 
{
	
	
   public static void main(String[] args)
   {
	   int rem,arm=0,n;                                    // n=153
	   System.out.println("Enter Number");
		Scanner a=new Scanner(System.in);
		n=a.nextInt();
		a.close();
		int c=n;                                            //c=153
		while(n>0)                                         //n=153                 n=15               n=1
		{
			rem=n%10;                                      //rem=3             = 5                = 1
			arm=(rem*rem*rem)+arm;                        //arm =3*3*3+0=27    = 5*5*5+27=152     = 1*1*1+152=153
			n=n/10;                                      // n= 153/10=15       = 15/10=1          = 1/10 = 0
		}
		if(c==arm) 
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstron Number");
	
   }
}

//Armstrong number means=If number of three digits is an integer such that the sum of the cubes of its digits
	//is equal to the number itself.
	// There are six armstrong number between 0 to 999 that is =0,1,153,370,371,407
	//for ex. 371=(3^3)+(7^3)+(1^3)=27+343+3
