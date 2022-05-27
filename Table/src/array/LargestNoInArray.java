package array;

public class LargestNoInArray {
	
	public static void main(String[] args) {
		
		int temp;
		
		int a[]= {10,20,30,40,50};
		int b=a.length;
		
		for (int i=0; i<b; i++)
		{
			for (int j= i+1; j<b; j++)
			{
				if (a[i]>a[j])       // FOR LARGEST NO
				{
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
									
			}
		}
		
		System.out.println("the largest no is= " +a[b-1]);

 
		
		int x[]= {20,5,45,25,50};
		int y= x.length;
		 
		for (int i=0; i<y; i++)
		{
			for (int j=i+1; j<y; j++)
			{
				if(x[i]<x[j])
				{
					temp=x[i];
					x[i]= x[j];
					x[j]= temp;
				}
 
			}
		}
		
		System.out.println("the smallest no is = "+ x[y-1]);
		
		
		
		
		
		
		
	}

}
