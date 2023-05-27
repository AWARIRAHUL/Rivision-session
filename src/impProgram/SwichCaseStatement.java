package impProgram;

public class SwichCaseStatement 
 {
	public static void main(String[] args)
	{
		int day;
		
		switch(day=3)
		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
		    System.out.println("Monday");
		    break;
		case 3:
	         System.out.println("Tuesday");
	         break;
	   
		default :
			System.out.println("Wrong Input for day");
	         
		
		}
		
	}

}
