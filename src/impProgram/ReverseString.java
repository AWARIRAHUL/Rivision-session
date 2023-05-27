 package impProgram;

public class ReverseString
{
	public static void main(String[] args)
	{
		int i;
		String r= "Rahul Awari"; // String is starting from zero
		String r2="";
	int	l=r.length();            //but length is counting from one
	System.out.println("Length of the string "+l);
	for(i=l-1;i>=0;i--)          // i=l-1
	{
		r2= r2+r.charAt(i);
	}
	System.out.println(r2);
		
	     
		
	}

}
