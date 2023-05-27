package controlStatement;

import java.util.Scanner;

public class IfelseifLadder
{
	public static void main(String[] args)
	{
		
		Scanner a=new Scanner(System.in);
		
		System.out.println("Enter the numer");
		
		int day=a.nextInt();
		
		if(day==1) 
		 {
			System.out.println("Sunday");
			
		 }
		 else if(day==2)
		 {
			System.out.println("Monday");
		 }
		 else if(day==3)
		 {
			 System.out.println("Tuesday");
		 }
		
		 else if(day==4)
		 {
			 System.out.println("Wednesday");
		 }
		 else if(day==5)
		 {
			 System.out.println("Thrusday");
		 }
		 else if(day==6)
		 {
			 System.out.println("Friday");
		 }
		 else if(day==7)
		 {
			 System.out.println("Saturday");
		 }
		 else
		 {
			 System.out.println("Wrong input for day");
		 }
		a.close();
	}

}
