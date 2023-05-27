package controlStatement;

public class WhileLoop
{
	public static void main(String[] args)
	{
		int i=0;        // Initialization
		while(i<=10)    // condition
		{
			System.out.println(+i);
			i++;          // increment/decrement expression 
		}
		System.out.println("While loop exist,Value of i is :"+i);
		
	}

}
	// When no.of iteration is not fixed,its recommanded to use while loop
	// While loop = Code to be executed when condition is true and then increment/decrement the expression
