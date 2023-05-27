package array;

public class Missing_NumberArray
{
	public static void main(String[] args)
	{
		//array should not have dublicate
		 
		
		
		int array[]= {1,2,3,10};  
		int arl[]=new int[11];
		
		for(int a:array)
		{
			arl[a]=1;
		}
		for(int i=1;i<arl.length;i++)
		{
			if(arl[i]==0)
			{
			System.out.print(i+" ");
			}
		}
		
	}

}
