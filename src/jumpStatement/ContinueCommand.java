package jumpStatement;

public class ContinueCommand {

	public static void main(String[] args) 
	{

		for(int i=1;i<=10;i++)
		{
			if(i==5)                     // Skip i=5 and directly jump to the i=6
				continue;
			System.out.print(" "+i);
		}
		System.out.println(" for loop exited");
	

	}

}
