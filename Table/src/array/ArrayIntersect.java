package array;

public class ArrayIntersect
{

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		int b[]= {10,20,50,60,70,80};
		
		for(int i=0; i<a.length; i++)
		{
			for (int j=0; j<b.length; j++)
			{
				if(a[i]==b[j])
				{
					System.out.println("common no in array is "+b[j]);
				}
			}
		}
			
		
		 
		
		
		
	}
}
